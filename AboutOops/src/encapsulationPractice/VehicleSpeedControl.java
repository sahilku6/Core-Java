package encapsulationPractice;

public class VehicleSpeedControl {
	final int limit=120;
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void increase(int addedSpeed) {
		if(speed+addedSpeed>120)
			System.out.println("Top Limit Reached");
		else 
			setSpeed(addedSpeed+speed);
		
	}
	
	
	public void decrease(int minusSpeed) {
		if(minusSpeed>speed)
			speed=0;
		else 
			setSpeed(speed-minusSpeed);
	}
	
	
}
