package arraysFolder;

import java.util.Scanner;

public class isPalindromeElement {
	
	static void isPalindrome(int num){
		int dupNum=num;
		int digit=0;
		while(num>0) {
			int rem=num%10;
			digit=digit*10+rem;
			num/=10;
		}
		
		if(digit==dupNum)
			System.out.println(dupNum+" is Palindrome Number");
		else
			System.out.println(dupNum+" is not Palindrome Number");

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
			isPalindrome(array[i]);
		}
		sc.close();
		
	}
}
