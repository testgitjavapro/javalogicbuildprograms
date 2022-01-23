package com.thread;
public class Thread {

	public static void main(String[] args) {
		System.out.println("This is main thread");
		MyThread t = new MyThread();
		t.run();
		

	}

}
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("My Thread");
	}
}
