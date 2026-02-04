package hasARelationshipPractice;

public class StudentAndAddress {
	public static void main(String[] args) {
		Student student=new Student("Sahil Kumar");
		System.out.println(student.getName());
		
		System.out.println(student.getAddress().getCity());
		System.out.println(student.getAddress().getState());
		System.out.println(student.getAddress().getPin());
	}
}
