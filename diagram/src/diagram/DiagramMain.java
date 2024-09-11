package diagram;

import java.util.Arrays;

public class DiagramMain {
	public static void main(String[] args) {
		Diagram[] diagram = new Diagram[4];
		diagram[0] = new Circle(5);
		diagram[1] = new Squre(4,5);
		diagram[2] = new Cylinder(5, 10);
		diagram[3] = new Hexagon(5, 5, 5);
		for (Diagram d : diagram) {
            System.out.println(d.toStirng());
            if(d.length() >0) {
                System.out.println("둘레: " + d.length());       	
            }
            System.out.println("넓이: " + d.area());
            if(d.volume()>0) {
                System.out.println("부피:" + d.volume());          	
            }
            
            System.out.println();
        }

		
	}
}
