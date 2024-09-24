package kiosk;

import java.util.Arrays;
import java.util.List;

public class tsetmain {
	public static void main(String[] args) {
		Service productService = new Service();
		Bag bag = new Bag();
		
		List<Product> foodmenu = productService.getCategory("3");
		foodmenu = productService.result();
		System.out.println("메뉴 : ");
		for(Product arr: foodmenu) {
//			System.out.println(arr.getProuductName());
			System.out.println(arr.getProuductName());
		}
	}
}
