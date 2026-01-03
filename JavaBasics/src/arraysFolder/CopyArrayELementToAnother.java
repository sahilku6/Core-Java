package arraysFolder;
import java.util.Scanner;
public class CopyArrayELementToAnother {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		int[] array1 = new int[size];
		int[] array2 = new int[size];
		
		System.out.println("Enter the number for array : ");
		
		for(int i=0;i<size;i++) {
			array1[i] = sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			array2[i] = array1[i];
		}	
		
		System.out.println("Output is : ");
		for(int num:array2) {
			System.out.print(num+" ");
		}

		sc.close();
		
	}
}
