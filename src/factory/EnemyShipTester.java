package factory;

import java.util.Scanner;

public class EnemyShipTester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		EnemyShip theEnemy = null;
		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		
		System.out.println("What type of an enemy ship? U / R / B");
		if(scanner.hasNextLine()) {
			String typeOfEnemyShip1 = scanner.nextLine();
			theEnemy = enemyShipFactory.makeEnemyShip(typeOfEnemyShip1);
		}
		
		if(theEnemy != null) {
			theEnemy.doStuff();
		}
		
		
		

	}

}
