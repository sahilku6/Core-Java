package decisionMakingStmt;
import java.util.Scanner;

public class PracticeQuestion1 {
	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(num%5==0 && num%11==0) {
			System.out.println("Number is divisible by both");
		}
		
		else {
			System.out.println("Not Divisible.");
		}
		
		sc.close();
	}

}
