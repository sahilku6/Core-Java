package dynamicInput;
import java.util.Scanner;

public class PracticeSwitchWithScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet (A to D)");
		char ch=sc.next().charAt(0);
		
		switch(ch){
			case 'A':
				System.out.println("A for Apple");
				break;
			case 'B':
				System.out.println("B for Ball");
				break;
			case 'C':
				System.out.println("C for Cat");
				break;
			case 'D':
				System.out.println("D for Dog");
				break;
			default:
					System.out.println("Wrong Input");
					break;
		}
		
		sc.close();
		
	}
}
