package encapsulationPractice;

public class MainApp {
	    public static void main(String[] args) {
	    	
	    	//Bank Account
	    	
	        /*BankAccount account = new BankAccount(123456789L, 500.0);

	        account.deposit(200);
	        account.withdraw(100);
	        account.withdraw(700);*/
	        
	        
	        //Student Marks
	        
	        /*StudentMarks stu = new StudentMarks();
	        stu.setMarks(85);
	        System.out.println("Student marks are : "+stu.getMarks());
	        stu.setMarks(10);
	        System.out.println("Student marks are : "+stu.getMarks());*/
	    	
	    	
	    	//Employee Salary
	    	
	    	/*EmployeeSalary emp=new EmployeeSalary();
	    	
	    	System.out.println("Employee Salary is : "+emp.getSalary());
	    	emp.setSalary(-1);
	    	emp.setSalary(15800);
	    	System.out.println("Employee Salary is : "+emp.getSalary());*/
	    	
	    	
	    	//Atm Pin
	    	
	    	/*AtmPin aPin=new AtmPin();
	    	System.out.println("Users Pin is : "+aPin.getPin());

	    	AtmPin aPin1=new AtmPin(1532);
	    	System.out.println("Users Pin is : "+aPin1.getPin());*/
	    	
	        
	    	//Mobile Battery
	    	
	    	/*MobileBattery mb = new MobileBattery();

			mb.setBatteryLevel(0);
			System.out.println("After set to 0: " + mb.getBatteryLevel());
			mb.setBatteryLevel(-9);
			System.out.println("After set to -9: " + mb.getBatteryLevel());
			mb.setBatteryLevel(10);
			System.out.println("After set to 10: " + mb.getBatteryLevel());
			mb.charge(9);
			System.out.println("After charge to 9: " + mb.getBatteryLevel());
			mb.setBatteryLevel(100);
			System.out.println("After set to 100: " + mb.getBatteryLevel());
			mb.setBatteryLevel(104);
			System.out.println("After set to 104: " + mb.getBatteryLevel());
			mb.use(50);
			System.out.println("After use to 50: "+mb.getBatteryLevel());*/
	    	
	    	
	    	
//	    	Library Book
	    	
	    	/*LibraryBook book=new LibraryBook();
	    	book.displayBookPrice();
	    	book.updateBookPrice(1500);
	    	book.displayBookPrice();*/

//	    	Online Shopping Cart
	    	
	    	/*OnlineShoppingCart item=new OnlineShoppingCart();
	    	item.addItems(1500);
	    	System.out.println("Total Amount is : "+item.getTotalAmount());
	    	item.addItems(250);
	    	System.out.println("Total Amount is : "+item.getTotalAmount());
	    	item.removeItems(1450);
	    	System.out.println("Total Amount is : "+item.getTotalAmount());*/
	    	
//	    	Exam Result 
	    	
	    	/*ExamResult res=new ExamResult();
	    	res.setTotalMarks(350);
	    	System.out.println("Result is : "+ res.getResult());*/
	    	
	    	
//	    	Vehicle Speed Control
	    	
	    	/*VehicleSpeedControl sp=new VehicleSpeedControl();
	    	sp.increase(12);
	    	System.out.println("Current Speed is : "+sp.getSpeed());
	    	
	    	sp.increase(102);
	    	System.out.println("Current Speed is : "+sp.getSpeed());
	    	
	    	sp.increase(12);
	    	System.out.println("Current Speed is : "+sp.getSpeed());
	    	
	    	sp.decrease(12);
	    	System.out.println("Current Speed is : "+sp.getSpeed());*/
	    	
	    	
//	    	Password Protection
	    	
	    	PasswordProtection pass1=new PasswordProtection("123456789");
	    	boolean flag=pass1.passwordValidation("123456789", "156087451");
	    	
	    	if(flag) {
	    		System.out.println("Password Changed !");
	    	}else {
	    		System.out.println("Password Not Changed !");
	    	}
	    	
	    	
	    	
	    	


	    	
	    }
}
