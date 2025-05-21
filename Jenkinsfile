pipeline {
    agent any

    environment {
        IMAGE_NAME = 'docker/tic-tac-toe'       // usuarioDocker/nombreImagen
        IMAGE_TAG = 'latest'
        DOCKER_HUB_CREDENTIALS = 'docker'       // id de las credenciales Docker configuradas en Jenkins
    }

    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${IMAGE_NAME}:${IMAGE_TAG}")
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', DOCKER_HUB_CREDENTIALS) {
                        docker.image("${IMAGE_NAME}:${IMAGE_TAG}").push()
                    }
                }
            }
        }
    }
}
