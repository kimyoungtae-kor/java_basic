package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Service {

	private List<Product> list = new ArrayList<>();
	
	public Service() {
		list.add(new Food("삼겹살",10,"1"));
		list.add(new Food("목살",10,"1"));
		list.add(new Drink("콜라",10,"3"));
		list.add(new Drink("사이다",10,"3"));
	}
	
	public List<Product> getCategory(String cate) {
		List<Product> list2 = new ArrayList<>();
		for(Product product : list) {
			if(product.getCategory().equals(cate)) {
				list2.add(product);
			}
		}
		return list2;
	}
	
	public List<Product> result(){
		List<Product> allList = list;
		return allList;
	}
}	
