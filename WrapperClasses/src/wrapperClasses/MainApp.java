package wrapperClasses;

public class MainApp {
	public static void main(String[] args) {
//		Boxing
		int a=20;
		Integer i=new Integer(a);
		System.out.println(i);
		
		int b=50;
		Integer i2=Integer.valueOf(b);
		System.out.println(i2);
		
		//AutoBoxing
		int c=100;
		Integer i3=c;
		System.out.println(i3);
	}
}
