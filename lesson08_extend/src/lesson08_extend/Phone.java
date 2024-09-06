package lesson08_extend;

public class Phone {
	String name;
	String color;
	String company;
	public Phone(String name, String color, String company) {
		super();
		this.name = name;
		this.color = color;
		this.company = company;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName()+" [name=" + name + ", color=" + color + ", company=" + company + "]";
	}
	void call() {
		System.out.println("전화를 건다");
	}
	void receive() {
		System.out.println("전화를 받다");
	}

}
