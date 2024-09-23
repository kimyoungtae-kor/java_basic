package lesson17_thread;

import java.lang.Thread.State;
import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadEx {
	public static void main(String[] args) {
		new ThreadExtend().start();
		new Thread(new RunnableImpl()).start();
	}
}
class ThreadExtend extends Thread{



	@Override
	public void run() {
		System.out.println("쓰레드 상속");
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println("쓰레드 상속"+i);
		}
	}

	
	
}
class RunnableImpl implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable 구현");
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println("Runnable 구현" + i);
		}
	}
}
