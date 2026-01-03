package hasARelationShipWithEarlyInstantation;

public class Tyre {
	private String tyreBrand;

	public String getTyreBrand() {
		return tyreBrand;
	}

	public void setTyreBrand(String tyreBrand) {
		this.tyreBrand = tyreBrand;
	}
	
	//constructor
	Tyre(){
		
	}
	
	Tyre(String tyreBrand){
		this.tyreBrand=tyreBrand;
	}

}
