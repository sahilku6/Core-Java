package arraysFolder;

import java.util.Scanner;

public class SecondLargerstElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		int[] array1 = new int[size];
		
		System.out.println("Enter the number for array : ");
		for(int i=0;i<size;i++) {
			array1[i] = sc.nextInt();
		}
		
		
		int largest = -1;
        int secondLargest = -1;
        
        for (int num : array1) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        System.out.println("Output is : ");
        if (secondLargest==-1) {
            System.out.println("No second largest element (all elements equal or only one element).");
        } else {
            System.out.println("Second Largest Element = " + secondLargest);
        }
        

		sc.close();
		
	}
}
