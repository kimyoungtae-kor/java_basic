package lesson08_extend;

public class SmartPhone extends Phone{
	
	

	public SmartPhone(String name, String color, String company) {
		super(name, color, company);
		// TODO Auto-generated constructor stub
	}

	public void installApp() {
		System.out.println("앱 설치");
	}
}
