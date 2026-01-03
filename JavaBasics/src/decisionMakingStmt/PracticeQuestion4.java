package decisionMakingStmt;

import java.util.Scanner;

public class PracticeQuestion4 {
	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		
		if(num1%2==0)System.out.println("Even");
		else System.out.println("Odd");
		sc.close();
	}
}
