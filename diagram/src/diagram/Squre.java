package diagram;

public class Squre extends Diagram{
	int i;
	int j;
	public Squre(int i,int j) {
		super();
		this.i = i;
		this.j = j;
	}
	@Override
	public int length() {
		double langth = (i+j)*4;
		return (int) langth;
	}
	@Override
	public int area() {
		double area = i *j;
		return (int)area ;
	}
	
	@Override
	public String toStirng() {
		return "사각형";
	}

}
