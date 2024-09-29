pipline{
    agent any
    parameter
            choice("")
            booleanParan("")
        
    }
        stages{
           stage("build"){
              steps{
                echo 'Building the application'
                 }
        }    
          }