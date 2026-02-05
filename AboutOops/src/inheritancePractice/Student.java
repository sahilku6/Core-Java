package inheritancePractice;

public class Student extends Person{
	private int rollNo;
	private float marks;
	
	Student(){
		
	}
	
	Student(String name,int age,int rollNo,float marks){
		super(age,name);
		this.rollNo=rollNo;
		this.marks=marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
}
