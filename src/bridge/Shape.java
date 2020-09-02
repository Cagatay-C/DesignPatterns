package bridge;

public abstract class Shape {
	
	private DrawAPI drawAPI;
	
	public Shape(DrawAPI draw) {
		drawAPI = draw;
	}
	
	public abstract void draw();
}
