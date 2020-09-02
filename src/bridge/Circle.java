package bridge;

public class Circle extends Shape{

	private int x,y,radius;
	DrawAPI draw;
	
	public Circle(int radius, int x, int y, DrawAPI draw) {
		super(draw);
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.draw = draw;
	}
	
	@Override
	public void draw() {
		draw.drawCircle(x, y, radius);
	}
}
