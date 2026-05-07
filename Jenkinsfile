pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                bat '"C:\\apache-maven-3.9.15\\bin\\mvn.cmd" clean compile'
            }
        }

        stage('Test') {
            steps {
                bat '"C:\\apache-maven-3.9.15\\bin\\mvn.cmd" test'
            }
        }

        stage('Package') {
            steps {
                bat '"C:\\apache-maven-3.9.15\\bin\\mvn.cmd" package'
            }
        }

    }
}