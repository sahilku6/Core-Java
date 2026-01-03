package arraysFolder;

import java.util.Scanner;

public class MaxElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		int[] array1 = new int[size];
		
		System.out.println("Enter the number for array : ");
		for(int i=0;i<size;i++) {
			array1[i] = sc.nextInt();
		}
		
		
		int max=0;
		System.out.println("Output is : ");
		for(int num:array1) {
			if(max<num)
				max=num;
		}
		
		System.out.print("Maximum Number is : "+max);

		sc.close();
		
	}
}
