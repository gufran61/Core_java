package com.thread;

public class Mian {
public static void main(String[] args) {
	Company c = new Company();
	Consume cm = new Consume(c);
	Produce p = new Produce(c); 
	cm.start();
	p.start();
	
}
}
