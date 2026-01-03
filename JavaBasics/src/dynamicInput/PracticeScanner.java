package dynamicInput;
import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        System.out.print("Enter your section: ");
        String section = sc.next();

        System.out.print("Are you above 18? (true/false): ");
        boolean isAbove18 = sc.nextBoolean();

        // Printing output
        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Section: " + section);
        System.out.println("Is Above 18: " + isAbove18);

        sc.close();
    }
}