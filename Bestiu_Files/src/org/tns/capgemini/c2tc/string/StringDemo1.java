package org.tns.capgemini.c2tc.string;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hello World";
		String s3="Greetings";
		String s4=new String("Greetings");
		String s5="Hello World";
		if(s3==s4)
		{
			System.out.println("Reference pointing to same object");
		}
		else 
		{
			System.out.println("Reference pointing to different object");
		}
	}

}