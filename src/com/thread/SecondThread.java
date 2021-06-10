package com.thread;

public class SecondThread extends Thread{

public void run() {
	for(int i =10;i>=1;i-- ) {
		System.out.println("the value of  second thread i  "+i);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
	
}
