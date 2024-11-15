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
                        sh '. /etc/profile.d/gradle.sh'
                        sh 'gradle wrapper'
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

    }
}