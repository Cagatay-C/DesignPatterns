package state;

public class HasCard implements ATMState {

	ATMMachine atmMachine;
	
	public HasCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("You can insert more than one card");

	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected");
		atmMachine.setAtmMachine(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		if(pinEntered == 1234) {
			System.out.println("Correct Pin");
			atmMachine.correctPinEntered = true;
			atmMachine.setAtmMachine(atmMachine.getHasPinState());
		}else {
			System.out.println("Wrong Ping");
			atmMachine.correctPinEntered = false;
			System.out.println("Card Ejected");
			atmMachine.setAtmMachine(atmMachine.getNoCardState());
		}
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("Enter pin first");
	}

}
