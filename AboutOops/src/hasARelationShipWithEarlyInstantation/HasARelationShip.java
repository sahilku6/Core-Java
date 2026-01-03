package hasARelationShipWithEarlyInstantation;

public class HasARelationShip {
	public static void main(String[] args) {
		Car c=new Car("BMW");
		System.out.println(c.getModelName());
		System.out.println(c.getEngine().getHp());
		
		for(int i=0;i<c.getTyres().length;i++) {
			System.out.println(c.getTyres()[i].getTyreBrand());
		}
	}
}
