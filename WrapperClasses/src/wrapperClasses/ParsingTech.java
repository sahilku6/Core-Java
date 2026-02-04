package wrapperClasses;

public class ParsingTech {
	public static void main(String[] args) {
		String s="123";
		int a=Integer.parseInt(s);
		System.out.println("Int : "+a);
		
		
		byte b=Byte.parseByte(s);
		System.out.println("Byte : "+b);
		
		
		double c=Double.parseDouble(s);
		System.out.println("Double : "+c);
	}
}
