package hasARelationshipPractice;

public class Student {
	private String name;
	
	Student(){
	
	}
	Student(String name){
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Address address=new Address("Phagwara","Punjab",144401);

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}

