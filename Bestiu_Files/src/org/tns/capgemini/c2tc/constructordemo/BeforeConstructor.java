package org.tns.capgemini.c2tc.constructordemo;

class MyClass{
	String color;
	int cost;
	String brand;
}
public class BeforeConstructor {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		System.out.println(obj.color+" "+obj.cost+" "+obj.brand);
	}
}
