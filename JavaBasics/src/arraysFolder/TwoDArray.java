package arraysFolder;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		int[][] array = new int[size][size];
		
		System.out.println("Enter the number for array : ");
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Output is : ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
