package staticInitializers;

public class NonStaticInitilizer {
	{
		System.out.println("Hello I am from first static-block");
	}
	
	NonStaticInitilizer(){
		System.out.println("Hello I am from second static-block");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello I am from Main Method");
		NonStaticInitilizer NSI=new NonStaticInitilizer();
	}
	
	
}
