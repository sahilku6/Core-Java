package operatorsAssignment;

public class SalaryIncrement {
	public static void main(String[] args) {
		int performanceRating=5;
		boolean experiencedMoreThenFive=true;
		boolean isDisciplinary=false;
		
		String res=(performanceRating>4 && experiencedMoreThenFive && !isDisciplinary)?
				"Eligible for a Salary Increment":"Not eligible for a Salary Increment";
		System.out.println(res);
	}
}
