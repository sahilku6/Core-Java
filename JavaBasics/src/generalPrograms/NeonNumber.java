package generalPrograms;

import java.util.Scanner;

public class NeonNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int squareNum=num*num;
		int digitSum=0;
		
		while(squareNum>0) {
			digitSum+=squareNum%10;
			squareNum/=10;
		}
		if(digitSum==num)
			System.out.println("This is Neon Number.");
		else
			System.out.println("This is not a Neon Number");
		
		sc.close();
	}		
}
