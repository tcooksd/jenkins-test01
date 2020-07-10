import groovy.json.*



node {


    def app



    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout scm
    }

    constants = load "jsonValues.groovy"

    stage('Provision Blueprint') {

      withCredentials([string(credentialsId: 'tcook01', variable: 'tcook-key')]) {
      String morpheusUrl = 'https://sandbox.morpheusdata.com/api/blueprints'
	    Map<?, ?> postBody =
      [
        "image": "/assets/apps/template.png",
        "tiers": [
          "App": [
            "linkedTiers": [],
            "tierIndex": 1,
            "instances": [
              [
                "instance": [
                  "type": "apache"
                ],
                "environments": [
                  "Dev": [
                    "groups": [
                      "tcook": [
                        "clouds": [
                          "VMware Demo Cluster": [
                            "backup": [
                              "backupRepository": 2,
                              "createBackup": true,
                              "jobAction": "new",
                              "jobRetentionCount": "2",
                              "enabled": true,
                              "showScheduledBackupWarning": true,
                              "providerBackupType": -1,
                              "veeamManagedServer": ""
                            ],
                            "instance": [
                              "layout": [
                                "code": "apache-vmware-2.4-single",
                                "id": 72,
                                "provisionTypeCode": "vmware",
                                "name": "VMware Apache on Ubuntu 14.04",
                                "instanceVersion": "2.4"
                              ],
                              "expireDays": 7,
                              "configEnabled": false,
                              "name": "",
                              "allowExisting": false,
                              "type": "apache",
                              "userGroup": [
                                "id": ""
                              ]
                            ],
                            "networkInterfaces": [
                              [
                                "primaryInterface": true,
                                "showNetworkPoolLabel": true,
                                "showNetworkDhcpLabel": false,
                                "network": [
                                  "idName": "VLAN0002 - Internal Server",
                                  "pool": [
                                    "id": 171,
                                    "name": "10.30.20.0/22"
                                  ],
                                  "id": "network-11615",
                                  "hasPool": true
                                ]
                              ]
                            ],
                            "loadBalancer": [
                              [
                                "externalAddressCheck": false,
                                "protocol": "http",
                                "vipPort": 80,
                                "vipName": "",
                                "internalPort": 80,
                                "loadBalancePort": null,
                                "loadBalanceProtocol": "http",
                                "vipHostname": "",
                                "name": "",
                                "id": "",
                                "balanceMode": "leastconnections",
                                "externalPort": 80
                              ],
                              [
                                "externalAddressCheck": false,
                                "protocol": "https",
                                "vipPort": 443,
                                "vipName": "",
                                "internalPort": 443,
                                "loadBalancePort": null,
                                "loadBalanceProtocol": "https",
                                "vipHostname": "",
                                "name": "",
                                "id": "",
                                "balanceMode": "leastconnections",
                                "externalPort": 443
                              ]
                            ],
                            "volumes": [
                              [
                                "volumeCustomizable": true,
                                "readonlyName": false,
                                "maxIOPS": null,
                                "index": 0,
                                "hasDatastore": false,
                                "minStorage": 2147483648,
                                "vId": 62,
                                "controllerMountPoint": "10:0:4:0",
                                "size": 10,
                                "name": "data",
                                "rootVolume": true,
                                "storageType": 1,
                                "customMaxStorage": false,
                                "datastoreId": "auto",
                                "maxStorage": 10737418240
                              ]
                            ],
                            "replicationGroup": [
                              "providerMethod": "new",
                              "providerId": -1
                            ],
                            "plan": [
                              "code": "vm-1024",
                              "id": 158
                            ],
                            "config": [
                              "resourcePoolId": 1080,
                              "createUser": true
                            ],
                            "group": [
                              "id": 779
                            ],
                            "ports": [
                              [
                                "id": 8,
                                "code": "apache.80",
                                "name": "Http",
                                "shortName": "http",
                                "internalPort": 80,
                                "externalPort": 80,
                                "loadBalancePort": null,
                                "sortOrder": 0,
                                "loadBalanceProtocol": "http",
                                "loadBalance": true,
                                "visible": true
                              ],
                              [
                                "id": 9,
                                "code": "apache.443",
                                "name": "Https",
                                "shortName": "https",
                                "internalPort": 443,
                                "externalPort": 443,
                                "loadBalancePort": null,
                                "sortOrder": 1,
                                "loadBalanceProtocol": "https",
                                "loadBalance": true,
                                "visible": true
                              ]
                            ],
                            "deployment": [
                              "id": 69
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ],
          "Database": [
            "linkedTiers": [],
            "tierIndex": 2,
            "instances": [
              [
                "instance": [
                  "type": "mysql2"
                ],
                "environments": [
                  "Dev": [
                    "groups": [
                      "tcook": [
                        "clouds": [
                          "VMware Demo Cluster": [
                            "backup": [
                              "backupRepository": 2,
                              "veeamManagedServer": "",
                              "createBackup": true,
                              "jobAction": "new",
                              "jobRetentionCount": "2",
                              "enabled": true,
                              "showScheduledBackupWarning": false
                            ],
                            "instance": [
                              "layout": [
                                "provisionTypeCode": "vmware",
                                "code": "313abfe1-8297-4fad-832b-5daba6b9183f",
                                "instanceVersion": "1",
                                "name": "MySQL CentOS VMWare",
                                "id": 967
                              ],
                              "expireDays": 7,
                              "configEnabled": true,
                              "name": "",
                              "allowExisting": false,
                              "type": "mysql2",
                              "userGroup": [
                                "id": ""
                              ]
                            ],
                            "networkInterfaces": [
                              [
                                "ipMode": "",
                                "primaryInterface": true,
                                "showNetworkPoolLabel": true,
                                "showNetworkDhcpLabel": false,
                                "network": [
                                  "idName": "VLAN0002 - Internal Server",
                                  "pool": [
                                    "name": "10.30.20.0/22",
                                    "id": 171
                                  ],
                                  "id": "network-11615",
                                  "hasPool": true
                                ]
                              ]
                            ],
                            "loadBalancer": [],
                            "volumes": [
                              [
                                "vId": 922548,
                                "volumeCustomizable": true,
                                "readonlyName": false,
                                "size": 10,
                                "maxIOPS": null,
                                "name": "root",
                                "rootVolume": true,
                                "storageType": 1,
                                "datastoreId": "auto",
                                "maxStorage": 10737418240
                              ]
                            ],
                            "replicationGroup": [
                              "providerMethod": "new"
                            ],
                            "config": [
                              "resourcePoolId": 1080,
                              "customOptions": [
                                "root_pw": "!lin229f"
                              ],
                              "createUser": true
                            ],
                            "plan": [
                              "code": "vm-1024",
                              "id": 158
                            ],
                            "group": [
                              "id": 779
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ]
        ],
        "name": "tcook-jenkins-test2",
        "templateImage": "",
        "type": "morpheus",
      ]
        	apptest = morpheusApp.buildApp(morpheusUrl, postBody, "117645d1-69ea-4778-bada-429bdbfe03c4")
          def json = JsonOutput.toJson(apptest)
          json = JsonOutput.prettyPrint(json)
          echo jsonOutput.get("success")

        }
    }
    stage('Provision Dev App') {

      withCredentials([string(credentialsId: 'tcook01', variable: 'tcook-key')]) {
      String morpheusUrl1 = 'https://sandbox.morpheusdata.com/api/apps'
      Map<?, ?> postBody =
      [
        "id": "",
        "tiers": [
          "App": [
            "instances": [
              [
                "instance": [
                  "type": "apache",
                  "cloud": "VMware Demo Cluster",
                  "layout": [
                    "code": "apache-vmware-2.4-single",
                    "id": 72,
                    "provisionTypeCode": "vmware",
                    "name": "VMware Apache on Ubuntu 14.04",
                    "instanceVersion": "2.4"
                  ],
                  "expireDays": 7,
                  "configEnabled": false,
                  "name": "tcook-apache-jenkins01",
                  "allowExisting": false,
                  "userGroup": [
                    "id": ""
                  ]
                ],
                "environments": [
                  "Dev": [
                    "groups": [
                      "tcook": [
                        "clouds": [
                          "VMware Demo Cluster": [
                            "backup": [
                              "backupRepository": 2,
                              "veeamManagedServer": "",
                              "createBackup": true,
                              "jobAction": "new",
                              "jobRetentionCount": "2",
                              "enabled": true,
                              "showScheduledBackupWarning": true,
                              "providerBackupType": -1
                            ],
                            "instance": [
                              "layout": [
                                "provisionTypeCode": "vmware",
                                "code": "apache-vmware-2.4-single",
                                "instanceVersion": "2.4",
                                "name": "VMware Apache on Ubuntu 14.04",
                                "id": 72
                              ],
                              "expireDays": 7,
                              "configEnabled": false,
                              "name": "tcook-apache-01",
                              "allowExisting": false,
                              "type": "apache",
                              "userGroup": [
                                "id": ""
                              ]
                            ],
                            "networkInterfaces": [
                              [
                                "primaryInterface": true,
                                "showNetworkPoolLabel": true,
                                "showNetworkDhcpLabel": false,
                                "network": [
                                  "idName": "VLAN0002 - Internal Server",
                                  "pool": [
                                    "name": "10.30.20.0/22",
                                    "id": 171
                                  ],
                                  "id": "network-11615",
                                  "hasPool": true
                                ]
                              ]
                            ],
                            "loadBalancer": [
                              [
                                "externalAddressCheck": false,
                                "protocol": "http",
                                "vipPort": 80,
                                "vipName": "",
                                "internalPort": 80,
                                "loadBalancePort": null,
                                "loadBalanceProtocol": "http",
                                "vipHostname": "",
                                "name": "",
                                "id": "",
                                "balanceMode": "leastconnections",
                                "externalPort": 80
                              ],
                              [
                                "externalAddressCheck": false,
                                "protocol": "https",
                                "vipPort": 443,
                                "vipName": "",
                                "internalPort": 443,
                                "loadBalancePort": null,
                                "loadBalanceProtocol": "https",
                                "vipHostname": "",
                                "name": "",
                                "id": "",
                                "balanceMode": "leastconnections",
                                "externalPort": 443
                              ]
                            ],
                            "volumes": [
                              [
                                "volumeCustomizable": true,
                                "readonlyName": false,
                                "maxIOPS": null,
                                "index": 0,
                                "hasDatastore": false,
                                "minStorage": 2147483648,
                                "vId": 62,
                                "controllerMountPoint": "10:0:4:0",
                                "size": 10,
                                "name": "data",
                                "rootVolume": true,
                                "storageType": 1,
                                "customMaxStorage": false,
                                "datastoreId": "auto",
                                "maxStorage": 10737418240
                              ]
                            ],
                            "replicationGroup": [
                              "providerMethod": "new",
                              "providerId": -1
                            ],
                            "ports": [
                              [
                                "code": "apache.80",
                                "visible": true,
                                "internalPort": 80,
                                "loadBalancePort": null,
                                "loadBalanceProtocol": "http",
                                "sortOrder": 0,
                                "name": "Http",
                                "id": 8,
                                "shortName": "http",
                                "externalPort": 80,
                                "loadBalance": true
                              ],
                              [
                                "code": "apache.443",
                                "visible": true,
                                "internalPort": 443,
                                "loadBalancePort": null,
                                "loadBalanceProtocol": "https",
                                "sortOrder": 1,
                                "name": "Https",
                                "id": 9,
                                "shortName": "https",
                                "externalPort": 443,
                                "loadBalance": true
                              ]
                            ],
                            "plan": [
                              "code": "vm-1024",
                              "id": 158
                            ],
                            "config": [
                              "resourcePoolId": 1080,
                              "createUser": true
                            ],
                            "group": [
                              "id": 779
                            ],
                            "deployment": [
                              "id": 69
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ],
                "backup": [
                  "backupRepository": 2,
                  "veeamManagedServer": "",
                  "createBackup": true,
                  "jobAction": "new",
                  "jobRetentionCount": "2",
                  "enabled": true,
                  "showScheduledBackupWarning": true,
                  "providerBackupType": -1
                ],
                "networkInterfaces": [
                  [
                    "primaryInterface": true,
                    "showNetworkPoolLabel": true,
                    "showNetworkDhcpLabel": false,
                    "network": [
                      "idName": "VLAN0002 - Internal Server",
                      "pool": [
                        "id": 171,
                        "name": "10.30.20.0/22"
                      ],
                      "id": "network-11615",
                      "hasPool": true
                    ]
                  ]
                ],
                "loadBalancer": [
                  [
                    "externalAddressCheck": false,
                    "protocol": "http",
                    "vipPort": 80,
                    "vipName": "",
                    "internalPort": 80,
                    "loadBalancePort": null,
                    "loadBalanceProtocol": "http",
                    "vipHostname": "",
                    "name": "",
                    "id": "",
                    "balanceMode": "leastconnections",
                    "externalPort": 80
                  ],
                  [
                    "externalAddressCheck": false,
                    "protocol": "https",
                    "vipPort": 443,
                    "vipName": "",
                    "internalPort": 443,
                    "loadBalancePort": null,
                    "loadBalanceProtocol": "https",
                    "vipHostname": "",
                    "name": "",
                    "id": "",
                    "balanceMode": "leastconnections",
                    "externalPort": 443
                  ]
                ],
                "volumes": [
                  [
                    "volumeCustomizable": true,
                    "readonlyName": false,
                    "maxIOPS": null,
                    "index": 0,
                    "hasDatastore": false,
                    "minStorage": 2147483648,
                    "vId": 62,
                    "controllerMountPoint": "10:0:4:0",
                    "size": 10,
                    "name": "data",
                    "rootVolume": true,
                    "storageType": 1,
                    "customMaxStorage": false,
                    "datastoreId": "auto",
                    "maxStorage": 10737418240
                  ]
                ],
                "replicationGroup": [
                  "providerMethod": "new",
                  "providerId": -1
                ],
                "ports": [
                  [
                    "code": "apache.80",
                    "visible": true,
                    "internalPort": 80,
                    "loadBalancePort": null,
                    "loadBalanceProtocol": "http",
                    "sortOrder": 0,
                    "name": "Http",
                    "id": 8,
                    "shortName": "http",
                    "externalPort": 80,
                    "loadBalance": true
                  ],
                  [
                    "code": "apache.443",
                    "visible": true,
                    "internalPort": 443,
                    "loadBalancePort": null,
                    "loadBalanceProtocol": "https",
                    "sortOrder": 1,
                    "name": "Https",
                    "id": 9,
                    "shortName": "https",
                    "externalPort": 443,
                    "loadBalance": true
                  ]
                ],
                "plan": [
                  "code": "vm-1024",
                  "id": 158
                ],
                "config": [
                  "resourcePoolId": 1080,
                  "createUser": true
                ],
                "group": [
                  "id": 779
                ],
                "deployment": [
                  "id": 69
                ]
              ]
            ],
            "tierIndex": 1
          ],
          "Database": [
            "instances": [
              [
                "instance": [
                  "type": "mysql2",
                  "cloud": "VMware Demo Cluster",
                  "layout": [
                    "code": "313abfe1-8297-4fad-832b-5daba6b9183f",
                    "id": 967,
                    "provisionTypeCode": "vmware",
                    "name": "MySQL CentOS VMWare",
                    "instanceVersion": "1"
                  ],
                  "expireDays": 7,
                  "configEnabled": true,
                  "name": "tcook-jenkins-mysql01",
                  "allowExisting": false,
                  "userGroup": [
                    "id": ""
                  ]
                ],
                "environments": [
                  "Dev": [
                    "groups": [
                      "tcook": [
                        "clouds": [
                          "VMware Demo Cluster": [
                            "backup": [
                              "backupRepository": 2,
                              "veeamManagedServer": "",
                              "createBackup": true,
                              "jobAction": "new",
                              "jobRetentionCount": "2",
                              "enabled": true,
                              "showScheduledBackupWarning": true
                            ],
                            "instance": [
                              "layout": [
                                "provisionTypeCode": "vmware",
                                "code": "313abfe1-8297-4fad-832b-5daba6b9183f",
                                "instanceVersion": "1",
                                "name": "MySQL CentOS VMWare",
                                "id": 967
                              ],
                              "expireDays": 7,
                              "configEnabled": true,
                              "name": "tcook-mysql01",
                              "allowExisting": false,
                              "type": "mysql2",
                              "userGroup": [
                                "id": ""
                              ]
                            ],
                            "networkInterfaces": [
                              [
                                "ipMode": "",
                                "primaryInterface": true,
                                "showNetworkPoolLabel": true,
                                "showNetworkDhcpLabel": false,
                                "network": [
                                  "idName": "VLAN0002 - Internal Server",
                                  "pool": [
                                    "name": "10.30.20.0/22",
                                    "id": 171
                                  ],
                                  "id": "network-11615",
                                  "hasPool": true
                                ]
                              ]
                            ],
                            "loadBalancer": [],
                            "volumes": [
                              [
                                "vId": 922548,
                                "volumeCustomizable": true,
                                "readonlyName": false,
                                "size": 10,
                                "maxIOPS": null,
                                "name": "root",
                                "rootVolume": true,
                                "storageType": 1,
                                "datastoreId": "auto",
                                "maxStorage": 10737418240
                              ]
                            ],
                            "replicationGroup": [
                              "providerMethod": "new"
                            ],
                            "config": [
                              "resourcePoolId": 1080,
                              "customOptions": [
                                "root_pw": "!lin229f"
                              ],
                              "createUser": true
                            ],
                            "plan": [
                              "code": "vm-1024",
                              "id": 158
                            ],
                            "group": [
                              "id": 779
                            ]
                          ]
                        ]
                      ]
                    ]
                  ]
                ],
                "backup": [
                  "backupRepository": 2,
                  "createBackup": true,
                  "jobAction": "new",
                  "jobRetentionCount": "2",
                  "enabled": true,
                  "showScheduledBackupWarning": true,
                  "veeamManagedServer": "",
                  "providerBackupType": -1
                ],
                "networkInterfaces": [
                  [
                    "ipMode": "",
                    "primaryInterface": true,
                    "showNetworkPoolLabel": true,
                    "showNetworkDhcpLabel": false,
                    "network": [
                      "idName": "VLAN0002 - Internal Server",
                      "pool": [
                        "id": 171,
                        "name": "10.30.20.0/22"
                      ],
                      "id": "network-11615",
                      "hasPool": true
                    ]
                  ]
                ],
                "loadBalancer": [],
                "volumes": [
                  [
                    "vId": 922548,
                    "volumeCustomizable": true,
                    "readonlyName": false,
                    "size": 10,
                    "maxIOPS": null,
                    "name": "root",
                    "rootVolume": true,
                    "storageType": 1,
                    "datastoreId": "auto",
                    "maxStorage": 10737418240
                  ]
                ],
                "replicationGroup": [
                  "providerMethod": "new"
                ],
                "config": [
                  "resourcePoolId": 1080,
                  "customOptions": [
                    "root_pw": "!lin229f"
                  ],
                  "createUser": true
                ],
                "plan": [
                  "code": "vm-1024",
                  "id": 158
                ],
                "group": [
                  "id": 779
                ],
                "ports": [
                  [
                    "name": "",
                    "port": "",
                    "lb": ""
                  ]
                ]
              ]
            ],
            "tierIndex": 2
          ]
        ],
        "templateName": "tcook-jenkins-test2",
        "name": "tcook-app2",
        "group": [
          "id": 779,
          "name": "tcook"
        ],
        "environment": "Dev",
        "envCode": "dev",
        "type": "morpheus",
        "config": [
          "isEC2": false,
          "isVpcSelectable": true
        ]
      ]

    //    echo morpheusApp.buildApp(morpheusUrl1, postBody, "117645d1-69ea-4778-bada-429bdbfe03c4")
     }
   }
  // stage('Provision deployment') {

  //   withCredentials([string(credentialsId: 'tcook01', variable: 'tcook-key')]) {
//     String morpheusUrl2 = 'https://sandbox.morpheusdata.com/api/instances/10150/deploy'
  //   Map<?, ?> postBody =

  //  }
//   }
  }
