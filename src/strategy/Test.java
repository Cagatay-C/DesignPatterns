package strategy;

public class Test {

	public static void main(String[] args) {
		Chess game = new Chess();
		game.calculateNextStep();
		game.setAlgorithm(new MediumAlgorithm());
		game.calculateNextStep();
		game.setAlgorithm(new HardAlgorithm());
		game.calculateNextStep();
	}
}
