package customException;

import java.util.Scanner;

public class MainAppForUnderAge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		
		if(age<18) {
			throw new UnderAgeException("Age is less then 18");
		}else {
			System.out.println("The age is : "+age);
		}
	}
	
}
