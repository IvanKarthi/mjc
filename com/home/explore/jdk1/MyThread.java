package com.home.explore.jdk1;

import static java.lang.System.out;

public class MyThread extends Thread {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new MyThread());
		t1.start();
		// t1.start(); //will trhow java.lang.IllegalThreadStateException
	}

	// }

	public void run() {
		out.println(MIN_PRIORITY);
		out.println(NORM_PRIORITY);
		out.println(MAX_PRIORITY);
	}
}