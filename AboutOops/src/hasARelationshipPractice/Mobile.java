package hasARelationshipPractice;

public class Mobile {
	private String mobileName;
	
	Mobile(String mobileName){
		this.mobileName=mobileName;
		
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	
	
	Sim sim=new Sim("7282015056","Airtel");

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	
}
