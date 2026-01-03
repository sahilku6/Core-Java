package decisionMakingStmt;

import java.util.Scanner;

public class PracticeQuestion5 {
	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(num>0 ||num<0) {
			if(num==0)
				System.out.println("num is equals to zero");
			if(num>0)
				System.out.println("num is positive");
			if(num<0)
				System.out.println("num is negative");

		}
		sc.close();
	}
}
