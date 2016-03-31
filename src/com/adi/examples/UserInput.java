package com.adi.examples;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double value = in.nextDouble();
		
		System.out.println(value);

		in.close();
	}

}
