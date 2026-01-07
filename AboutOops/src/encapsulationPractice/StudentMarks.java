package encapsulationPractice;

public class StudentMarks {
	private double marks;

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		if(marks>100) {
			System.out.println("Marks cannot be greater then 100");
		}
		else {
			this.marks = marks;
			System.out.println("Marks are set.");
		}
	}
}
