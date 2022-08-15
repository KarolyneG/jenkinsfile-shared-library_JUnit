@Library('jenkinsfile-shared-library_JUnit')_
stage('SayHello') {
//echo 'Hello world'
  echo 'Jenkinsfile'
helloMundo()
}

stage("Test") {
node {
  
  sh "mvn clean test"
    }
}
