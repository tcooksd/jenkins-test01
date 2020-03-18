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

           withCredentials([string(credentialsId: 'sandboxaut', variable: 'tcook-key')]) {
            String morpheusUrl = 'https://sandbox.morpheusdata.com/api/app-templates'
	    Map<?, ?> postBody = {
  "id": 242,
  "tiers": {
    "Web": {
      "instances": [
        {
          "instance": {
            "type": "tcookcent01",
            "cloud": "VMware Demo Cluster",
            "layout": {
              "code": "f5f2dfad-0b4e-4f7b-ad6b-1fa9aac0e944",
              "id": 1004,
              "provisionTypeCode": "vmware",
              "name": "tcook01",
              "instanceVersion": "1.0"
            },
            "expireDays": 7,
            "name": "tcook-deployment-test",
            "description": "",
            "allowExisting": false,
            "userGroup": {
              "id": ""
            }
          },
          "environments": {
            "Dev": {
              "groups": {
                "VMware": {
                  "clouds": {
                    "VMware Demo Cluster": {
                      "servicePlanOptions": {
                        "forPlan": 159,
                        "maxCores": 1,
                        "coresPerSocket": 1,
                        "maxMemory": 2147483648
                      },
                      "backup": {
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
                          "code": "f5f2dfad-0b4e-4f7b-ad6b-1fa9aac0e944",
                          "instanceVersion": "1.0",
                          "name": "tcook01",
                          "id": 1004
                        },
                        "expireDays": 7,
                        "name": "tcook-deployment-test",
                        "description": "",
                        "allowExisting": false,
                        "type": "tcookcent01",
                        "userGroup": {
                          "id": ""
                        }
                      },
                      "volumes": [
                        {
                          "volumeCustomizable": true,
                          "readonlyName": false,
                          "controllerId": 507507,
                          "maxIOPS": null,
                          "displayOrder": 0,
                          "unitNumber": null,
                          "minStorage": 2147483648,
                          "configurableIOPS": false,
                          "controllerMountPoint": "507507:0:4:0",
                          "vId": 826327,
                          "size": 20,
                          "name": "root",
                          "rootVolume": true,
                          "storageType": 1,
                          "typeId": 16,
                          "id": 220585,
                          "resizeable": true,
                          "datastoreId": "auto",
                          "maxStorage": 21474836480
                        }
                      ],
                      "ports": [
                        {
                          "port": "80",
                          "lb": "HTTP",
                          "name": "web"
                        }
                      ],
                      "lockedFields": [
                        "loadBalancer.[externalPort:80].vipPort",
                        "loadBalancer.[externalPort:80].enabledCheck"
                      ],
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
                      "loadBalancer": [
                        {
                          "externalAddressCheck": false,
                          "protocol": "HTTP",
                          "vipPort": "80",
                          "internalPort": 80,
                          "vipHostname": "tcook01",
                          "name": "web",
                          "vipShared": "off",
                          "externalAddress": "off",
                          "id": 159,
                          "balanceMode": "leastconnections",
                          "externalPort": 80
                        }
                      ],
                      "layoutSize": 2,
                      "config": {
                        "resourcePoolId": 1080,
                        "createUser": true
                      },
                      "plan": {
                        "code": "vm-2048",
                        "id": 159
                      },
                      "group": {
                        "id": 489
                      },
                      "deployment": {
                        "versionId": 136,
                        "id": 60
                      }
                    }
                  }
                }
              }
            }
          },
          "servicePlanOptions": {
            "forPlan": 159,
            "maxCores": 1,
            "coresPerSocket": 1,
            "maxMemory": 2147483648
          },
          "backup": {
            "createBackup": true,
            "jobAction": "new",
            "jobRetentionCount": "2",
            "enabled": true,
            "showScheduledBackupWarning": false,
            "veeamManagedServer": ""
          },
          "volumes": [
            {
              "volumeCustomizable": true,
              "readonlyName": false,
              "controllerId": 507507,
              "maxIOPS": null,
              "displayOrder": 0,
              "unitNumber": null,
              "minStorage": 2147483648,
              "configurableIOPS": false,
              "controllerMountPoint": "507507:0:4:0",
              "vId": 826327,
              "size": 20,
              "name": "root",
              "rootVolume": true,
              "storageType": 1,
              "typeId": 16,
              "id": 220585,
              "resizeable": true,
              "datastoreId": "auto",
              "maxStorage": 21474836480
            }
          ],
          "ports": [
            {
              "port": "80",
              "lb": "HTTP",
              "name": "web"
            }
          ],
          "lockedFields": [
            "loadBalancer.[externalPort:80].vipPort",
            "loadBalancer.[externalPort:80].enabledCheck"
          ],
          "networkInterfaces": [
            {
              "ipMode": "",
              "primaryInterface": true,
              "showNetworkPoolLabel": true,
              "showNetworkDhcpLabel": false,
              "network": {
                "idName": "VLAN0002 - Internal Server",
                "pool": {
                  "id": 171,
                  "name": "10.30.20.0/22"
                },
                "id": "network-11615",
                "hasPool": true
              }
            }
          ],
          "loadBalancer": [
            {
              "externalAddressCheck": false,
              "protocol": "HTTP",
              "vipPort": "80",
              "internalPort": 80,
              "vipHostname": "tcook01",
              "name": "web",
              "vipShared": "off",
              "externalAddress": "off",
              "id": 159,
              "balanceMode": "leastconnections",
              "externalPort": 80
            }
          ],
          "layoutSize": 2,
          "config": {
            "resourcePoolId": 1080,
            "createUser": true
          },
          "plan": {
            "code": "vm-2048",
            "id": 159
          },
          "group": {
            "id": 489
          },
          "deployment": {
            "versionId": 136,
            "id": 60
          }
        }
      ],
      "tierIndex": 1
    }
  },
  "templateName": "tcook-demo01",
  "name": "tcook-app1",
  "group": {
    "id": 489,
    "name": "VMware"
  },
  "environment": "Dev",
  "envCode": "dev",
  "type": "morpheus",
  "config": {
    "isEC2": false,
    "isVpcSelectable": true
  }
}

    }
