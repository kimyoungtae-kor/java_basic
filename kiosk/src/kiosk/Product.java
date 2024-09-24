package kiosk;

public class Product {
	private int price;
	private String prouductName;
	private String category;
	public Product(String name,int price,String category) {
		this.prouductName = name;
		this.price = price;
		this.category =category;
	}
	public int getPrice() {
		return price;
	}
	public String getProuductName() {
		return prouductName;
	}

	public String getCategory() {
		return category;
	}

}
