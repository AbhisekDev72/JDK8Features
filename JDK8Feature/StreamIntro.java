package com.JDK8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntro {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		System.out.println(al);
		
		ArrayList<Integer> evenlist = new ArrayList<Integer>();
		for(Integer i1 : al)
			if (i1%2==0)
				evenlist.add(i1);
		System.out.println(evenlist);
		
		System.out.println("Using Stream api from JDK 1.8V");
//		al.stream().filter(i -> i%2==0).collect(Collectors.toList()).forEach(System.out::println);
		List<Integer> listResult = al.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(listResult);
		
//		al.stream().map(i -> i*2).collect(Collectors.toList()).forEach(System.out::println);
		List<Integer> doubleList = al.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(doubleList);

	}
}
