import groovy.json.*



node {

    def app
    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout scm
    }

    constants = load "jsonValues.groovy"

    BlueprintName = "Morpheusdevops"
    AppName = "${BlueprintName}01"


//    stage('Check existing applications') {
//       /* Let's make sure we do not have an app with the same name running */
//        Morpheusret01 = morpheusApp.pullJson("https://sandbox.morpheusdata.com/api/instances", "${tcook-key}")
//        def jsonSlurper = new JsonSlurper()
//        def jsonObject = jsonSlurper.parseText(Morpheusret01)

//        def instances01 = jsonObject.instances
//        def InstanceID01 = ""
//        for ( e in instances01 ) {
//         if ( e.name == "tcook-apache-jenkins01") {
//           InstanceID01 = e.id
//         }
//       }
//       print InstanceID01
//    }



    stage('Provision Blueprint') {

      withCredentials([string(credentialsId: 'tcook-key01', variable: 'tcook-key')]) {
      String morpheusUrl = 'https://sandbox.morpheusdata.com/api/blueprints'
	    Map<?, ?> postBody =
      [
      "image": "/assets/apps/template.png",
      "tiers": [
        "Web": [
          "linkedTiers": [
            "Database"
          ],
          "tierIndex": 1,
          "tier": [
            "bootOrder": 1,
            "lockedFields": [
              "bootOrder"
            ]
          ],
          "instances": [
            [
              "instance": [
                "type": "tcookest"
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
                            "createBackup": false,
                            "jobAction": "new",
                            "jobRetentionCount": "2",
                            "enabled": true,
                            "showScheduledBackupWarning": false
                          ],
                          "instance": [
                            "layout": [
                              "provisionTypeCode": "vmware",
                              "code": "c45c4e7b-d8d4-4914-aa31-70cc4f5d0e89",
                              "instanceVersion": "1",
                              "name": "tcook5919",
                              "id": 1254
                            ],
                            "expireDays": 7,
                            "configEnabled": false,
                            "name": "",
                            "allowExisting": false,
                            "type": "tcookest",
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
                              "maxStorage": 0
                            ]
                          ],
                          "replicationGroup": [
                            "providerMethod": "new"
                          ],
                          "config": [
                            "customOptions": [
                              "tcontier02": "p1ckl3",
                              "tcontier01": "tcook@morpheusdata.com"
                            ],
                            "resourcePoolId": 1080,
                            "createUser": true
                          ],
                          "plan": [
                            "code": "vm-512",
                            "id": 157
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
                            "createBackup": false,
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
                            "configEnabled": false,
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
                              "maxStorage": 0
                            ]
                          ],
                          "replicationGroup": [
                            "providerMethod": "new"
                          ],
                          "config": [
                            "resourcePoolId": 1080,
                            "customOptions": [
                              "root_pw": "p1ckl3"
                            ],
                            "createUser": true
                          ],
                          "plan": [
                            "code": "vm-512",
                            "id": 157
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
      "name": "${BlueprintName}",
      "templateImage": "",
      "type": "morpheus"
    ]
  apptest = morpheusApp.buildApp(morpheusUrl, postBody, "64975bef-1fc5-41b9-93ab-b0114a2b1045")

        //  def jsonSlurper = new JsonSlurper()
        //  def jsonObject = jsonSlurper.parseText(apptest)
          //print jsonObject.blueprint


        }
    }
    stage('Provision Dev App') {

      withCredentials([string(credentialsId: 'tcook-key01', variable: 'tcook-key')]) {
      String morpheusUrl1 = 'https://sandbox.morpheusdata.com/api/apps'
      Map<?, ?> postBody =
      [
        "id": "",
        "tiers": [
          "Web": [
            "instances": [
              [
                "instance": [
                  "type": "tcookest",
                  "cloud": "VMware Demo Cluster",
                  "layout": [
                    "code": "c45c4e7b-d8d4-4914-aa31-70cc4f5d0e89",
                    "id": 1254,
                    "provisionTypeCode": "vmware",
                    "name": "tcook5919",
                    "instanceVersion": "1"
                  ],
                  "expireDays": 7,
                  "configEnabled": false,
                  "name": "",
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
                              "createBackup": false,
                              "jobAction": "new",
                              "jobRetentionCount": "2",
                              "enabled": true,
                              "showScheduledBackupWarning": false
                            ],
                            "instance": [
                              "layout": [
                                "provisionTypeCode": "vmware",
                                "code": "c45c4e7b-d8d4-4914-aa31-70cc4f5d0e89",
                                "instanceVersion": "1",
                                "name": "tcook5919",
                                "id": 1254
                              ],
                              "expireDays": 7,
                              "configEnabled": false,
                              "name": "",
                              "allowExisting": false,
                              "type": "tcookest",
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
                                "maxStorage": 0
                              ]
                            ],
                            "replicationGroup": [
                              "providerMethod": "new"
                            ],
                            "config": [
                              "customOptions": [
                                "tcontier02": "p1ckl3",
                                "tcontier01": "tcook@morpheusdata.com"
                              ],
                              "resourcePoolId": 1080,
                              "createUser": true
                            ],
                            "plan": [
                              "code": "vm-512",
                              "id": 157
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
                  "createBackup": false,
                  "jobAction": "new",
                  "jobRetentionCount": "2",
                  "enabled": true,
                  "showScheduledBackupWarning": false,
                  "veeamManagedServer": ""
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
                    "maxStorage": 0
                  ]
                ],
                "replicationGroup": [
                  "providerMethod": "new"
                ],
                "config": [
                  "customOptions": [
                    "tcontier02": "p1ckl3",
                    "tcontier01": "tcook@morpheusdata.com"
                  ],
                  "resourcePoolId": 1080,
                  "createUser": true
                ],
                "plan": [
                  "code": "vm-512",
                  "id": 157
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
                  "name": "",
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
                              "createBackup": false,
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
                              "configEnabled": false,
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
                                "maxStorage": 0
                              ]
                            ],
                            "replicationGroup": [
                              "providerMethod": "new"
                            ],
                            "config": [
                              "resourcePoolId": 1080,
                              "customOptions": [
                                "root_pw": "p1ckl3"
                              ],
                              "createUser": true
                            ],
                            "plan": [
                              "code": "vm-512",
                              "id": 157
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
                  "createBackup": false,
                  "jobAction": "new",
                  "jobRetentionCount": "2",
                  "enabled": true,
                  "showScheduledBackupWarning": false,
                  "veeamManagedServer": ""
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
                    "root_pw": "p1ckl3"
                  ],
                  "createUser": true
                ],
                "plan": [
                  "id": 158,
                  "code": "vm-1024"
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
                ],
                "workflow": [
                  "taskSetId": 199
                ]
              ]
            ],
            "tierIndex": 2
          ]
        ],
        "templateName": "${BlueprintName}",
        "name": "${AppName}",
        "group": [
          "id": 779,
          "name": "tcook"
        ],
        "environment": "Dev",
        "envCode": "dev",
        "type": "morpheus"
      ]
      apptest2 = morpheusApp.buildApp(morpheusUrl1, postBody, "64975bef-1fc5-41b9-93ab-b0114a2b1045")

      }
    }
}
