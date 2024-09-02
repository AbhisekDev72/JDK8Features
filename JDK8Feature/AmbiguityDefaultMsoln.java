package com.JDK8Feature;
interface interf2{
	default void m2() {
		System.out.println("Default from Interf2..");
	}
}
interface interf3{
	default void m2() {
		System.out.println("Default from Interf3..");
	}
}
public class AmbiguityDefaultMsoln implements interf2,interf3{
	
	public static void main(String[] args) {
		AmbiguityDefaultMsoln s = new AmbiguityDefaultMsoln();
		s.m2();
	}
	@Override
	public void m2() {
//		System.out.println("Implementation from child clas...");
		interf2.super.m2();
		interf3.super.m2();
	}
}
