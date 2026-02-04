package AnonomousClass;

public class StudentMainApp {
	public static void main(String[] args) {
		Student s1=new Student("Sahil") {		// Anonomous Class
			public void display() {
				System.out.println("Hello Everyone...");
			}
		};
		s1.display();
	}
}
