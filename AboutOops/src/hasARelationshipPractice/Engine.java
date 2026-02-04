package hasARelationshipPractice;

public class Engine {
	private String engineType;
	private int horsePower;
	
	public Engine() {
		
	}
	
	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public Engine(String engineType,int horsePower) {
		this.engineType=engineType;
		this.horsePower=horsePower;
	}
	
	
}
