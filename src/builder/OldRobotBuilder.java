package builder;

public class OldRobotBuilder implements RobotBuilder{

	private Robot robot;
	
	public OldRobotBuilder() {
		robot = new Robot();
	}
	
	@Override
	public void buildArms() {
		robot.setArms("Tin arms");
		
	}

	@Override
	public void buildLegs() {
		robot.setLegs("Tin legs");
		
	}

	@Override
	public void buildHead() {
		robot.setHead("Tin head");
		
	}
	
	public Robot getRobot() {
		return this.robot;
	}

}
