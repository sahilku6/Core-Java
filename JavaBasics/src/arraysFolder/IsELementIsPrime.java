package arraysFolder;

import java.util.Scanner;

public class IsELementIsPrime {
	static void isPrimeElement(int num) {
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
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter the number for array : ");
		
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Output is : ");
		for(int i=0;i<size;i++) {
			isPrimeElement(array[i]);
		}
		sc.close();
		
	}
}
