package decisionMakingStmt;

import java.util.Scanner;

public class PracticeQuestion7 {
	public static void main(String[] args) {
		System.out.println("Enter the char : ");
		Scanner sc=new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
			System.out.println("Char is in uppercase");
		else if(ch>='a' && ch<='z')
			System.out.println("Char is in lowercase");
		else if(ch>='0' && ch<='9')
			System.out.println("Char is digit");
		else
			System.out.println("Char is in Sepcial Charactor");
		
		sc.close();
	}
}
