pipeline {
    agent any

    environment {
        DOCKER_BUILDKIT = '1'
        IMAGE_NAME = 'docker/tic-tac-toe'
        DOCKER_CREDENTIALS_ID = 'Credencial-DockerHub' // ID de tus credenciales en Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'feature/test',
                    url: 'https://github.com/J-uds/tic-tac-toe.git',
                    credentialsId: 'Credencial-Git'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${IMAGE_NAME}:latest")
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', "${DOCKER_CREDENTIALS_ID}") {
                        docker.image("${IMAGE_NAME}:latest").push()
                    }
                }
            }
        }
    }
}
