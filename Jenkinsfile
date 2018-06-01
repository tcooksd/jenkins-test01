pipeline {

    agent {
        // Equivalent to "docker build -f Dockerfile.build --build-arg version=1.0.2 ./build/
        dockerfile {
            filename 'Dockerfile.build'
            dir 'build'
            label 'tcooksd858/node-web-app'
            additionalBuildArgs  '--build-arg version=1.0.2'
        }
    }


    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
