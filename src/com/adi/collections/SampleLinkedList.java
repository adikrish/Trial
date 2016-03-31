package com.adi.collections;

import java.util.Collections;
import java.util.LinkedList;

public class SampleLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("5");
		ll.add("2");
		ll.add("1");
		ll.add("3");
		ll.add("4");

		ll.removeFirst();
		Collections.sort(ll);
		
		printList(ll);
		
	}

	private static void printList(LinkedList<String> ll) {
		
		for(String tmp : ll)
		{
			System.out.println(tmp);
		}
		
	}

}
