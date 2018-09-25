import groovy.json.*



node ('docker-slave') {
    @Library('github.com/tcooksd/blueprint-lib.git@master')

    def app



    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout scm
    }

    constants = load "jsonValues.groovy"

    sh "env | sort"
    /* Setup the naming schema for docker hub to commit new containers */
    sh "git rev-parse HEAD > commit-id"
    def commit_id = readFile('commit-id').trim()
    /* reqjuired to read json formatted data */
    environment {
      LC_ALL = en_US.UTF-8
    }
    /* define template id initial global var */
    def blueprintid = ""
    /* define template name 1*/
    blueprintName = "test01"

    applianceUrl = "https://sandbox.morpheusdata.com"


    stage('Build Template') {
    /*  Build Template
     *  */



        Map<?, ?> postbody = postBody01
      /* Use the morpheusApp module to pars json for current values  */
        Morpheusret01 = buildAppJson(postbody)

        println Morpheusret01


    }
  }
