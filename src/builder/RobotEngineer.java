package builder;

public class RobotEngineer {
	
	private RobotBuilder robotBuilder;
	
	public RobotEngineer(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}
	
	public void makeRobot() {
		this.robotBuilder.buildArms();
		this.robotBuilder.buildLegs();
		this.robotBuilder.buildHead();
	}
	
	public Robot getRobot() {
		return this.robotBuilder.getRobot();
	}
	
	public void setBuilder(RobotBuilder builder) {
		this.robotBuilder = builder;
	}

}
