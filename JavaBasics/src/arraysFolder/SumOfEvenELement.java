package arraysFolder;

import java.util.Scanner;

public class SumOfEvenELement {
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
		int sum=0;
		for(int i=0;i<size;i++) {
			if(array[i]%2==0)
				sum+=array[i];
		}
		
		System.out.println("Sum is : "+sum);
		sc.close();
		
	}
}
