package adapter;

import java.util.Random;

public class EnemyRobot {

	Random rand = new Random();
	
	public void smashWithHands() {
		int damage = rand.nextInt(15) + 1;
		System.out.println("EnemyRobot does " + damage + " damage with its hands");
	}
	
	public void walkForward() {
		int movement = rand.nextInt(5) + 1;
		System.out.println("EnemyRobot walks forward " + movement + " spaces");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("EnemyRobot tramps on " + driverName);
	}
}
