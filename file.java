pipeline {
    agent any
    stages {
        stage('Preparation') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                echo "Building Project"
            }
        }
        stage('Test') {
            steps {
                echo "Running tests"
            }
        }
    }
}

