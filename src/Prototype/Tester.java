package Prototype;

public class Tester {

	public static void main(String[] args) {
		
		CloneFactory factory = new CloneFactory();
		Sheep sally = new Sheep();
		Sheep clonedSally = (Sheep)factory.getClone(sally);
		
			
		System.out.println("Sally hashcode: " + System.identityHashCode(System.identityHashCode(sally)));
		System.out.println("clonedSally hashcode: " + System.identityHashCode(System.identityHashCode(clonedSally)));

	}

}
