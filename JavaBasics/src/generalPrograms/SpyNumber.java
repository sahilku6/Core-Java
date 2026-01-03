package generalPrograms;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int dupNum=num;
		int mul=1;
		int sum=0;
		while(num>0) {
			sum+=num%10;
			mul*=num%10;
			num/=10;
		}
		if(sum==mul)
			System.out.println(dupNum+" is a Spy number.");
		else 
			System.out.println(dupNum+" is not a Spy number.");
		sc.close();
	}
}
