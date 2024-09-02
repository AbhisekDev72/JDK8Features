package com.JDK8Feature;

import java.util.function.Function;

public class FunctionIntro {
	public static void main(String[] args) {
		Function<String,Integer> function = s -> s.length();
		System.out.println(function.apply("sachin"));
		System.out.println(function.apply("kohli"));
		System.out.println(function.apply("abhisek"));
	}
}
