package generalPrograms;

import java.util.Scanner;

public class FactorialOfNumber {
	
	static int factorial(int num) {
		if(num==0 ||num==1)return 1;

		return num*factorial(num-1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		int res=factorial(num);
		
		System.out.println("Factorial of Number is : "+res);
		
		sc.close();
	}
}
