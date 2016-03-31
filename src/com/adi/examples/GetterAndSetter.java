package com.adi.examples;

public class GetterAndSetter {

	private String Name;
	protected int age;
	public char initial;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getInitial() {
		return initial;
	}
	public void setInitial(char initial) {
		this.initial = initial;
	}
	
	public static void main(String args[])
	{
		GetterAndSetter person1 = new GetterAndSetter();
		person1.setName("Adithya");
		System.out.println(person1.getName());
		
		GetterAndSetter person2 = new GetterAndSetter();
		System.out.println(person2.getName());
	}
		
}
