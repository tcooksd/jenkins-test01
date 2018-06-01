pipeline {

    agent none
    stages{
      stage ('Container Build') {
        agent { dockerfile
            filename 'Dockerfile.build'
            dir 'build'
            label 'tcooksd858/node-web-app'
            additionalBuildArgs  '--build-arg version=1.0.2'
        }
      }

     stage('Example') {
            steps {
                echo 'Hello World'
            }
      }
    }
}
