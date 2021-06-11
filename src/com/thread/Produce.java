package com.thread;

public class Produce extends Thread {
Company c;
Produce(Company c){
	this.c=c;
}
public void run() {
	int i=1;
	while(true) {
		try {
			this.c.produce_item(i);
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
