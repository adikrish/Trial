package com.adi.examples;

import java.util.*;

public class UserInteraction {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			System.out.println(in.next());
		}
		
		in.close();
	}

}
