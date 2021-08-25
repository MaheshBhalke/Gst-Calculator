pipeline{
	agent any
	stages{
		stage('compile stage'){
			steps{
				withMaven(maven : 'maven_3_6_3'){
					sh 'mvn clean compile'
						
				}	
			}
		}
		stage('testing stage'){
			steps{
				withMaven(maven : 'maven_3_6_3'){
					sh 'mvn test'
						
				}	
			}
		}
		
		stage('deployment stage'){
			steps{
				withMaven(maven : 'maven_3_6_3'){
					sh 'mvn deploy'
						
				}	
			}
		}
	}
}