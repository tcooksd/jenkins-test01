import groovy.json.*

node ('docker-slave') {

    checkout scm 

    stage('setup') {
      sh "env | sort"
      sh "git branch -vv"
    }
}
