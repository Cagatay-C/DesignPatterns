package strategy;

public class Chess implements ChessAlgorithm {
	
	private ChessAlgorithm algorithm = new EasyAlgorithm();
	
	@Override
	public int calculateNextStep() {

		return algorithm.calculateNextStep();
	}
	
	public void setAlgorithm(ChessAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
}
