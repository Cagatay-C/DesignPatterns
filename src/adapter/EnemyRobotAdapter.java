package adapter;

public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot theEnemyRobot;
	
	public EnemyRobotAdapter(EnemyRobot theEnemy) {
		this.theEnemyRobot = theEnemy;
	}
	
	@Override
	public void driveForward() {
		this.theEnemyRobot.walkForward();
		
	}

	@Override
	public void fireWeapon() {
		this.theEnemyRobot.smashWithHands();
		
	}

	@Override
	public void assignDriver(String driverName) {
		this.theEnemyRobot.reactToHuman(driverName);
	}
}
