package concurrent;

import java.io.IOException;
 
public class TestThread {
 
	public static void main(String[] args) throws IOException {
        final Test obj = new Test();
 

		new Thread() {
			public void run() {
				obj.m2();
			}
		}.start();
		new Thread() {
			public void run() {
				obj.m3();
			}
		}.start();
		new Thread() {
			public void run() {
				obj.m1();
			}
		}.start();
 
	}
 
}
 
class Test {
	static int count;
	volatile int target = 1;
 
	synchronized void m1() {
		for (int i = 0; i < 10; i++) {
			while (target == 2 || target == 3) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("m1() =" + i);
			target = 2;
			notifyAll();
		}
	}
 
	synchronized void m2() {
		for (int i = 0; i < 10; i++) {
			while (target == 1 || target == 3) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("m2() =" + i);
			target = 3;
			notifyAll();
		}
	}
 
	synchronized void m3() {
		for (int i = 0; i < 10; i++) {
			while (target == 1 || target == 2) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("m3() =" + i);
			target = 1;
			notifyAll();
		}
	}
}