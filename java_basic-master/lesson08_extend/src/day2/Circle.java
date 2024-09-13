package day2;

import day2.ex2.Circle;

public class Circle {
	double r;
	
	
	
	public Circle() {
	
		
	}
	public Circle(double r) {
		setR(r);
	}
	
	Circle setR(double r) {
		
		this.r = r;
		return this;
	}
	
	Circle printRound() {
		System.out.println(Math.PI * r * 2);
		return this;
	}
	
	Circle printArea() {
		System.out.println(Math.PI * r * r);
		return this;
	}
	
	Circle test() {
		double r = 0;
		System.out.println(this.r);
		return this;
	}
}
