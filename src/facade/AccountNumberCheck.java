package facade;

public class AccountNumberCheck {
	
	private int accountNumber = 12345678;
	
	public int getAccountNumber() {return this.accountNumber;}
	
	public boolean accountActive(int accountNum) {
		if(accountNum == getAccountNumber()) {
			return true;
		}else {
			return false;
		}
	}
}
