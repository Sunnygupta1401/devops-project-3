pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        withAnt(installation: 'ant', jdk: 'defaultJDK') {
          sh 'sh "ant test"'
        }

      }
    }
  }
}