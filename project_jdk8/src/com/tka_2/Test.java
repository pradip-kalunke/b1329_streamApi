package com.tka_2;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		 
		Demo<Integer> nums = new Demo<Integer>();
		Demo<String> names = new Demo<String>();
		Demo<Student> students = new Demo<Student>();
		
		//names.printData(11);
		nums.printData(22);
		//nums.printData(new Student(22,"Raj"));
		nums.printData(33);
		//nums.printData("Pune");
		//nums.printData("Satara");
		names.printData("Mumbai");
		students.printData(new Student(22,"Raj"));
		 
		System.out.println("----------------");
		List<Integer> numsList = new ArrayList <> ();
		List<String> nameList = new ArrayList<>();
		List <Student>studentsList = new ArrayList<> ();
		
		numsList.add(11); 
		//numsList.add(new Student(22,"Raj")); // wrong
		numsList.add(33);
		//numsList.add("Pune"); // wrong
	//	numsList.add("Satara"); // wrong
		numsList.add(22);
		nameList.add("Mumbai");
	//	nameList.add(123);  // wrong
		studentsList.add(new Student(22,"Raj")); 
		  
		 
		  

	}

}
