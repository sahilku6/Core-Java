package wrapperClasses;

public class MainApp2 {
	public static void main(String[] args) {
		//boxing
		int b=50;
		Integer i2=Integer.valueOf(b);
		System.out.println(i2);
		
		//unboxing
		
		int c=i2.intValue();
		System.out.println(b);
		
		
		byte x=15;
		Byte y=Byte.valueOf(x);
		byte bt=y.byteValue();
		System.out.println(bt);
		
		
	
		int m = 77;
		Integer d=m;	//autoBoxing
		int f=d;		//autoUnBoxing
		System.out.println(f);
	}
}
