package operatorsAssignment;

public class ExtraTime {
	public static void main(String[] args) {
		boolean isPhysicallyChallenged=true;
		boolean approvedByTheAdministration=true;
		double attendence = 85.50;
		
		boolean getsExtraTime=false;
		
		getsExtraTime = ((isPhysicallyChallenged || attendence<60.0) && approvedByTheAdministration)?
				true:false;
		
		System.out.println(getsExtraTime);

	}
}
