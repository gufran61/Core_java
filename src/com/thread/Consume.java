package com.thread;

public class Consume extends Thread {
	Company c;
	Consume(Company c){
		this.c=c;
	}
	public void run() {
		int i=1;
		while(true) {
			try {
				this.c.consume_item();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}
	}
}
