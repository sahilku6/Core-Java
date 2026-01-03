package arraysFolder;

import java.util.Scanner;

public class ReverseArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		int[] array1 = new int[size];
		
		System.out.println("Enter the number for array : ");
		for(int i=0;i<size;i++) {
			array1[i] = sc.nextInt();
		}
		
		int left=0;
		int right=size-1;
		while(left<right) {
			int temp=array1[left];
			array1[left]=array1[right];
			array1[right]=temp;
			left++;
			right--;
		}
		
		System.out.println("Output is : ");
		for(int num:array1) {
			System.out.print(num+" ");
		}

		sc.close();
		
	}
}
