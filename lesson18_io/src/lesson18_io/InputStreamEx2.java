package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx2 {
	public static void main(String[] args) throws IOException {
		//EOF : End of File
		
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		byte[] bytes = new byte[5];
		

		int i =0;
		while((fis.read(bytes) ) != -1) {
			System.out.println(Arrays.toString(bytes));
		}
		fis.close();


	}
}
