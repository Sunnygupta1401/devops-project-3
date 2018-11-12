pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        withAnt(installation: 'ant', jdk: 'LocalJDK') {
          withAnt()
        }

      }
    }
  }
}