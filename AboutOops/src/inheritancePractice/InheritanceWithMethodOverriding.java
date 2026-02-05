package inheritancePractice;

public class InheritanceWithMethodOverriding {
	public static void main(String[] args) {
		SBI sbi=new SBI();
		double iRate=sbi.getInterestRate();
		System.out.println(sbi.calculateInterest(5000,2.5,iRate));
		
		HDFC hdfc=new HDFC();
		double iRate2=hdfc.getInterestRate();
		System.out.println(hdfc.calculateInterest(6000,2.5,iRate2));
	}
}
