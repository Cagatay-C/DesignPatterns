package observer.secondexamp;

public class CurrentConditionDisplay implements Observer,Display{
	
	private int temperature;
	private int humidity;
	private Subject wheatherData;
	
	public CurrentConditionDisplay(Subject wheatherData) {
		this.wheatherData = wheatherData;
		wheatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Temperature: " + temperature);
		System.out.println("Humidity: " + humidity);
	}

	@Override
	public void update(int temp, int humidity, int pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
}
