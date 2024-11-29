package org.tns.capgemini.c2tc.java;

public class VariableDemo 
{
	int a=20;
	void print()
	{
		String msg="hello";
		System.out.println(msg);
	}
	static String message="hello laya";

	public static void main(String[] args) 
	{
		VariableDemo obj=new VariableDemo(); 
		System.out.println("the value of a is "+obj.a);
		obj.print();
		System.out.println(message);

	}

}