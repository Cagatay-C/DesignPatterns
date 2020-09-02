package factory;

import java.util.Scanner;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String shipType) {
		
		EnemyShip newShip = null;
		
		if(shipType.equals("U")) {
			newShip = new UfoEnemyShip();
		}else if(shipType.equals("B")) {
			newShip = new BigUfoEnemyShip();
		}else if(shipType.equals("R")) {
			newShip = new RocketEnemyShip();
		}
		return newShip;
	}
}
