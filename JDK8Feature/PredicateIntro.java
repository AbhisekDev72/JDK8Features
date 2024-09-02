package com.JDK8Feature;

import java.util.function.Predicate;

public class PredicateIntro {
	public static void main(String[] args) {
		Predicate<Integer> p = i-> i<10;
		System.out.println(p.test(100));
		System.out.println(p.test(7));
	}
}
