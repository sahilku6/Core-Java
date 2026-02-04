package exceptionHandling;

import java.util.Scanner;

public class Example4ForThrow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value Of A : ");
		int a=sc.nextInt();
		
		System.out.println("Enter the Value Of B : ");
		int b=sc.nextInt();
		
		if(b==0) {
			throw new ArithmeticException("/ by 0");
		}else {
			System.out.println(a/b);
		}
	}
}
