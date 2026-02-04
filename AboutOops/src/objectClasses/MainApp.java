package objectClasses;

public class MainApp {
	public static void main(String[] args) {
		//toString 
		/*Phone p=new Phone(5,5);
		System.out.println(p);*/
		
		ToEquals te = new ToEquals("Kavya",1);
		ToEquals te2 = new ToEquals("Kavya",1);
		
		System.out.println(te.equals(te2));
		System.out.println(te == te2);
		System.out.println(te.hashCode() == te2.hashCode());
	}
}



	