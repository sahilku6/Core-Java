package generalPrograms;

import java.util.Scanner;

public class FactorialOfDigit {
	
	static int factorial(int num) {
		if(num==0 ||num==1)return 1;

		return num*factorial(num-1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		
		while(num>0) {
			int digit=num%10;
			int res=factorial(digit);
			System.out.println("Factorial of Number "+digit +" is : "+res);
			num/=10;
		}
		
		
		sc.close();
	}
}
