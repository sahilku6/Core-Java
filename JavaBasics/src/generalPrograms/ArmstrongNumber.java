package generalPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static int mulNum(int num,int idx) {
		int mul=1;
		for(int i=0;i<idx;i++) {
			mul*=num;
		}
		return mul;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
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
			System.out.println("This is Armstrong Number.");
		else
			System.out.println("This is not a Armstrong Number");
		
		sc.close();
	}		
}
