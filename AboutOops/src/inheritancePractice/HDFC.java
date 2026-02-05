package inheritancePractice;

public class HDFC extends Bank{
	double calculateInterest(double principle ,double time,double intrestRate) {
		return (principle*time*intrestRate)/100;
	}
}
