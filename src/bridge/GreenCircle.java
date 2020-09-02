package bridge;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int x, int y,int radius) {
		System.out.println("Drawing green circle with " + radius + " radius on " + x + "," + y);
	}
}
