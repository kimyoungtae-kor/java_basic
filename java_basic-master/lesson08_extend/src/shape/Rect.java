package shape;

public class Rect extends Shape {

	private int x;
	private int y;
	
	public Rect(int i ,int j) {
		super("사각형");
		this.x = i;
		this.y = j;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return x * y;
	}
	
	@Override
	public double length() {
		return (x + y) * 2;
	}


}
