package observer;

public class Youtube {

	
	public static void main(String[] args) {
		Subject cagatay = new Channel();
		Subscriber sub1 = new Subscriber("cagatay");
		Subscriber sub2 = new Subscriber("caglar");
		
		sub1.subscribeChannel(cagatay);
		sub2.subscribeChannel(cagatay);
		cagatay.subscribe(sub1); 
		cagatay.subscribe(sub2); 
		cagatay.upload("Learning data structures");	
	}

}
