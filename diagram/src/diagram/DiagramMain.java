package diagram;

import java.util.Arrays;

public class DiagramMain {
	public static void main(String[] args) {
		Diagram[] diagram = new Diagram[4];
		diagram[0] = new Circle(5);
		diagram[1] = new Squre(4);
		for(Diagram d: diagram) {
			System.out.println(d);
			System.out.println("원의둘레 :"+d.length(5));
			System.out.println("원의넓이 :" +d.area(5));
			System.out.println();
		}

		
	}
}
