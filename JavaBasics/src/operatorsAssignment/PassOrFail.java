package operatorsAssignment;

public class PassOrFail {
	public static void main(String[] args) {
		float attandace=85.5f;
		int marks=45;
		
		String res=(marks>=40 && attandace>=75.0f)?"Pass":"Fail";
		
		if(res.equals("Pass")){
			marks+=5;
		}
		
		System.out.println("Result is : "+ res +", and marks is : "+marks);
		
	}
}
