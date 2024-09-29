pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Add build commands here, e.g., 'mvn clean install' for Maven projects
                sh 'make' // Replace with your build command
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
                // Add test commands here, e.g., 'mvn test' for Maven projects
                sh 'make test' // Replace with your test command
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add deployment commands here, e.g., 'kubectl apply -f deployment.yaml'
                sh 'deploy.sh' // Replace with your deploy script or command
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }

        failure {
            echo 'Pipeline failed.'
        }

        always {
            echo 'Pipeline finished.'
        }
    }
}
