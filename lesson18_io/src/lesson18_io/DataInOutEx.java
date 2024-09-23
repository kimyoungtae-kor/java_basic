package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class DataInOutEx {
	public static void main(String[] args) throws IOException {
		String pi = Math.PI + "";
		char[] pis = pi.toCharArray();
		FileWriter fw = new FileWriter("원주율.txt");
		fw.write(pis);
		fw.close();
		
		//1.데이터를 파일로 저장
		//2. 파일로 저장된 데이터를 읽어와서 확인
		
		FileInputStream fis = new FileInputStream("원주율.txt");
		byte[] bs = fis.readAllBytes();
		String s = new String(bs);
		System.out.println(Double.parseDouble(s) + 1);
		fis.close();
	}
}
