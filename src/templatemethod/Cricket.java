package templatemethod;

public class Cricket extends Game{

	@Override
	void initialize() {
		System.out.println("Initializing Cricket Game");
		
	}

	@Override
	void startPlay() {
		System.out.println("Start Cricket Game");
		
	}

	@Override
	void endPlay() {
		System.out.println("End Cricket Game");
		
	}
}
