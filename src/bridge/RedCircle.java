package bridge;

public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int x, int y,int radius) {
		System.out.println("Drawing red circle with " + radius + " radius on " + x + "," + y);
		
	}
}
