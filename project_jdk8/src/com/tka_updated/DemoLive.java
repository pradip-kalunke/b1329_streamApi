package com.tka_updated;

import java.util.ArrayList;
import java.util.List;

public class DemoLive { // Server / AWS -- Capg --> Airtel / Jio/ Idea

	public static void main(String[] args) {

		System.out.println("=====Airtel Network User ===========");

		// Object construction = new AirtelNet();
		NetworkGovt airtelUser =

				(int t) -> System.out.println("Calling via..Airtel...");

		// method calls
		airtelUser.doCall(3);

		List al = new ArrayList();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);

		al.forEach(t -> System.out.println(t));
	}

}
