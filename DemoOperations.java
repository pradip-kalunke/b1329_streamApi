package com.tka_stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoOperations {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();// 10000
		names.add("Pune");
		names.add("Mumbai");
		names.add("Nashik");
		names.add("Satara");
		names.add("Akola");
		names.add("SambhajiNagar");
		names.add("ShivajiNagar");
		
		names.forEach(System.out::println);

		System.out.println("\n 1. Print city names whose start 'S' ");
		names.stream().filter(n-> n.startsWith("S")).forEach(System.out::println);
		
		System.out.println("\n 2. Print city names UPPER CASE");
		names.stream().map(n-> n.toUpperCase()).forEach(System.out::println);
		
		long cnt = names.stream().filter(n-> n.length() > 6).count();
		System.out.println("\n 3. Print count names 6 chrs : "+ cnt );
		
	}
}
