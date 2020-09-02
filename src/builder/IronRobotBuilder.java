package builder;

public class IronRobotBuilder implements RobotBuilder{

	private Robot robot;
	
	public IronRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildArms() {
		this.robot.setArms("Iron arms");
		
	}

	@Override
	public void buildLegs() {
		this.robot.setLegs("Iron legs");
		
	}

	@Override
	public void buildHead() {
		this.robot.setHead("Iron head");
		
	}
	
	public Robot getRobot() {
		return this.robot;
	}	
}
