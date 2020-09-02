package observer.secondexamp;

import java.util.ArrayList;

public class WheatherData implements Subject{
	
	private int temperature;
	private int humidity;
	private int pressure;
	
	private ArrayList<Observer> observers;
	
	public WheatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		Observer obs = null;
		for(Observer observer:observers) {
			if(o == observer) {
				obs = observer;
				break;
			}
		}
		
		if(obs != null) {
			observers.remove(obs);
		}else {
			System.out.println("Not in the list");			
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer obs:observers) {
			obs.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;	
		measurementsChanged();
	}
}













