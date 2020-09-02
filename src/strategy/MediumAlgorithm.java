package strategy;

public class MediumAlgorithm implements ChessAlgorithm{

	@Override
	public int calculateNextStep() {
		System.out.println("MediumAlgorithm applied");
		return 1;
	}
	
}
