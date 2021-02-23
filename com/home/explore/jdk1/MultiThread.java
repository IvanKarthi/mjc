package com.home.explore.jdk1;

public class MultiThread {
	public static void main(String s[]) {
		System.out.println("Started");
		FirstThread first = new FirstThread(2);
		Thread second = new Thread(new SecondThread(8));
		first.setPriority(Thread.MIN_PRIORITY);

		//Starting threads using the Thread constructor with anonymous classes
		Thread third = new Thread(new Runnable() {
			int count = 5;
			@Override
			public void run() {
				for (int i = count; i <= count + 5; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException ex) {
					}
					System.out.println("Third " + i);
				}
			}
		});
		first.start();
		second.start();
		third.start();
		try {
			first.join();
			second.join();
			third.join();
		} catch (Exception ex) {
		}
		System.out.println("Ended");
	}
}

//Starting Threads with extends
class FirstThread extends Thread {
	int count = 0;

	public FirstThread(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = count; i <= count + 5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
			}
			System.out.println("First " + i);
		}
	}

}

//Starting Threads using Runnable Interface
class SecondThread implements Runnable {
	int count = 0;

	public SecondThread(int count) {
		this.count = count;
	}

	public void run() {
		for (int i = count; i <= count + 5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
			}
			System.out.println("Second " + i);
		}
	}

}