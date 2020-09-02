package facade;

public class SecurityCodeCheck {
	
	private int securityCode = 1234;
	
	public int getSecurityCode() { return this.securityCode; }
	
	public boolean isCodeCorrect(int secCode) {
		if(secCode == getSecurityCode()) {
			return true;
		}else {
			return false;
		}
	}
}
