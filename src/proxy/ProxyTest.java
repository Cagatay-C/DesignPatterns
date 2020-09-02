package proxy;

import state.ATMMachine;

public class ProxyTest {

	public static void main(String[] args) {
		
		GetATMData atmData = new ATMMachine();
		ATMProxy atmProxy = new ATMProxy();
		
		System.out.println(atmProxy.getCashInMachine());
		System.out.println(atmProxy.getATMData());
		
		System.out.println(atmData.getCashInMachine());
		System.out.println(atmData.getATMData());
	}

}
