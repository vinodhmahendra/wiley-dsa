package com.example.javase8;

public class UseRunnable {

	public static void main(String[] args) {
		Runnable r1  = ()-> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Running Thread1");
		};

		Runnable r2 = ()-> System.out.println("Running Thread2");
		
		new Thread(r1).start();
		new Thread(r2).start();
	}

}
