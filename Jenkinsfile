import groovy.json.*

node ('docker-slave') {

    def app



    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout scm
    }

    constants = load "jsonValues.groovy"

    /* Setup the naming schema for docker hub to commit new containers */
    sh "git rev-parse HEAD > commit-id"
    def commit_id = readFile('commit-id').trim()
    /* reqjuired to read json formatted data */
    environment {
      LC_ALL = en_US.UTF-8
    }
    /* define template id initial global var */
    def blueprintid = ""
    /* define template name */
    blueprintName = "test01"

    applianceUrl = "https://sandbox.morpheusdata.com"



    stage('Build Template') {
    /*  Build Template
     *  */
      withCredentials([string(credentialsId: 'sandboxauth', variable: 'bearer')]) {
      String morpheusUrl = "${applianceUrl}/api/app-templates"
      Map<?, ?> postbody = postBody01
      /* Use the morpheusApp module to pars json for current values  */
      Morpheusret01 = morpheusApp.pullJson(morpheusUrl, "${bearer}")

      def jsonSlurper = new JsonSlurper()
      def jsonObject = jsonSlurper.parseText(Morpheusret01)
      def blueprint = jsonObject.appTemplates

      /* Check to see if template exists */
      def availblueprnt = ""
      for ( e in blueprint ) {
        if ( e.name == "${blueprintName}" ) {
          availblueprnt = e.name
        }
      }

      if ( availblueprnt == "${blueprintName}") {
        echo "Blueprint is already available. " + availblueprnt
      } else {
        getid = morpheusApp.buildApp(morpheusUrl, postbody, "${bearer}")
        def jsonObject01 = jsonSlurper.parseText(getid)
        blueprintid = jsonObject01.appTemplate.id

      }
    }
  }

    stage('Provision Dev App') {
      withCredentials([string(credentialsId: 'sandboxauth', variable: 'bearer')]) {
        String morpheusUrl01 = "${applianceUrl}/api/apps"
        Map<?, ?> postBody = postBody02
      echo morpheusApp.buildApp(morpheusUrl01, postBody, "${bearer}")
      }
    }

}
