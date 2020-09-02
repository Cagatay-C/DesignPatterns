package builder;

public class Test {

	
	public static void main(String[] args) {
		
		RobotBuilder robotBuilder = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
		robotEngineer.makeRobot();
		Robot robot = robotEngineer.getRobot();
		robot.print();
		robotBuilder = new IronRobotBuilder();
		robotEngineer.setBuilder(robotBuilder);
		robotEngineer.makeRobot();
		robot = robotEngineer.getRobot();
		robot.print();
	}
}
