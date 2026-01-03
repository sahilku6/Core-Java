package nonStatic;

public class ConstructorChaning {
	String pan;
	String aadhar;
	String voting;
	
	ConstructorChaning(){
		
	}
	
	ConstructorChaning(String pan){
		this();
		this.pan=pan;
	}
	
	ConstructorChaning(String pan,String aadhar){
			this(pan);
			this.aadhar=aadhar;
		}
	
	ConstructorChaning(String pan,String aadhar,String voting){
		this(pan,aadhar);
		this.voting=voting;
	}

}
