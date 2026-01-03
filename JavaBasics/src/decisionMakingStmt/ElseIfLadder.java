package decisionMakingStmt;

public class ElseIfLadder {
	public static void main(String[] ags) {
		int a=15;
		int b=15;
		
		if(a==b) 
			System.out.println("Both are equal");
		else if(a>b)
			System.out.println(a+" is largest");
		else 
			System.out.println(b+" is largest");
	}
}
