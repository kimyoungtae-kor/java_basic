package lesson18_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Object05 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		

		
//		List<String> list = new ArrayList<String>(Arrays.asList("가","나","다"));
		List<Member> members = new ArrayList<Member>(Arrays.asList(new Member("홍길동",40),new Member("김길동",40)));
		System.out.println(members);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		oos.writeObject(members);
//		oos.writeObject(list);
//		
		ObjectInputStream dis = new ObjectInputStream(new FileInputStream("oos.txt"));
//		System.out.println(dis.readObject());
		
		List<Member> result = (List<Member>)dis.readObject();
		result.forEach(System.out::println);
	}
}
class Member implements Serializable {
	String name;
	transient int age; //암호화할때 직렬제외
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}
