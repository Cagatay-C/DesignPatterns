package facade;

public class FundsCheck {
	
	private double cashInAccount = 1000.0;
	
	public double getCashInAccount() { return this.cashInAccount;}
	
	public void decreaseCashInAccount(double cashWithdrawn) {
		this.cashInAccount -= cashWithdrawn;
	}
	
	public void increaseCashInAccount(double cashDeposited) {
		this.cashInAccount += cashDeposited;
	}
	
	public boolean haveEnoughMoney(double cashWithdrawal) {
		
		if(cashWithdrawal > cashInAccount) {
			System.out.println("You dont have enough money");
			System.out.println("Current Balance: " + cashInAccount);
			return false;
		}else {
			decreaseCashInAccount(cashWithdrawal);
			return true;
		}
	}
	
	public void cashDeposit(double cashDeposit) {
		increaseCashInAccount(cashDeposit);
		System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
	}
}
