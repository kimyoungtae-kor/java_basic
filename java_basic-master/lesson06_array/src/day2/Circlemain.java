package day2;

public class Circlemain {
	public static void main(String[] args) {
//		Circle circle = new Circle(5);
//		circle.printArea();
//		circle.printRound();
		
		new Circle().setR(5).printArea().printRound().setR(10).printArea().printRound();
	}
}
