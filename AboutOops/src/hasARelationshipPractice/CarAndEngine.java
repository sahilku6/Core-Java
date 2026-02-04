package hasARelationshipPractice;

public class CarAndEngine {
	public static void main(String[] args) {
		Car car=new Car("BMW","8 Searies");
		
		System.out.println(car.getCarName());
		System.out.println(car.getCarModel());
		System.out.println(car.getE().getEngineType());
		System.out.println(car.getE().getHorsePower());
	}
}
