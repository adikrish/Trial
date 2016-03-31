package com.adi.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SampleArrayList {

	public static void main(String[] args) {
		
ArrayList<String> list = new ArrayList<String>();

list.add("5");

list.add("Hi");

list.add("3");

Collections.sort(list);
System.out.println(list.get(2));
	}

}
