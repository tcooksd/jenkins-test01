{
  "image": "/assets/apps/template.png",
  "tiers": {
    "App": {
      "linkedTiers": [],
      "tierIndex": 2,
      "instances": [
        {
          "instance": {
            "type": "vmware"
          },
          "environments": {
            "Dev": {
              "groups": {
                "All Clouds": {
                  "clouds": {
                    "VMware Demo Cluster": {
                      "backup": {
                        "backupRepository": 1,
                        "veeamManagedServer": "",
                        "createBackup": true,
                        "jobAction": "new",
                        "jobRetentionCount": "2",
                        "enabled": true,
                        "showScheduledBackupWarning": false
                      },
                      "instance": {
                        "layout": {
                          "provisionTypeCode": "vmware",
                          "code": "vmware-1.0-single",
                          "instanceVersion": "1.0",
                          "name": "Vmware VM",
                          "id": 360
                        },
                        "expireDays": 7,
                        "name": "tcook-test1",
                        "allowExisting": false,
                        "type": "vmware",
                        "userGroup": {
                          "id": ""
                        }
                      },
                      "networkInterfaces": [
                        {
                          "ipMode": "",
                          "primaryInterface": true,
                          "showNetworkPoolLabel": true,
                          "showNetworkDhcpLabel": false,
                          "network": {
                            "idName": "VLAN0002 - Internal Server",
                            "pool": {
                              "name": "10.30.20.0/22",
                              "id": 171
                            },
                            "id": "network-11615",
                            "hasPool": true
                          }
                        }
                      ],
                      "loadBalancer": [],
                      "volumes": [
                        {
                          "volumeCustomizable": true,
                          "readonlyName": false,
                          "size": 40,
                          "maxIOPS": null,
                          "name": "root",
                          "rootVolume": true,
                          "storageType": 1,
                          "datastoreId": "auto",
                          "maxStorage": 42949672960
                        }
                      ],
                      "ports": {
                        "lb": "HTTP"
                      },
                      "config": {
                        "createUser": true,
                        "expose": 8080
                      },
                      "plan": {
                        "code": "vm-4096",
                        "id": 160
                      },
                      "group": {
                        "id": 32
                      },
                      "lockedFields": [
                        "instance.name",
                        "instance.layout.id",
                        "networks"
                      ]
                    }
                  }
                }
              }
            }
          }
        }
      ]
    },
    "os": {
      "linkedTiers": [],
      "tierIndex": 3,
      "instances": [
        {
          "instance": {
            "type": "tcookest"
          },
          "environments": {
            "Dev": {
              "groups": {
                "tcook": {
                  "clouds": {
                    "VMware vCenter": {
                      "backup": {
                        "backupRepository": 1,
                        "createBackup": true,
                        "jobAction": "new",
                        "jobRetentionCount": "2",
                        "enabled": true,
                        "showScheduledBackupWarning": false
                      },
                      "instance": {
                        "layout": {
                          "code": "c45c4e7b-d8d4-4914-aa31-70cc4f5d0e89",
                          "id": 1254
                        },
                        "expireDays": "7",
                        "configEnabled": true,
                        "name": "${userInitials}-sb-${account}-${type}-${sequence+4000}",
                        "allowExisting": false,
                        "type": "tcookest",
                        "userGroup": {
                          "id": ""
                        }
                      },
                      "networkInterfaces": [
                        {
                          "ipMode": "",
                          "primaryInterface": true,
                          "showNetworkPoolLabel": false,
                          "showNetworkDhcpLabel": true,
                          "network": {
                            "idName": "VM Network",
                            "pool": {
                              "name": "tcook-testpool1",
                              "id": 163
                            },
                            "id": "network-13",
                            "hasPool": false
                          },
                          "networkInterfaceTypeId": 4,
                          "networkInterfaceTypeIdName": "VMXNET 3"
                        }
                      ],
                      "loadBalancer": [],
                      "volumes": [
                        {
                          "controllerId": 545959,
                          "maxIOPS": null,
                          "displayOrder": 0,
                          "unitNumber": "0",
                          "minStorage": 5368709120,
                          "configurableIOPS": false,
                          "controllerMountPoint": "545959:0:4:0",
                          "vId": 915438,
                          "size": 10,
                          "name": "Hard disk 1",
                          "rootVolume": true,
                          "storageType": 1,
                          "typeId": 16,
                          "id": 316862,
                          "resizeable": true,
                          "datastoreId": "auto",
                          "maxStorage": 5368709120
                        }
                      ],
                      "storageControllers": [
                        {
                          "editable": false,
                          "typeName": "IDE",
                          "maxDevices": 2,
                          "displayOrder": 0,
                          "active": true,
                          "unitNumber": "null",
                          "reservedUnitNumber": -1,
                          "busNumber": "0",
                          "removable": false,
                          "name": "IDE 0",
                          "typeId": 2,
                          "id": 545957,
                          "category": "ide"
                        },
                        {
                          "editable": false,
                          "typeName": "IDE",
                          "maxDevices": 2,
                          "displayOrder": 1,
                          "active": true,
                          "unitNumber": "null",
                          "reservedUnitNumber": -1,
                          "busNumber": "1",
                          "removable": false,
                          "name": "IDE 1",
                          "typeId": 2,
                          "id": 545958,
                          "category": "ide"
                        },
                        {
                          "editable": false,
                          "typeName": "SCSI LSI Logic Parallel",
                          "maxDevices": 15,
                          "displayOrder": 2,
                          "active": true,
                          "unitNumber": "3",
                          "reservedUnitNumber": 7,
                          "busNumber": "0",
                          "removable": false,
                          "name": "SCSI controller 0",
                          "typeId": 4,
                          "id": 545959,
                          "category": "scsi"
                        }
                      ],
                      "config": {
                        "resourcePoolId": "resgroup-22700",
                        "createUser": true
                      },
                      "plan": {
                        "code": "vm-512",
                        "id": 157
                      },
                      "group": {
                        "id": 779
                      }
                    }
                  }
                }
              }
            }
          }
        }
      ]
    },
    "Database": {
      "linkedTiers": [],
      "tierIndex": 4,
      "instances": [
        {
          "instance": {
            "type": "apache"
          },
          "environments": {
            "Dev": {
              "groups": {
                "All Clouds": {
                  "clouds": {
                    "AWS MorpheusDemo": {
                      "backup": {
                        "backupRepository": 1,
                        "veeamManagedServer": "",
                        "createBackup": true,
                        "jobAction": "new",
                        "jobRetentionCount": "2",
                        "enabled": true,
                        "showScheduledBackupWarning": false
                      },
                      "instance": {
                        "layout": {
                          "provisionTypeCode": "docker",
                          "code": "apache-2.4-single",
                          "instanceVersion": "2.4",
                          "name": "Apache Container",
                          "id": 48
                        },
                        "expireDays": 7,
                        "configEnabled": true,
                        "allowExisting": false,
                        "type": "apache"
                      },
                      "loadBalancer": [
                        {
                          "externalAddressCheck": false,
                          "vipPort": 80,
                          "internalPort": 80,
                          "loadBalancePort": null,
                          "vipHostname": "local.localdomain",
                          "vipShared": "off",
                          "externalAddress": "off",
                          "externalPort": 80,
                          "protocol": "http",
                          "loadBalanceProtocol": "http",
                          "name": "lbservice-80",
                          "id": -2,
                          "balanceMode": "leastconnections"
                        },
                        {
                          "externalAddressCheck": false,
                          "protocol": "https",
                          "vipPort": 443,
                          "internalPort": 443,
                          "loadBalancePort": null,
                          "loadBalanceProtocol": "https",
                          "vipHostname": "local.localdomain",
                          "name": "lbservice-443",
                          "vipShared": "off",
                          "externalAddress": "off",
                          "balanceMode": "leastconnections",
                          "externalPort": 443
                        }
                      ],
                      "volumes": [
                        {
                          "volumeCustomizable": false,
                          "readonlyName": false,
                          "size": 1,
                          "name": "data",
                          "index": 0,
                          "rootVolume": true,
                          "hasDatastore": false,
                          "customMaxStorage": false,
                          "maxStorage": 1073741824
                        }
                      ],
                      "ports": [
                        {
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
                        },
                        {
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
                        }
                      ],
                      "plan": {
                        "code": "container-128",
                        "id": 80
                      },
                      "config": {
                        "poolProviderType": "docker",
                        "resourcePoolId": 1372
                      },
                      "group": {
                        "id": 32
                      },
                      "lockedFields": [
                        "plan.id"
                      ]
                    }
                  }
                }
              }
            }
          }
        }
      ]
    }
  },
  "name": "5919-tcook-test",
  "type": "morpheus",
  "config": {
    "isVpcSelectable": false,
    "isEC2": false
  }
}
