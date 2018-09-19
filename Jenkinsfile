import groovy.json.*

node ('docker-slave') {

    stage('setup') {
      sh "env | sort"
      sh "git branch -vv"
    }
}
