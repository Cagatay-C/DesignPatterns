package state;

public class HasPin implements ATMState {
	
	ATMMachine atmMachine;
	
	public HasPin(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("You can't insert more than one card");

	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected");
		atmMachine.setAtmMachine(atmMachine.getNoCardState());

	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("Already has pin");

	}

	@Override
	public void requestCash(int cashToWithdraw) {
		if(cashToWithdraw >atmMachine.cashInMachine) {
			System.out.println("Don't have that cash");
			System.out.println("Card Ejected");
			atmMachine.setAtmMachine(atmMachine.getNoCashState());
		}else {
			System.out.println(cashToWithdraw + " is provided by the machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			atmMachine.setAtmMachine(atmMachine.getNoCardState());
			System.out.println("Card Ejected");
			if(atmMachine.cashInMachine <= 0) {
				atmMachine.setAtmMachine(atmMachine.getNoCashState());
			}
		}
	}
}
