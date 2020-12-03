package misc;

import java.util.concurrent.atomic.AtomicInteger;

public class sync {
	int x = 0;
	
	public void writer() {
		synchronized(this) {
			x = 1;
		}
		
	}
	
	public void reader() {
		synchronized(this) {
			int y = x;
		}
	}
	public static void main(String[] args) {
		AtomicInteger x = new AtomicInteger(1);
		new Thread(new Runnable() {
			public synchronized void run() {
				x.getAndIncrement();
				System.out.println(x);
			}
		}).start();
		
		new Thread(new Runnable() {
			public synchronized void run() {
				x.getAndIncrement();
				System.out.println(x);
			}
		}).start();

	}

}
