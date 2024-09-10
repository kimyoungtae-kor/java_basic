package diagram;

public class Circle extends Diagram{
	int r;
	public Circle(int r) {
		super();
		this.r = r;
	}
	@Override
	public int length() {
		double langth = r * Math.PI * 2;
		return (int) langth;
	}
	@Override
	public int area() {
		double area = r * r * Math.PI;
		return (int)area ;
	}
	
	@Override
	public String toStirng() {
		return "원";
	}
	
}
