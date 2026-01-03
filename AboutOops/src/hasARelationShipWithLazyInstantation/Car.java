package hasARelationShipWithLazyInstantation;

public class Car {
	private Tyre[] tyres=new Tyre[4];
	
	int i=0;
	public void addTyre(Tyre tyre) {
		tyres[i]=tyre;
		i++;
	}

	public Tyre[] getTyres() {
		return tyres;
	}

	public void setTyres(Tyre[] tyres) {
		this.tyres = tyres;
	}
	
	
}
