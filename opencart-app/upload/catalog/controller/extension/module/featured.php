<?php
class ControllerExtensionModuleFeatured extends Controller {
	public function index($setting) {
		$this->load->language('extension/module/featured');

		$this->load->model('catalog/product');

		$this->load->model('tool/image');
		
		$data['heading_title'] = $setting['name'];

		$data['products'] = array();

		if (!$setting['limit']) {
			$setting['limit'] = 4;
		}

		if (!empty($setting['product'])) {
			$product_data = array();

			foreach ($setting['product'] as $product_id) {
				$product_info = $this->model_catalog_product->getProduct($product_id);

				if ($product_info) {
					$product_data[] = $product_info;
				}
			}

			$products = array_slice($product_data, 0, (int)$setting['limit']);

			foreach ($products as $product) {
				if ($product['image']) {
					$image = $this->model_tool_image->resize(html_entity_decode($product['image'], ENT_QUOTES, 'UTF-8'), $setting['width'], $setting['height']);
				} else {
					$image = $this->model_tool_image->resize('placeholder.png', $setting['width'], $setting['height']);
				}

				if ($this->customer->isLogged() || !$this->config->get('config_customer_price')) {
					$price = $this->currency->format($this->tax->calculate($product['price'], $product['tax_class_id'], $this->config->get('config_tax')), $this->session->data['currency']);
				} else {
					$price = false;
				}

				if ((float)$product['special']) {
					$special = $this->currency->format($this->tax->calculate($product['special'], $product['tax_class_id'], $this->config->get('config_tax')), $this->session->data['currency']);
				} else {
					$special = false;
				}

				if ($this->config->get('config_tax')) {
					$tax = $this->currency->format((float)$product['special'] ? $product['special'] : $product['price'], $this->session->data['currency']);
				} else {
					$tax = false;
				}

				$product_data = array(
					'product_id'  => $product['product_id'],
					'thumb'       => $image,
					'name'        => $product['name'],
					'description' => utf8_substr(strip_tags(html_entity_decode($product['description'], ENT_QUOTES, 'UTF-8')), 0, $this->config->get('theme_' . $this->config->get('config_theme') . '_product_description_length')) . '..',
					'price'       => $price,
					'special'     => $special,
					'tax'         => $tax,
					'minimum'     => $product['minimum'] > 0 ? $product['minimum'] : 1,
					'rating'      => $product['rating'],
					'href'        => $this->url->link('product/product', 'language=' . $this->config->get('config_language') . '&product_id=' . $product['product_id'])
				);

				$data['products'][] = $this->load->controller('product/thumb', $product_data);
			}
		}

		$data['review_status'] = $this->config->get('config_review_status');

		if ($data['products']) {
			return $this->load->view('extension/module/featured', $data);
		}
	}
}
