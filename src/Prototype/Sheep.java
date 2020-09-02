package Prototype;

public class Sheep implements Animal{

	public Sheep() {
		System.out.println("Sheep is made");
	}
	
	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is being made...");
		Sheep sheepObj = null;	
		try {
			sheepObj = (Sheep)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return sheepObj;
	}
	
	public String toString() {
		return "Dolly the sheep";
	}
	
}
