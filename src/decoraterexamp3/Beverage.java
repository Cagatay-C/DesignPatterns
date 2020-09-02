package decoraterexamp3;

public abstract class Beverage {
	
	public static final String TALL = "TALL";
	public static final String GRANDE = "GRANDE";
	public static final String VENTI = "VENTI";
	
	String description = "Unknown Beverage";
	String size = "Unknown";
	
	public String getDescription() {
		return this.description;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public void setSize(String size) {
		if(size.equals("T")) {
			this.size = TALL;
		}else if(size.equals("G")) {
			this.size = GRANDE;
		}else if(size.equals("V")) {
			this.size = VENTI;
		}else {
			System.out.println("Enter valid size");
		}
	}
	
	public abstract double cost();
}
