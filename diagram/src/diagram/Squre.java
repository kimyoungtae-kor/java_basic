package diagram;

public class Squre extends Diagram{
	
	int j;
	public Squre(int j) {
		super();
		this.j = j;
	}
	@Override
	public int length(int i) {
		double langth = i *4;
		return (int) langth;
	}
	@Override
	public int area(int i,int j) {
		double area = i *j;
		return (int)area ;
	}

}
