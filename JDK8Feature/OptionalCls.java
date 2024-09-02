package com.JDK8Feature;

import java.util.Optional;
import java.util.Scanner;

class User{
/*	public String getUserNameById(Integer id){
		if(id==10)
			return "sachin";
		else if (id==7)
			return "dhoni";
		else if (id==18)
			return "Kohli";
		else 
			return null;
	}
*/
	public Optional<String> GetUserName(Integer id) {
		String name = null;
		if(id==10)
			name = "sachin";
		else if (id==7)
			name = "dhoni";
		else if (id==18)
			name = "Kohli";
		return Optional.ofNullable(name);
	}
}
public class OptionalCls {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user id :: ");
		int userId = sc.nextInt();
		
		User user = new User();
		/*
		String userName = user.getUserNameById(userId);
		String msg = "Hello " + userName.toUpperCase();
		System.out.println(msg);
		*/
		Optional<String> userName= user.GetUserName(userId);
		if (userName.isPresent()) {
			String name = userName.get();
			String msg = "Hello " + name.toUpperCase();
			System.out.println(msg);
		}
		else {
			System.out.println("No data found for the given id :: " + userId);
		}
			
	}
}
