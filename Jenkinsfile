@Library('jenkinsfile-shared-library_JUnit')_
stage('SayHello') {
echo 'Hello world'
helloMundo()
}

stage("PU_SPOCK") {

             sh "mvn clean test"
}
