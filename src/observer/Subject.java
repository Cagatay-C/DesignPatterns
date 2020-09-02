package observer;

public interface Subject {

	void subscribe(Subscriber subscribe);

	void unSubscribe(Observer subscribe);

	void upload(String title);
	
	void notifyAllSubscribers();

}