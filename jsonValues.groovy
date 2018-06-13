blueprintName = "test01"
postBody01 = [
 "image": "/assets/apps/template.png",
  "tiers": [
    "App": [
      "linkedTiers": [],
      "instances": [
        [
          "backup": [
            "createBackup": true
          ],
          "metadata": [
            [
              "name": "",
              "value": ""
            ]
          ],
          "instance": [
            "cloud": "VMware",
            "layout": [
              "code": "docker-1.7-single",
              "id": 217
            ],
            "name": "front-end01",
            "allowExisting": true,
            "type": "docker"
          ],
          "environments": [
            "Dev": [
              "groups": [
                "VMware": [
                  "clouds": [
                    "VMware": [
                      "planObj": [
                        "code": "container-128",
                        "customCores": false,
                        "coresPerSocket": null,
                        "hasDatastore": false,
                        "maxMemory": 134217728,
                        "customCoresPerSocket": false,
                        "rootStorageTypes": [],
                        "addVolumes": false,
                        "customMaxStorage": false,
                        "id": 80,
                        "storageTypes": [
                          [
                            "volumeType": "disk",
                            "code": "standard",
                            "resizable": false,
                            "editable": false,
                            "maxIOPS": null,
                            "deletable": false,
                            "displayOrder": 1,
                            "minStorage": null,
                            "hasDatastore": true,
                            "description": "Standard",
                            "externalId": null,
                            "customSize": true,
                            "configurableIOPS": false,
                            "optionTypes": [],
                            "version": null,
                            "enabled": true,
                            "defaultType": true,
                            "autoDelete": true,
                            "name": "Standard",
                            "id": 1,
                            "customLabel": true,
                            "maxStorage": null,
                            "volumeOptionSource": null,
                            "minIOPS": null
                          ]
                        ],
                        "value": 80,
                        "maxStorage": 1073741824,
                        "supportsAutoDatastore": true,
                        "memoryOptions": [],
                        "maxDisks": null,
                        "coreOptions": [],
                        "maxDisk": null,
                        "cpuOptions": [],
                        "maxCpu": null,
                        "datastores": [],
                        "customMaxDataStorage": false,
                        "minDisk": 1,
                        "lvmSupported": true,
                        "customMaxMemory": false,
                        "noDisks": false,
                        "autoOptions": null,
                        "rootCustomSizeOptions": [],
                        "maxCores": null,
                        "rootDiskCustomizable": false,
                        "name": "128MB Memory, 1GB Storage",
                        "customCpu": false,
                        "customSizeOptions": [],
                        "customizeVolume": false
                      ],
                      "backup": [
                        "createBackup": false
                      ],
                      "instance": [
                        "layout": [
                          "code": "docker-1.7-single",
                          "id": 217
                        ],
                        "name": "",
                        "allowExisting": false
                      ],
                      "volumes": [
                        [
                          "size": 5,
                          "name": "root",
                          "rootVolume": true,
                          "maxStorage": 0
                        ]
                      ],
                      "config": [
                        "dockerImage": "tcooksd858/node-web-app",
                        "dockerImageVersion": "latest",
                        "expose": 8080,
                        "dockerRegistryId": ""
                      ],
                      "plan": [
                        "id": 82,
                        "code": "container-512"
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ],
          "evars": [
            [
              "name": "",
              "value": ""
            ]
          ],
          "volumes": [
            [
              "size": 3,
              "name": "root",
              "rootVolume": true
            ]
          ],
          "ports": [
            [
              "port": "8080",
              "lb": "",
              "name": "web"
            ]
          ],
          "config": [
            "dockerImage": "tcooksd858/node-web-app",
            "dockerImageVersion": "latest",
            "expose": 8080,
            "dockerRegistryId": ""
          ],
          "plan": [
            "code": "container-256",
            "id": 81
          ]
        ]
      ]
    ],
    "Database": [
      "linkedTiers": [],
      "instances": [
        [
          "backup": [
            "createBackup": true
          ],
          "metadata": [
            [
              "name": "",
              "value": ""
            ]
          ],
          "instance": [
            "cloud": "VMware",
            "layout": [
              "code": "mysql-5.7-single",
              "id": 90
            ],
            "name": "mysql-01",
            "allowExisting": true,
            "type": "mysql"
          ],
          "workflow": [
            "taskSetId": 38
          ],
          "environments": [
            "Dev": [
              "groups": [
                "VMware": [
                  "clouds": [
                    "VMware": [
                      "planObj": [
                        "code": "container-128",
                        "customCores": false,
                        "coresPerSocket": null,
                        "hasDatastore": false,
                        "maxMemory": 134217728,
                        "customCoresPerSocket": false,
                        "rootStorageTypes": [],
                        "addVolumes": false,
                        "customMaxStorage": false,
                        "id": 80,
                        "storageTypes": [
                          [
                            "volumeType": "disk",
                            "code": "standard",
                            "resizable": false,
                            "editable": false,
                            "maxIOPS": null,
                            "deletable": false,
                            "displayOrder": 1,
                            "minStorage": null,
                            "hasDatastore": true,
                            "description": "Standard",
                            "externalId": null,
                            "customSize": true,
                            "configurableIOPS": false,
                            "optionTypes": [],
                            "version": null,
                            "enabled": true,
                            "defaultType": true,
                            "autoDelete": true,
                            "name": "Standard",
                            "id": 1,
                            "customLabel": true,
                            "maxStorage": null,
                            "volumeOptionSource": null,
                            "minIOPS": null
                          ]
                        ],
                        "value": 80,
                        "maxStorage": 1073741824,
                        "supportsAutoDatastore": true,
                        "memoryOptions": [],
                        "maxDisks": null,
                        "coreOptions": [],
                        "maxDisk": null,
                        "cpuOptions": [],
                        "maxCpu": null,
                        "datastores": [],
                        "customMaxDataStorage": false,
                        "minDisk": 1,
                        "lvmSupported": true,
                        "customMaxMemory": false,
                        "noDisks": false,
                        "autoOptions": null,
                        "rootCustomSizeOptions": [],
                        "maxCores": null,
                        "rootDiskCustomizable": false,
                        "name": "128MB Memory, 1GB Storage",
                        "customCpu": false,
                        "customSizeOptions": [],
                        "customizeVolume": false
                      ],
                      "backup": [
                        "createBackup": true
                      ],
                      "instance": [
                        "layout": [
                          "code": "mysql-5.7-single",
                          "id": 90
                        ],
                        "name": "",
                        "allowExisting": false
                      ],
                      "workflow": [
                        "taskSetId": 38
                      ],
                      "volumes": [
                        [
                          "size": 20,
                          "name": "root",
                          "rootVolume": true,
                          "maxStorage": 0
                        ]
                      ],
                      "plan": [
                        "code": "container-2048",
                        "id": 85
                      ],
                      "deployment": [
                        "versionId": 42,
                        "id": 29
                      ],
                      "config": [
                        "rootPassword": "passworde!",
                        "username": "admin",
                        "password": "password!"
                      ]
                    ]
                  ]
                ]
              ]
            ]
          ],
          "evars": [
            [
              "name": "",
              "value": ""
            ]
          ],
          "volumes": [
            [
              "size": 1,
              "name": "root",
              "rootVolume": true
            ]
          ],
          "plan": [
            "code": "container-128",
            "id": 80
          ],
          "config": [
            "rootPassword": "************"
          ],
          "deployment": [
            "versionId": 42,
            "id": 29
          ]
        ]
      ]
    ]
  ],
  "environment": "Dev",
  "templateName": "nodexpress",
  "name": "${blueprintName}",
  "templateImage": "",
  "type": "morpheus",
  "category": "APP",
  "group": [
    "name": "VMware",
    "id": 489
  ]
]



postBody02 = [
"image": "/assets/apps/template.png",
"tiers": [
  "App": [
    "linkedTiers": [],
    "instances": [
      [
        "instance": [
          "type": "docker",
          "cloud": "VMware",
          "layout": [
            "code": "docker-1.7-single",
            "id": 217
          ],
          "name": "",
          "allowExisting": false
        ],
        "planObj": [
          "code": "container-128",
          "customCores": false,
          "coresPerSocket": null,
          "hasDatastore": false,
          "maxMemory": 134217728,
          "customCoresPerSocket": false,
          "rootStorageTypes": [],
          "addVolumes": false,
          "customMaxStorage": false,
          "id": 80,
          "storageTypes": [
            [
              "volumeType": "disk",
              "code": "standard",
              "resizable": false,
              "editable": false,
              "maxIOPS": null,
              "deletable": false,
              "displayOrder": 1,
              "minStorage": null,
              "hasDatastore": true,
              "description": "Standard",
              "externalId": null,
              "customSize": true,
              "configurableIOPS": false,
              "optionTypes": [],
              "version": null,
              "enabled": true,
              "defaultType": true,
              "autoDelete": true,
              "name": "Standard",
              "id": 1,
              "customLabel": true,
              "maxStorage": null,
              "volumeOptionSource": null,
              "minIOPS": null
            ]
          ],
          "value": 80,
          "maxStorage": 1073741824,
          "supportsAutoDatastore": true,
          "memoryOptions": [],
          "maxDisks": null,
          "coreOptions": [],
          "maxDisk": null,
          "cpuOptions": [],
          "maxCpu": null,
          "datastores": [],
          "customMaxDataStorage": false,
          "minDisk": 1,
          "lvmSupported": true,
          "customMaxMemory": false,
          "noDisks": false,
          "autoOptions": null,
          "rootCustomSizeOptions": [],
          "maxCores": null,
          "rootDiskCustomizable": false,
          "name": "128MB Memory, 1GB Storage",
          "customCpu": false,
          "customSizeOptions": [],
          "customizeVolume": false
        ],
        "backup": [
          "createBackup": false
        ],
        "volumes": [
          [
            "size": 10,
            "name": "root",
            "rootVolume": true,
            "maxStorage": 0
          ]
        ],
        "config": [
          "dockerImage": "tcooksd858/node-web-app",
          "dockerImageVersion": "latest",
          "expose": 8080,
          "dockerRegistryId": ""
        ],
        "plan": [
          "id": 83,
          "code": "container-1024"
        ],
        "ports": [
          [
            "name": "",
            "port": "",
            "lb": ""
          ]
        ],
        "metadata": [
          [
            "name": "",
            "value": ""
          ]
        ],
        "evars": [
          [
            "name": "",
            "value": ""
          ]
        ]
      ]
    ]
  ],
  "Database": [
    "linkedTiers": [],
    "instances": [
      [
        "instance": [
          "type": "mysql",
          "cloud": "VMware",
          "layout": [
            "code": "mysql-5.7-single",
            "id": 90
          ],
          "name": "",
          "allowExisting": false
        ],
        "planObj": [
          "code": "container-128",
          "customCores": false,
          "coresPerSocket": null,
          "hasDatastore": false,
          "maxMemory": 134217728,
          "customCoresPerSocket": false,
          "rootStorageTypes": [],
          "addVolumes": false,
          "customMaxStorage": false,
          "id": 80,
          "storageTypes": [
            [
              "volumeType": "disk",
              "code": "standard",
              "resizable": false,
              "editable": false,
              "maxIOPS": null,
              "deletable": false,
              "displayOrder": 1,
              "minStorage": null,
              "hasDatastore": true,
              "description": "Standard",
              "externalId": null,
              "customSize": true,
              "configurableIOPS": false,
              "optionTypes": [],
              "version": null,
              "enabled": true,
              "defaultType": true,
              "autoDelete": true,
              "name": "Standard",
              "id": 1,
              "customLabel": true,
              "maxStorage": null,
              "volumeOptionSource": null,
              "minIOPS": null
            ]
          ],
          "value": 80,
          "maxStorage": 1073741824,
          "supportsAutoDatastore": true,
          "memoryOptions": [],
          "maxDisks": null,
          "coreOptions": [],
          "maxDisk": null,
          "cpuOptions": [],
          "maxCpu": null,
          "datastores": [],
          "customMaxDataStorage": false,
          "minDisk": 1,
          "lvmSupported": true,
          "customMaxMemory": false,
          "noDisks": false,
          "autoOptions": null,
          "rootCustomSizeOptions": [],
          "maxCores": null,
          "rootDiskCustomizable": false,
          "name": "128MB Memory, 1GB Storage",
          "customCpu": false,
          "customSizeOptions": [],
          "customizeVolume": false
        ],
        "backup": [
          "createBackup": true
        ],
        "workflow": [
          "taskSetId": 38
        ],
        "volumes": [
          [
            "size": 20,
            "name": "root",
            "rootVolume": true,
            "maxStorage": 0
          ]
        ],
        "plan": [
          "code": "container-2048",
          "id": 85
        ],
        "config": [
          "password": "************",
          "rootPassword": "************",
          "username": "admin"
        ],
        "deployment": [
          "versionId": 42,
          "id": 29
        ],
        "metadata": [
          [
            "name": "",
            "value": ""
          ]
        ],
        "evars": [
          [
            "name": "",
            "value": ""
          ]
        ]
      ]
    ]
  ]
],
"environment": "Dev",
"templateName": "${blueprintName}",
"name": "tcooktest01",
"templateImage": "",
"type": "morpheus",
"category": "APP",
"group": [
  "id": 489,
  "name": "VMware"
],
"id": "${blueprintid}"
]
