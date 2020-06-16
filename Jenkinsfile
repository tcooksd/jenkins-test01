import groovy.json.*



node {


    def app



    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout scm
    }

    stage('Provision Dev App') {
        /*
         *
	 *
         *  */

           withCredentials([string(credentialsId: 'tcook01', variable: 'tcook-key')]) {
            String morpheusUrl = 'https://sandbox.morpheusdata.com/api/blueprints'
	    Map<?, ?> postBody =
      [
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
                      "name": "$[userInitials]-$[cloudCode]-$[type]-$[sequence+1035]",
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
                        "vipName": "$[userInitials]-$[cloudCode]-$[type]-$[sequence+1035]",
                        "internalPort": 80,
                        "loadBalancePort": null,
                        "loadBalanceProtocol": "http",
                        "vipHostname": "$[instance.name].localdomain",
                        "name": "$[userInitials]-$[cloudCode]-$[type]-$[sequence+1035]",
                        "id": "",
                        "balanceMode": "leastconnections",
                        "externalPort": 80
                      ],
                      [
                        "externalAddressCheck": false,
                        "protocol": "https",
                        "vipPort": 443,
                        "vipName": "$[userInitials]-$[cloudCode]-$[type]-$[sequence+1035]",
                        "internalPort": 443,
                        "loadBalancePort": null,
                        "loadBalanceProtocol": "https",
                        "vipHostname": "$[instance.name].localdomain",
                        "name": "$[userInitials]-$[cloudCode]-$[type]-$[sequence+1035]",
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
        ]
      ]
    ]
  ]
],
"name": "tcook-jenkins-test1",
"templateImage": "",
"type": "morpheus",
"config": [
  "isVpcSelectable": true,
  "isEC2": false
],
"image": "/assets/apps/template.png"
]

        }
    }
    }
