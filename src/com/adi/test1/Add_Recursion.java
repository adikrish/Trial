package com.adi.test1;

public class Add_Recursion {

	public static void main(String[] args) {
		
int result = addR(10);

System.out.println(result);

	}

	private static int addR(int i) {
		
if(i == 1)
{
	return 1;
}

return i+ addR(i-1);
	}

}
