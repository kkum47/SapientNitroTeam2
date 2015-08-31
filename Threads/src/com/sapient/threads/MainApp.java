/**
 * 
 */
package com.sapient.threads;

/**
 * @author kkum47
 *
 */
	
class Data{
	private int value;
	
	public void getValue() {
		System.out.println(value);
	}
	public void setValue(int value) {
		this.value = value;
	}
}
class Runner implements Runnable{
	Data data;
	private Thread secondThread;
	public Runner() {
		data = new Data();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread currThread;
		for (int counter = 0; counter < 10; counter++) {
			currThread = Thread.currentThread();
			
			if (currThread.getName().equals("Producer")) {
				System.out.println(currThread);
				
				synchronized (data) {
					data.setValue(counter+1);
					data.notify();
					if (!secondThread.isAlive()) {
						secondThread.start();
					}
					
				}
			
				
			} else if (currThread.getName().equals("Consumer")) {
				System.out.println(currThread);
				data.getValue();
			}
		}
		System.out.println("Inside Run");
		for (int counter = 0; counter < 10; counter++) {
			System.out.println(Thread.currentThread());
		}
	}	
}

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println(mainThread);
		Runner runner = new Runner();
		
		Thread firstThread = new Thread(runner, "Producer");
		Thread secondThread =  new Thread(runner, "Consumer");
		
		firstThread.start();
		secondThread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The End");

	}

}
