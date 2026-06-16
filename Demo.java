package com.tka_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> nums =  new ArrayList<>();
		nums.add(11);
		nums.add(22);
		nums.add(25);
		nums.add(33);
		nums.add(44);
		nums.add(55);
		
		// logic 
//		for (Integer n : nums) { 	// 1. iterate list
//			if(n % 2== 0 == true)			// 2. apply condition[%2]
//			{
//				System.out.println(n); // 3. action --print/add/square/////
//			}
//		}
		
		//1 print even nums from list = 3 line of code 
	 	nums.stream().filter(n-> (n % 2==0)).forEach(System.out::println);
	
		System.out.println("----------------------");
		
		//2 Generate new oddNum list from   given list ---  5 line of code 
		List<Integer> oddList = nums.stream().filter(n-> (n % 2 !=0 ))
										.collect(Collectors.toList());
		System.out.println(oddList);

		
//		List <Integer> oddList = new ArrayList<>();
//		for (Integer n : nums) { 	// 1. iterate list
//			if(n % 2 != 0 )			// 2. apply condition[%2]
//			{
////				System.out.println(n); // 3. action --print /////
//				oddList.add(n);						// 3. action -- add /////
//			}
//		}
//		System.out.println(oddList);
	}
}
