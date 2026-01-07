package encapsulationPractice;

public class MainApp {
	    public static void main(String[] args) {
	    	
	    	//Bank Account
	    	
	        /*BankAccount account = new BankAccount(123456789L, 500.0);

	        account.deposit(200);
	        account.withdraw(100);
	        account.withdraw(700);*/
	        
	        
	        //Student Marks
	        
	        StudentMarks stu = new StudentMarks();
	        stu.setMarks(85);
	        System.out.println("Student marks are : "+stu.getMarks());
	        stu.setMarks(10);
	        System.out.println("Student marks are : "+stu.getMarks());
	        
	    }
}
