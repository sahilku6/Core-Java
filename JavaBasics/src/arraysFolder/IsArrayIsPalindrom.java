package arraysFolder;

import java.util.Scanner;


public class IsArrayIsPalindrom {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter the number for array : ");
		
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		
		int left=0;
		int right=size-1;
		boolean isPalindrom=true;
		while(left<right) {
			if(array[left]!=array[right]) {
				isPalindrom=false;
				break;
			}
				left++;
				right--;
		}
		
		System.out.println("Output is : ");
		if(isPalindrom)
			System.out.println("Array is Palindrome");
		else
			System.out.println("Array is not Palindrome");
		
		sc.close();
		
	}
}





/*
public class IsArrayIsPalindrom {
	
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
		
		StringBuilder arrayDigit=new StringBuilder();
				
		for(int num:array) {
			arrayDigit.append(num);
		}
		
		System.out.println("Output is : ");
		int intArrayDigit=Integer.parseInt(arrayDigit.toString());
		isPalindrome(intArrayDigit);

		sc.close();
		
	}
}
*/
