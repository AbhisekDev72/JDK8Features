package com.JDK8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(0);
		al.add(5);
		al.add(25);
		al.add(15);
		System.out.println(al); 
		
		List<Integer> result = al.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		List<Integer> customizedResult = al.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(customizedResult);
		
	}
}
