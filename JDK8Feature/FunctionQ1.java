/*Write a program to find the student grade using "function".
marks
a. 80 and above :: A[Distinction]
b. 60 and above :: B[FirstClass]
c. 50 and above :: C[SecondClass]
d. 35 and above :: D[ThirdClass]
e. otherwise :: E[Failed]
*/
package com.JDK8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
class Student {
	String name;
	int marks;
	public Student(String name , int marks) {
		this.name = name;
		this.marks = marks;
	} 
	@Override
	public String toString() {
		return "Student {" + "name = '" + name + "\'"  + "marks = " + marks + "}";
	}
}
public class FunctionQ1 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		populate(list);
		Function<Student, String> function = s -> {
			int marks = s.marks;
			if (marks>=80)
				return "A[Distinction]";
			else if (marks>=60)
				return "B[FirstClass]";
			else if (marks>=50)
				return "C[SecondClass]";
			else if (marks>=35)
				return "D[ThirdClass]";
			else
				return "E[Failed]";
		};
		printResult(function,list);
	}

	private static void printResult(Function<Student, String> function, List<Student> list) {
		for(Student student : list)
			System.out.println(student + ":: " + function.apply(student));
	}

	private static void populate(List<Student> list) {
		list.add(new Student("sachin",100));
		list.add(new Student("saurav",80));
		list.add(new Student("dhoni",70));
		list.add(new Student("kohli",50));
		list.add(new Student("yuvi",30));
	}
}
