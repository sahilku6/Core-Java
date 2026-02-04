package AnonomousClass;

public class Student {
	String name;
	
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
	
	public void display() {
		System.out.println("Hello Sahil ");
	}
}
