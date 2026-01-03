package generalPrograms;

import java.util.Scanner;

public class FactorOfNumber {
	
	static void factor(int num) {
		System.out.print("Factor of "+num+" is : ");
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.print(i+",");
			}
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		factor(num);
		
		sc.close();
	}
}
