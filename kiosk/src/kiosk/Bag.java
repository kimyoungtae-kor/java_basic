package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Bag {
	private List<Product> list = new ArrayList<>();
	public void addItem(List food) {
		list.add((Product) list);
	}
	public List<Product> getlist() {
		List<Product> list2 = new ArrayList<>();
		for(Product product : list) {
			if(product.getProuductName() != null) {
				list2.add(product);
			}
		}
		return list2;
	}
}
