package operatorsAssignment;

public class Discount {
	public static void main(String[] args) {
		
		double totalPurchase=2500.50;
		boolean premiumMember=false;
		boolean firstTimeCustomer=true;
		
		String res=(totalPurchase>2000 && (premiumMember || firstTimeCustomer))?
				"Discount is Applicable":"Discount is not Applicable";
		System.out.println(res);
	}
}
