pipeline {
    agent any
    stages { 
        stage("Build"),   #gaurav first pipline
            steps {
                echo 'Hello World First applicaation Build...'
            }
        }
    
    stages { 
        stages("Test")
            steps {
                echo 'Hello World First application Test...'
            }
        }
    stages { 
        stages("Deploy")  
            steps {
                echo 'Hello World First application Deploy...'
            }
        }
}        
