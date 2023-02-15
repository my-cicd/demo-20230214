pipeline {
    agent {
        label 'ubuntu'
    }

//     environment {
//     }

//     options{
//         skipDefaultCheckout()
//     }

    stages {
        stage('Checkout') {
            steps {
                echo '----------'
                echo env.GIT_BRANCH
                echo env.BRANCH_NAME
                echo env.GIT_URL
                echo '----------'
                sh 'env'
            }
        }
    }
}
