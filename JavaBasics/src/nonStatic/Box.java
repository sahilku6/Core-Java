package nonStatic;

public class Box {
	int length;
	int breath;
	
	Box(int length,int breath){
		this.length=length;
		this.breath=breath;
	}
	
//	non-staic method
	public int getArea() {
		return length*breath;
	}
	
	
	//This will give us the error because static methid does not acess non static members
//	public static int getArea() {
//		return length*breath;
//	}
	
	
}
