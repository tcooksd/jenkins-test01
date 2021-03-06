[
  "id": 305,
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
            "name": "tcook-jenkins-apache",
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
                        "showScheduledBackupWarning": false
                      ],
                      "instance": [
                        "layout": [
                          "code": "apache-vmware-2.4-single",
                          "id": 72
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
                            "idName": "VLAN0006 - Infoblox Managed Pool",
                            "pool": [
                              "name": "10.30.26.0/24",
                              "id": 218
                            ],
                            "id": "network-11619",
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
                        "providerMethod": "new"
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
            "showScheduledBackupWarning": false,
            "veeamManagedServer": ""
          ],
          "networkInterfaces": [
            [
              "primaryInterface": true,
              "showNetworkPoolLabel": true,
              "showNetworkDhcpLabel": false,
              "network": [
                "idName": "VLAN0006 - Infoblox Managed Pool",
                "pool": [
                  "id": 218,
                  "name": "10.30.26.0/24"
                ],
                "id": "network-11619",
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
            "providerMethod": "new"
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
            "configEnabled": false,
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
                            "idName": "VLAN0006 - Infoblox Managed Pool",
                            "pool": [
                              "name": "10.30.26.0/24",
                              "id": 218
                            ],
                            "id": "network-11619",
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
            "showScheduledBackupWarning": false,
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
                "idName": "VLAN0006 - Infoblox Managed Pool",
                "pool": [
                  "id": 218,
                  "name": "10.30.26.0/24"
                ],
                "id": "network-11619",
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
            "providerMethod": "new",
            "providerId": -1,
            "groupId": -1
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
  "templateName": "tcook-jenkins-test1",
  "name": "tcook-jenkins-app1",
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
