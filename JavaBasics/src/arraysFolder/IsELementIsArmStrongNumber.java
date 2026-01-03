package arraysFolder;

import java.util.Scanner;

public class IsELementIsArmStrongNumber {
	static int mulNum(int num,int idx) {
		int mul=1;
		for(int i=0;i<idx;i++) {
			mul*=num;
		}
		return mul;
	}
	
	static void isArmStrong(int num) {
		int dupNum1=num;
		int dupNum2=num;
		int sum=0;
		int digitCount=0;
		
		while(dupNum1>0) {
			dupNum1/=10;
			digitCount++;
		}
		
		while(num>0) {
			int digit=num%10;
			sum+=mulNum(digit,digitCount);
			num/=10;
		}
		if(dupNum2==sum)
			System.out.println(dupNum2+" This is Armstrong Number.");
		else
			System.out.println(dupNum2+" This is not a Armstrong Number");
		
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
			isArmStrong(array[i]);
		}
		sc.close();
	}	
}
