package hasARelationshipPractice;

public class Car {
	private String carName;
	private String carModel;
	
	public Car() {
	}
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Car(String carName,String carModel){
		this.carName=carName;
		this.carModel=carModel;
	}
	
	Engine e=new Engine("V8",700);

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}
	
}
