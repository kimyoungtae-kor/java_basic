package lesson13_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Double> vector = new Vector<Double>();
		
		//add, size, get
		
		vector.add(Math.PI);
		System.out.println(vector.size());
		System.out.println(vector.get(0));
		
		vector.addElement(Math.E);
		System.out.println(vector.elementAt(1));
		
		vector.removeElement(Math.PI);
		System.out.println(vector);
		//생성자를통한 클론
		List<Double> list = new ArrayList<Double>(vector);
		
		System.out.println(list);
		//Vector : legacy class
	}
}
