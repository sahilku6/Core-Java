package decisionMakingStmt;

import java.util.Scanner;

public class PracticeQuestion3 {
	public static void main(String[] args) {
		System.out.println("Enter the char : ");
		Scanner sc=new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonent");
		}
		
		sc.close();
	}
}
