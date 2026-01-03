package arraysFolder;

import java.util.Scanner;

public class FirstAndLastPrint {
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
		for(int i=0;i<size;i++) {
			if(i==0 || i==size-1)
				System.out.println(array[i]);
		}
		sc.close();
		
	}
}
