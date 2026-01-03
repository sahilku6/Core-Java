package playinWithObject;

public class FactoryMethod {
	double length;
	FactoryMethod(){
		
	}
	FactoryMethod(double length){
		this.length=length;
	}
	
	//helper method/ factory method
	public static FactoryMethod createBox() {
		return new FactoryMethod();
	}
	
	public static FactoryMethod createBox(double length) {
		return new FactoryMethod(length);
	}
}
