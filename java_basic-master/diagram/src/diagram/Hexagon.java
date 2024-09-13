package diagram;

public class Hexagon extends Diagram {

	private int i;
	private int j;
	private int h;

	//직윤면체 부피 = 가로X세로X높이
	//겉넓이 = 가로*세로*6
	
	
	public  Hexagon(int i,int j,int h) {
		super();
		this.i = i;
		this.j = j;
		this.h = h;
		
	}
	@Override
	public int area() {

		return i*j*6;
	}

	@Override
	public String toStirng() {

		return "육각형";
	}

	@Override
	public int volume() {

		return i*j*h;
	}
	
}
