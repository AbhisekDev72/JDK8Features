package com.JDK8Feature;

import java.util.*;
import java.util.stream.Collectors;

public class StreamIntro1 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("sachin");
		names.add("saurav");
		names.add("dhoni");
		names.add("yuvi");
		
		names.stream().filter(name -> name.length()>5).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("**********************************");
		
		names.stream().map(name-> name.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("**********************************");

		names.stream().map(name-> name.equals("sachin")).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("**********************************");
		
		long count = names.stream().filter(name->name.length()>5).count();
		System.out.println("The no of player whose name is greater than 5 are :: " + count);
	}
}
