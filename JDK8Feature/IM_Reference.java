package com.JDK8Feature;

public class IM_Reference {
	public static void main(String[] args) {
		Test t1 = new Test();
		Runnable r = t1 :: m2;
		Thread t = new Thread(r);
		t.start();
		for(int i=1;i<=5;i++)
			System.out.println("main thread");
	}
}
class Test{
	public void m2() {
		for(int i=1;i<=5;i++)
			System.out.println("child thread");
	}
}