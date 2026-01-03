package arraysFolder;

import java.util.Scanner;

public class DiffBetweenEvenAndOddSum {
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
		int sum1=0;
		int sum2=0;
		for(int i=0;i<size;i++) {
			if(i%2==0)
				sum1+=array[i];
			else
				sum2+=array[i];
		}
		
		System.out.println("Difference of Even sum and Odd sum is : "+Math.abs(sum1-sum2));
		sc.close();
	}
}
