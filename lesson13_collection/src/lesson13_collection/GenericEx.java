package lesson13_collection;

public class GenericEx {
	public static void main(String[] args) {
		Box<Integer,String,Object> box = new Box<>();
		box.setItem("10");
		
		String result = (String)box.getItem();
		System.out.println(result);
	}
}
class Box<T,R,V>{
	private R item;
	
	
	
	public R getItem() {
		return item;
	}



	public void setItem(R item) {
		this.item = item;
	}


//
//	void swap(Object o1,Object o2) {
//		Object tmp = o1;
//		o1 = o2;
//		o2 = tmp;
//	}
}
