package inheritance;

public class SingleInheritance {
	public static void main(String[] args) {
		 Car c = new Car();
	     c.start();  // inherited from Vehicle
	     c.drive();  // Car's own method
	}
}
//Base class
class Vehicle {
 void start() {
     System.out.println("Vehicle starts");
 }
}

//Derived class
class Car extends Vehicle {
 void drive() {
     System.out.println("Car is driving");
 }
}
