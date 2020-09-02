package templatemethod;

public abstract class Game {
	
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play() { // template method
		initialize();
		startPlay();
		endPlay();
	}
}
