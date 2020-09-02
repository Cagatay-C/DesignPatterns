package command;

public class Stock {
	
	private String stockName = "ABC";
	private int quantity = 10;
	
	public void buy() {
		System.out.println("Stock : " + "[ Name : " + stockName + "," + 
				"Quentity: " + quantity + " bought ");
	}
	
	public void sell() {
		System.out.println("Stock : " + "[ Name : " + stockName + "," + 
				"Quentity: " + quantity + " sold ");
	}
}
