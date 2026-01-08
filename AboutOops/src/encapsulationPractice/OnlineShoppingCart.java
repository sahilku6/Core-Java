package encapsulationPractice;

public class OnlineShoppingCart {
	private double totalAmount=0.0;

	public double getTotalAmount() {
		return totalAmount;
	}
	
	
	public void addItems(double amount) {
		if(amount>0)
			totalAmount+=amount;
	}
	
	public void removeItems(double amount) {
		if(amount>0)
			totalAmount-=amount;
	}
	
}
