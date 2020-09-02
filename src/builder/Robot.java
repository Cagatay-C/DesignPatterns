package builder;

public class Robot implements RobotPlan{
	
	private String arms;
	private String legs;
	private String head;
	
	@Override
	public void setArms(String arms) {
		this.arms = arms;
		
	}
	@Override
	public void setLegs(String legs) {
		this.legs = legs;
		
	}
	@Override
	public void setHead(String head) {
		this.head = head;
		
	}
	@Override
	public void print() {
		System.out.println(arms);
		System.out.println(legs);
		System.out.println(head);
		
	}
	
	
}
