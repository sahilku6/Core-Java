package abstractionInJava;

public class MainApp {
	public static void main(String[] args) {
		
		/*Dog d=new Dog();
		d.sound();*/
		//upcast
		Animal a1=new Dog();
		a1.walk();
		a1.sound();
	}
}
