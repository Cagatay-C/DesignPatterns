package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Subscriber> subscribers;
	private String title;
	
	public Channel() {
		subscribers = new ArrayList<Subscriber>();
	}
	@Override
	public void subscribe(Subscriber subscribe) {
		subscribers.add(subscribe);
	}
	
	@Override
	public void unSubscribe(Observer subscribe) {
		subscribers.remove(subscribe);
	}
	
	@Override
	public void notifyAllSubscribers() {
		for(Observer subscriber: subscribers) {
			subscriber.update();
		}
	}
	
	@Override
	public void upload(String title) {
		this.title = title;
		notifyAllSubscribers();
	}
	
	
}
