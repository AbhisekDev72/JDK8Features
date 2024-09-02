//Need of default method
package com.JDK8Feature;

interface Interf1{
	default void m1(){
		System.out.println("Default Method...");
	}
}
public class DefaultMethod1 implements Interf1 {
	@Override
	public void m1(){
		System.out.println("Default Method From Child...");
	}
	public static void main(String[] args) {
		Interf1 i = new DefaultMethod1();
		i.m1();
		
	}
}
