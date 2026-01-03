package generalPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		boolean isPrime=true;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println(num+" is prime Number");
		else 
			System.out.println(num+" is not prime Number");
		
		
		sc.close();
	}
}
