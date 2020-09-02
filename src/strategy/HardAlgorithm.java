package strategy;

public class HardAlgorithm implements ChessAlgorithm{

	@Override
	public int calculateNextStep() {
		System.out.println("HardAlgorithm applied");
		return 2;
	}

}
