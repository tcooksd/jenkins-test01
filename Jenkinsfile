import groovy.json.*

node ('docker-slave') {

    def app

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout([$class: 'GitSCM',
          branches: [[name: 'master/ansible-integration']],
          extensions: [[$class: 'WipeWorkspace']],
          userRemoteConfigs: [[url: 'git@github.com:tcooksd/jenkins-test01.git']]
      ])
    }
}
