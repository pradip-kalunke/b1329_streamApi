package com.tka_stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoSorting {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		nums.add(16);
		nums.add(11);
		nums.add(22);
		nums.add(-7);
		nums.add(44);
		nums.add(55);
		
		List<Integer> numsCopy = nums ;

		System.out.println("DB Orignal list >> ");
		nums.forEach(System.out::println);
		
		System.out.println("\n1. >= 20  ");
		
		System.out.println("\n2. == brand ");
		
		System.out.println("\n3. > sorted cost ");
		// how to sort list [Integer] ?? 
		// Collections.sort(nums);   //  / effected into list .. 
		Stream<Integer> sortedNums = nums.stream().sorted();
		
		sortedNums.forEach(System.out::println);
		
		System.out.println("\n4. rating");
		
		System.out.println("\nDB Orignal list >> ");
		nums.forEach(System.out::println);
		
		
	}
}
