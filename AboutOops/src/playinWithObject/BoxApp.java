package playinWithObject;

class Box{
	
}
class Bottle{
	
}

public class BoxApp {
	public static void main(String[] args) {
		Box a1=new Box();
		Box a2=new Box();
		
		printRef(a1);
		printRef(a2);
		
		Bottle b1=new Bottle();
		printRef(b1);
		

	}
	
	public static void printRef(Box b) {
		System.out.println(b);
	}
	public static void printRef(Bottle b) {
		System.out.println(b);
	}

}
