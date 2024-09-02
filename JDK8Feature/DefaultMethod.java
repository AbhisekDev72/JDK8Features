package com.JDK8Feature;

interface Interf{
	default void m1(){
		System.out.println("Default Method...");
	}
}
public class DefaultMethod implements Interf {
	public static void main(String[] args) {
		Interf i = new DefaultMethod();
		i.m1();
	}
}
