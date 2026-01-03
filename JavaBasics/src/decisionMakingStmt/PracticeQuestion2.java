package decisionMakingStmt;

import java.util.Scanner;

public class PracticeQuestion2 {
	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Num1 is largest");
            } 
            if(num1 < num3) {
                System.out.println("Num3 is largest");
            }
        } 
		if(num1<num2) {
            if (num2 > num3) {
                System.out.println("Num2 is largest");
            }
            if(num2 > num3) {
                System.out.println("Num3 is largest");
            }
        }
		
		sc.close();
		
	}
}
