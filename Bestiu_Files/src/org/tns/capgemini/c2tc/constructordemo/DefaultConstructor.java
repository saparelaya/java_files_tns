package org.tns.capgemini.c2tc.constructordemo;

class MyClass1
{
	String color;
	int cost;
	String brand;

MyClass1()
{
	color="Black";
	cost=500;
	brand="LV";
}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		MyClass1 obj=new MyClass1();
		System.out.println(obj.color + " " + obj.cost + "  " + obj.brand);
	}

}