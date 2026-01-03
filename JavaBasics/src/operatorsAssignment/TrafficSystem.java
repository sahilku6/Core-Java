package operatorsAssignment;

public class TrafficSystem {
	public static void main(String[] args) {
		int speed=120;
		boolean isEmergencyServiceProvider=true;
		boolean isfineApplicable=(speed>100 || isEmergencyServiceProvider)?true:false;
		int finedAmount=0;
		
		finedAmount+= isfineApplicable?500:0;
		
		System.out.println(finedAmount);
		
	}
}
