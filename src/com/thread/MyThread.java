package com.thread;

public class MyThread implements Runnable{

	@Override
	public void run() {
		// Task for our Thread
		for(int i=0;i<=10;i++) {
			System.out.println("the value of first thread i "+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		  
	}
public static void main(String[] args) {
	MyThread t = new MyThread();
	Thread t1 = new Thread(t);
	SecondThread st = new SecondThread();
	t1.start();   
	st.start();
}
}
