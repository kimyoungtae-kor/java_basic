package diagram;

public class Cylinder extends Diagram{
	int r;
	int h;
	
	
	
    public Cylinder(int r, int h) {
        super();
    	this.r = r;
        this.h = h;
    }
	
	@Override
	public int length() {
		return 0;
	}

	@Override
	public int area() {
		return (int) ((2*Math.PI * r * h) + (2*r*r*Math.PI));
	}
	
	
	@Override
	public int volume() {

		return (int)(Math.PI * r * r *h);
	}

	@Override
	public String toStirng() {
		return "원기둥";
	}

}
