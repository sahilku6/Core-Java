package arraysFolder;

import java.util.Scanner;

public class InsertElementAtPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		int[] array1 = new int[size];
		System.out.println("Enter the position : ");
		int pos=sc.nextInt();
		
		System.out.println("Enter the number for array : ");
		array1[pos] = sc.nextInt();
		
		System.out.println("Output is : ");
		for(int num:array1) {
			System.out.print(num+" ");
		}

		sc.close();
		
	}
}
