package lesson_11_exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ExceptionEx09 {
	public static void main(String[] args){
		System.out.println(Arrays.toString(	"가".getBytes()));
		try (FileOutputStream fos = new FileOutputStream("1.txt")){
			byte[] bs = {'A','B','C','D','E',234-256,176-256,128-256};
			fos.write(bs);	
		}catch (IOException e){
			e.printStackTrace();
		}
					}
		
	}
