package lesson09_interface;

@UserAnno(value = "hey")
public class UserClass {
	@UserAnno("hi")
	void m() {
		
	}
	@UserAnno(value = "World",number = 10)
	@SuppressWarnings("unused")
	void m2() {
		
	}
	@UserAnno({"g","f","d"})
	int i;
}
