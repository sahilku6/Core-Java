package hasARelationshipPractice;

public class MobileAndSim {
	public static void main(String[] args) {
		Mobile mobile=new Mobile("Samsung");
		System.out.println(mobile.getMobileName());
		
		System.out.println(mobile.getSim().getNumber());
		System.out.println(mobile.getSim().getNetwork());
	}
}
