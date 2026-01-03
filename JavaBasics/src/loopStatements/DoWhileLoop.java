package loopStatements;
import java.util.Scanner;
public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.println("Welcome");
			System.out.println("Do you want me to print again for YES enter Y and for NO enter N");
			ch=sc.next().charAt(0);
		}while(ch=='Y');
		
		sc.close();
	}
}
