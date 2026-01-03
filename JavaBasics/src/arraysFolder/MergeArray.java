package arraysFolder;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array1 : ");
		int size1=sc.nextInt();
		int[] array1 = new int[size1];
		System.out.println("Enter the number for array1 : ");
		for(int i=0;i<size1;i++) {
			array1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of Array2 : ");
		int size2=sc.nextInt();
		int[] array2 = new int[size2];
		System.out.println("Enter the number for array2 : ");
		for(int i=0;i<size2;i++) {
			array2[i] = sc.nextInt();
		}
		
		int[] array3=new int[size1+size2];
		int k=0;
		for(int i=0;i<size1;i++) {
			array3[k]=array1[i];
			k++;
		}
		for(int i=0;i<size2;i++) {
			array3[k]=array2[i];
			k++;
		}
		
		System.out.println("Output is : ");
		for(int num:array3) {
			System.out.print(num+" ");
		}

		sc.close();
		
	}
}
