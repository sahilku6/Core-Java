package operatorsAssignment;

public class BankSystem {
	public static void main(String[] args) {
		double balance=100.23;
		boolean active=true;
		boolean auth=false;
		auth=(balance>0.0 && active==true)?true:false;
		
		if(auth) {
			double withdrawalAmount=15.23;
			balance-=withdrawalAmount;
			System.out.println("Amount is withdrawal Successfully Your Available Amount is :"+balance);
		}else {
			System.out.println("Insufficianct balance.");
		}
		
	}
}
