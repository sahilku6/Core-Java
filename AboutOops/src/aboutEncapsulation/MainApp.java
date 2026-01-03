package aboutEncapsulation;

import aboutEncapsulation.Outter.Inner;

public class MainApp {
	public static void main(String[] args) {
		
		//For Product class
		/*
		Product pro=new Product();
		pro.setPrice(-150);
		pro.getPrice();
		*/
		
		//For Outter class static inner class
		
		/*
		Outter.Inner obj=new Outter.Inner();
		Outter.Inner.display();
		obj.display1();
		*/
		
		//For Outter class non-static inner class
		
		Outter outter=new Outter();
		Inner.display();
//		outter.display();//gives error
		Outter.Inner inner=outter.new Inner();
		inner.display();
		inner.display1();

	}
}
