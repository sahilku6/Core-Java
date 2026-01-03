package decisionMakingStmt;

import java.util.Scanner;

public class PracticeQuestion6 {
	public static void main(String[] args) {
		System.out.println("Enter the Month : ");
		Scanner sc=new Scanner(System.in);
		
		String month = sc.next();
		
		switch(month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println("31 days in a month.");
			break;
		case "Feb":
			System.out.println("28/29 days in a month.");
			break;
		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.println("30 days in a month.");
			break;
		}
		sc.close();
	}
}
