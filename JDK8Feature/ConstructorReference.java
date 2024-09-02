package com.JDK8Feature;

class Sample {
	private String s;
	Sample(String s){
		this.s = s;
		System.out.println("Constructor Executed");
	}
}
@FunctionalInterface
interface MyInterf{
	Sample get(String s);
}
public class ConstructorReference {
	public static void main(String[] args) {
		MyInterf i = s -> new Sample(s);
		i.get("From Lamda Expression");
		MyInterf i2 = Sample :: new;
		i2.get("From Method Reference");
	}
}
