pipeline{
    agent any
    tools{ 
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {
        stage("build") {
            steps {
                echo 'building the application....'
            }
        }
        stage("test") {
            steps {
                echo 'testing the application....'
            }
        }
        stage("deploy") {
            steps {
                echo 'deploying the application....'
            }
        }

    }
}
