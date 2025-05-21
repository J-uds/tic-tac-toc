pipeline {
    agent any

    environment {
        DOCKER_BUILDKIT = '0'                            // Desactiva BuildKit
        IMAGE_NAME = 'judsdev/tic-tac-toe'               // Cambia por tu usuario real de DockerHub
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
                    sh 'docker build -t $IMAGE_NAME:latest .'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'Credencial-DockerHub', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USERNAME')]) {
                    sh '''
                        echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
                        docker push $IMAGE_NAME:latest
                    '''
                }
            }
        }
    }
}
