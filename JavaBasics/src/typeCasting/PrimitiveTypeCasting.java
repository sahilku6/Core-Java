package typeCasting;

public class PrimitiveTypeCasting {
	
	public static void main(String[] args) {
		
		//Widening typeCating
		int num1=150;
		double num2=num1;
		System.out.println(num2);
		
		//Narroiwing typeCating		
		double num3=150.156;
		int num4=(int)num3;
		System.out.println(num4);
		
	}
}
