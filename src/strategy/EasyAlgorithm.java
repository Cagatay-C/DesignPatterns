package strategy;

public class EasyAlgorithm implements ChessAlgorithm{

	@Override
	public int calculateNextStep() {
		System.out.println("EasyAlgorithm applied");
		return 0;
	}
}
