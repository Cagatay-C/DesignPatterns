package proxy;

import state.ATMMachine;
import state.ATMState;

public class ATMProxy implements GetATMData{

	@Override
	public ATMState getATMData() {
		
		ATMMachine realAtmMachine = new ATMMachine();
		return realAtmMachine.getATMData();
	}

	@Override
	public int getCashInMachine() {
		
		ATMMachine realAtmMachine = new ATMMachine();	
		return realAtmMachine.getCashInMachine();
	}
}
