package com.JDK8Feature;

public class SM_Reference {
	public static void main(String[] args) {
//		Runnable r = () -> {
//			for(int i=1;i<=5;i++)
//				System.out.println("child thread");
//		};
		Runnable r = SM_Reference :: m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=1;i<=5;i++)
			System.out.println("main thread");
	}
	public static void  m1() {
		for(int i=1;i<=5;i++)
			System.out.println("child thread");
	}
}
