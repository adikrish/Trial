package com.adi.examples;

public class StringTest {

	public static void main(String[] args) {
		
		String a = "Adithya";
		String b = "Adithya";
		String c = new String("Adithya");
		String d = new String("Adithya");
		
//		System.out.println("Hashcodes :");
//		System.out.println("a : " + a.hashCode());
//		System.out.println("b : " + b.hashCode());
//		System.out.println("c : " + c.hashCode());
		
		if(a == b) { 
			System.out.println("Same references : a and b");
		}
		
		
		if(a == c) { 
			System.out.println("Same references : a and c" );
		}

		if(c == d) { 
			System.out.println("Same references : a and c" );
		}
		
	}

}
