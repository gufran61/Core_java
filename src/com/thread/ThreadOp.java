package com.thread;
class Test extends Thread{
	public void run() {
		System.out.println("in run thread");
	}
}

public class ThreadOp {
public static void main(String[] args) {
	System.out.println("programe started");
	int x =1+2;
	System.out.println("The value of x= "+x);
	//thread
	Thread ct = Thread.currentThread();
	String name = ct.getName();
	System.out.println("the name of current thread ="+name);
	//set name
	ct.setName("gufran");
	System.out.println("get current name ="+ct.getName());
	System.out.println("id of thread ="+ct.getId());
	
	try {
		Thread.sleep(5000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	Test t = new Test();
	t.start();
	System.out.println("programe ended");
}
}
