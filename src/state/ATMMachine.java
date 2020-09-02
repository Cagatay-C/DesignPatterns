package state;

import proxy.GetATMData;

public class ATMMachine implements GetATMData{
	
	ATMState noCard;
	ATMState hasCard;
	ATMState hasCorrectPin;
	ATMState outOfMoney;
	
	ATMState atmState;
	
	int cashInMachine = 2000;
	boolean correctPinEntered = false;
	
	public ATMMachine() {
		noCard = new NoCard(this);
		hasCard = new HasCard(this);
		hasCorrectPin = new HasPin(this);
		outOfMoney = new NoCash(this);
		
		if(cashInMachine <= 0) {
			atmState = outOfMoney;
		}
		
		atmState = noCard;
	}
	
	public void setAtmMachine(ATMState state) {
		this.atmState = state;
	}
	
	public void setCashInMachine(int cash) {
		this.cashInMachine = cash;
	}
	
	public void insertCard() {
		atmState.insertCard();
	}
	
	public void ejectCard() {
		atmState.ejectCard();
	}
	
	public void requestCash(int cash) {
		atmState.requestCash(cash);
	}
	
	public void insertPin(int pin) {
		atmState.insertPin(pin);
	}
	
	public ATMState getHasCardState() { return this.hasCard; }
	public ATMState getNoCardState() { return this.noCard; }
	public ATMState getHasPinState() { return this.hasCorrectPin; }
	public ATMState getNoCashState() { return this.outOfMoney; }

	@Override
	public ATMState getATMData() {
		return this.atmState;
	}

	@Override
	public int getCashInMachine() {
		return this.cashInMachine;
	}
}
