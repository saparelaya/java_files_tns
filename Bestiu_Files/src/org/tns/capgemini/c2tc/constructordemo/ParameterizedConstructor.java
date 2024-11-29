package org.tns.capgemini.c2tc.constructordemo;

class MyClass2
{
	String color;
	int cost;
	String brand;
MyClass2(String color,int cost,String brand)
{
	this.color=color;
	this.cost=cost;
	this.brand=brand;
}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		MyClass2 obj=new MyClass2("white",500,"audi");
		MyClass2 obj2=new MyClass2("black",600,"BMW");
		System.out.println(obj.color+" "+obj.cost+" "+obj.brand);
		System.out.println(obj2.color+" "+obj2.cost+" "+obj2.brand);
	}

}