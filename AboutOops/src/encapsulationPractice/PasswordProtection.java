package encapsulationPractice;

public class PasswordProtection {
	private String password;
	
	public PasswordProtection(String password) {
		this.password=password;
	}
	
	public boolean passwordValidation(String currentPassword,String newPassword) {
		if(password!=null && password.equals(currentPassword)) {
			setPassword(newPassword);
			return true;
		}
		return false;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
