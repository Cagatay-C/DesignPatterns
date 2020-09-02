package observer.secondexamp;

public class TestWheather {

	public static void main(String[] args) {
		WheatherData wheatherData = new WheatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(wheatherData);
		wheatherData.setMeasurements(10, 5, 7);
		wheatherData.setMeasurements(20, 10, 4);
		
	}
}
