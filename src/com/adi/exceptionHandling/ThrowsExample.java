package com.adi.exceptionHandling;

public class ThrowsExample {

	public static void main(String[] args) {
		
		ThrowsExample obj = new ThrowsExample();
		
		try {
			obj.fun();
		} catch (Exception e) {

			System.out.println("Laaa re babaaaa ");
			e.printStackTrace();
		}
		
	}
	
	
	public void fun() throws Exception
	{
		throw new MyOwnException("Pakdooooooo Exception");
	}

}


class MyOwnException extends Exception
{

	
	public MyOwnException(String e){
		super(e);
	}
}


