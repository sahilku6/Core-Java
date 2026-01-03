package hasARelationShipWithEarlyInstantation;

public class Car {
	private String modelName;
	
	private Tyre tyres[]= {new Tyre("MRF"),
						   new Tyre("MRF"),
						   new Tyre("MRF"),
						   new Tyre("MRF")};
						   

	

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	public Tyre[] getTyres() {
		return tyres;
	}

	public void setTyres(Tyre[] tyres) {
		this.tyres = tyres;
	}
	
	
	//constructor
	
	Car(){
		
	}
	
	Car(String modelName){
		this.modelName=modelName;
	}
	
	
	//Achiving HasA relationship
	
	private Engine e=new Engine(1500);

	public Engine getEngine() {
		return e;
	}

	public void setEngine(Engine e) {
		this.e = e;
	}
	
}
