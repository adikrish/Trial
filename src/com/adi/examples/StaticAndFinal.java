package com.adi.examples;


class Test
{
	
	public final int VAR1 = 10;
	public static int VAR2 = 20;
	public static final int VAR3 = 30;
	
	
}


public class StaticAndFinal {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.VAR2 =5;
		
		System.out.println(t1.VAR3);
		
	}

}
