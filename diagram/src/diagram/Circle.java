package diagram;

public class Circle extends Diagram{
	int r;
	public Circle(int i) {
		super();
		this.r = r;
	}
	@Override
	public int length(int i) {
		double langth = i * Math.PI * 2;
		return (int) langth;
	}
	@Override
	public int area(int i) {
		double area = i * i * Math.PI;
		return (int)area ;
	}
	
	
}
