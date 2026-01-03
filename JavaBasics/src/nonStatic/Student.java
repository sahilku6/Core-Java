package nonStatic;

public class Student {
	String pan;
	String aadhar;
	String voting;
	
	Student(){
		
	}
	
	Student(String pan){
		this.pan=pan;
	}
	
	Student(String pan,String aadhar){
			this.pan=pan;
			this.aadhar=aadhar;
		}
	
	Student(String pan,String aadhar,String voting){
		this.pan=pan;
		this.aadhar=aadhar;
		this.voting=voting;
	}
	
}
