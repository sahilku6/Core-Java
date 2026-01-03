package generalPrograms;
import java.util.Scanner;
public class CountDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int digitCount=0;
		if(num==0) 
			digitCount=1;
		else {
			while(num>0) {
				num/=10;
				digitCount++;
			}
		}
		System.out.println("The Count of digit of : "+digitCount);
		sc.close();
	}
}
