package facade;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccountFacade bankAccount = new BankAccountFacade(12345678,1234);
		bankAccount.withdrawCash(200.0);
		bankAccount.withdrawCash(700);
		bankAccount.withdrawCash(200);
		bankAccount.makeDeposit(500);
	}

}
