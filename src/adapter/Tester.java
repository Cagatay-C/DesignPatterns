package adapter;

public class Tester {
	
	public static void main(String[]args) {
	
		EnemyTank enemyTank = new EnemyTank();
		enemyTank.fireWeapon();
		enemyTank.assignDriver("cagatay");
		enemyTank.driveForward();
		System.out.println("--------------");
		EnemyRobot enemyRobot = new EnemyRobot();
		enemyRobot.smashWithHands();
		enemyRobot.walkForward();
		enemyRobot.reactToHuman("cagatay");
		System.out.println("--------------");
		EnemyRobotAdapter enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);
		enemyRobotAdapter.fireWeapon();
		enemyRobotAdapter.assignDriver("cagatay");
		enemyRobotAdapter.driveForward();
	}
}
