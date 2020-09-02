package facade;

public class BankAccountFacade {
	
	private int accountNumber;
	private int secCode;
	
	AccountNumberCheck accChecker;
	SecurityCodeCheck secChecker;
	FundsCheck fundsChecker;
	WelcomeToBank welcomeToBank;
	
	public BankAccountFacade(int accNum, int secCode) {
		this.accountNumber = accNum;
		this.secCode = secCode;
		
		accChecker = new AccountNumberCheck();
		secChecker = new SecurityCodeCheck();
		fundsChecker = new FundsCheck();
		welcomeToBank = new WelcomeToBank();
	}
	
	public int getAccountNumber() { return this.accountNumber; }
	
	public int getSecurityCode() { return this.secCode; }
	
	public void withdrawCash(double cashToGet) {
		if(accChecker.accountActive(getAccountNumber()) && 
				secChecker.isCodeCorrect(getSecurityCode()) && 
				fundsChecker.haveEnoughMoney(cashToGet)) {
			System.out.println("Transaction Complete");
			System.out.println("Current Balance: " + fundsChecker.getCashInAccount() + "\n");
		}else {
			System.out.println("Transaction Failed\n");
		}
	}
	
	public void makeDeposit(double cashToDeposit) {
		if(accChecker.accountActive(getAccountNumber()) &&
				secChecker.isCodeCorrect(getSecurityCode())) {
			fundsChecker.cashDeposit(cashToDeposit);
			System.out.println("Transaction Complete\n");
		}else {
			System.out.println("Transaction Failed\n");
		}
	}
}
