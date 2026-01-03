package aboutEncapsulation;

public class Outter {
	class Inner{
		static void display() {
			System.out.println("Static-Method");
		}
		
		void display1() {
			System.out.println("Non Static-Method");
		}
		
	}
}
