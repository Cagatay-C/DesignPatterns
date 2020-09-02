package state;

public class NoCard implements ATMState {

	ATMMachine atmMachine;
	
	public NoCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Please enter a pin");
		atmMachine.setAtmMachine(atmMachine.getHasCardState());
	}

	@Override
	public void ejectCard() {
		System.out.println("First you need to insert a card");

	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("First you need to insert a card");

	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("First you need to insert a card");

	}

}
