package com.jdk8;

public interface X {

	static final int a = 10 ;   // pure constant - static-final
	
	void m1();  //public abstract void m11();
	
	public static void m2() {
		System.out.println("Static > Self Parent only");
	}
	 
	 // non-static/non-private/non-final /non-instance 
	public default void m3() {
		System.out.println("--- > Child only");
	}

}
