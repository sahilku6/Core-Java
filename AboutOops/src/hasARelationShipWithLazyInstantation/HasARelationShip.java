package hasARelationShipWithLazyInstantation;

public class HasARelationShip {
	public static void main(String[] args) {
		Car c=new Car();
		
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));

		for(int i=0;i<c.getTyres().length;i++) {
			System.out.println(c.getTyres()[i].getTyreBrand());
		}
		
	}
}
