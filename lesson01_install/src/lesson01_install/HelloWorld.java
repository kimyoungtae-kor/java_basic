package lesson01_install;

public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println("안녕 ! 세상!");
		
		for(int i = 2; i <=9;i++) {
			for(int j = 2; j <= 9;j++) {
				System.out.printf("%2d*%2d=%2d",i,j,i*j);
			}
			System.out.println();
		}

	}

}
