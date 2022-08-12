@Library('jenkinsfile-shared-library_JUnit')_
stage('SayHello') {
echo 'Hello world'
helloMundo()
}

stage("Test") {
node {
  sh "mvn clean"
  sh "mvn compile"
  sh "mvn clean test"
    }
}
