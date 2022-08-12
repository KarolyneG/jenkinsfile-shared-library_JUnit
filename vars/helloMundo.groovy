#!/usr/bin/env groovy

//def call(String name = 'human') {
//  echo "Hello, ${name}."
//} 

def call() {
    def msg = sh (
        returnStdout: true,
        script: "echo Hello"
    )
    msg += " World"
    return msg
}
