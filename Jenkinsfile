pipeline {
  agent any
  stages {
    
    stage('Build') {
        agent { docker {
            reuseNode true
            image 'maven:3.6.3-jdk-8' }
        }
      steps {

          sh 'mvn clean install cobertura:cobertura -Dcobertura.report.format=xml'


      }
    }
    stage('Static Code Analysis'){
      steps {
        withMaven(maven: 'M3', jdk: 'jdk8') {
          sh 'mvn  verify sonar:sonar -Dsonar.projectName=demo -Dsonar.projectKey=demo -Dsonar.projectVersion=$BUILD_NUMBER';
        }
      }
    }
    stage('Result') {
      steps {
        archiveArtifacts 'target/*.jar'
        junit '**/target/surefire-reports/TEST-*.xml'
        cobertura coberturaReportFile: '**/target/site/cobertura/coverage.xml'

      }
    }

  }
}
