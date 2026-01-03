package generalPrograms;
import java.util.Scanner;

public class FactorOfDigits {
	static void factor(int num) {
		System.out.print("Factor of "+num+" is : ");
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				System.out.print(i+",");
			}
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		while(num>0) {
			int digit=num%10;
			factor(digit);
			num/=10;
		}
		sc.close();
	}
}
