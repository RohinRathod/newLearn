package com.practice.leet;

public class Multithreading {

	public static void main(String[] args) {
		Mi obj = new Mi();
		Thread threadobj = new Thread(obj);
		Thread threadobj2 = new Thread(obj);
		threadobj.start();
		threadobj.start();
		threadobj.start();
		System.out.println("hello");

//		final StringBuilder sharedBuilder = new StringBuilder("Hello");
//		Runnable task = () -> {
//			for (int i = 0; i < 1000; i++) {
//				String newString = sharedBuilder + " World"; // Creates a new String object
//				System.out.println(Thread.currentThread().getName() + ": " + newString);
//				try {
//					// Thread.sleep(100); // Simulate work
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		};
//
//		Thread thread1 = new Thread(task);
//		Thread thread2 = new Thread(task);
//
//		thread1.start();
//		thread1.start();

	}

}

class Mi implements Runnable {
	public synchronized void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(i + " - " + Thread.currentThread().getName());
				// Pause for 1 second
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
