//write a predicate to accept string as the input and check the length of the given
//string is greater than 3 or not.

package com.JDK8Feature;

import java.util.function.Predicate;

public class PredicateQ1 {
	public static void main(String[] args) {
		Predicate<String> p1 = s-> s.length()>3;
		System.out.println(p1.test("Abhi"));
		System.out.println(p1.test("PW"));
		System.out.println(p1.test("AS"));
		System.out.println(p1.test("Manas"));
	}
}
