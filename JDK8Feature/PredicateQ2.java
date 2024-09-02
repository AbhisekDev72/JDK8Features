package com.JDK8Feature;

import java.util.function.Predicate;

public class PredicateQ2 {
	public static void main(String[] args) {
		int[] x = {0,5,10,15,20,25,30};
		
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i -> i%2==0;
		
		System.out.println("The no which are greater than 10 are :: ");
		print(p1, x);
		
		System.out.println("The no which are even no are :: ");
		print(p2, x);
		
		System.out.println("The no which are greater than 10 and even are :: ");
		print(p1.and(p2) ,x);
		
		System.out.println("The no which are greater than 10 or even are :: ");
		print(p1.or(p2), x);
		
		System.out.println("The no which are not greater than 10 are :: ");
		print(p1.negate(), x);
	}
	
	public static void print (Predicate<Integer> p,int[] x) {
		for(int data :x)
			if(p.test(data))
				System.out.println(data);
	}
}
