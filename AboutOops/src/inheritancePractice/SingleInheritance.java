package inheritancePractice;

public class SingleInheritance {
	public static void main(String[] args) {
		Student stu=new Student("Sahil Kumar",21,85,500);
		
		System.out.println(stu.getMarks());
		System.out.println(stu.getRollNo());
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
	}
}
