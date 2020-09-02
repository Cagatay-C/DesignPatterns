package templatemethod;

public class Football extends Game{

	@Override
	void initialize() {
		System.out.println("Initializing Football");
		
	}

	@Override
	void startPlay() {
		System.out.println("Start Football");
		
	}

	@Override
	void endPlay() {
		System.out.println("End Football");
		
	}
}
