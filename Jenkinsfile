pipeline {
    agent any

    stages {
        stage('Remove Previous React Settings') {
            steps {
                dir('dev/FE/outvite') {
                    script {
                        sh 'npm cache clean --force'
                        sh 'rm -rf node_modules'
                    }
                }
            }
        }

        stage('React Build') {
            steps {
                dir('dev/FE/outvite') {
                    script {
                        sh 'npm install' 
                        sh 'npm run build'
                    }
                }
            }
        }
        
        stage('Remove Previous SpringBoot Settings') {
            steps {
                dir('dev/BE/outvite') {
                    script {
                        sh 'gradle wrapper'
                        sh 'rm -rf target'
                    }
                }
            }
        }

        stage('SpringBoot Build') {
            steps {
                dir('dev/BE/outvite') {
                    script {
                        sh './gradlew clean build'
                    }
                }
                dir('dev/BE') {
                    script {
                        sh 'mv ./outvite/build/libs/*SNAPSHOT.jar outvite.jar'
                    }
                }
            }
        }

        stage('Remove Previous SpringBoot Docker') {
            steps {
                dir('dev/BE') {
                    script {
                        sh 'docker stop be || true'
                        sh 'docker rm be || true'
                        sh 'docker rmi ibe || true'
                    }
                }
            }
        }

        stage('Spring Docker Build and Run') {
            steps {
                dir('dev/BE') {
                    script {
                        sh 'docker build -t ibe .'
                        sh 'docker run -p 8081:8081 -d --name be ibe'
                    }
                }
            }
        }
    }
}