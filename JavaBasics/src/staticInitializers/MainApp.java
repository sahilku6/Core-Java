package staticInitializers;

public class MainApp {
	
	static {
		System.out.println("Hello I am from first static-block");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello I am from Main Method");
	}
	
	static {
		System.out.println("Hello I am from second static-block");
	}
}
