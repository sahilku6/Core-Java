package encapsulationPractice;

public class EmployeeSalary {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary <0)
			System.out.println("Salary Cannot be Negative");
		else
			this.salary = salary;
	}
	
}
