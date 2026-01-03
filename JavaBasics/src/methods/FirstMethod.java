package methods;

public class FirstMethod {
	
	public void method1() {
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		FirstMethod obj=new FirstMethod();
		obj.method1();
		System.out.println("Bye");
	}
}
