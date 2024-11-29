package org.tns.capgemini.c2tc.oops;

class Animal{
	String name="Animal";
	void eat() {
		System.out.println(name + "is eating" );
	}
}

class dog extends Animal{
	void bark() {
		System.out.println(name + "is barking");
	}
}
public class SingleLevelInheritance {

	public static void main(String[] args) {
		dog dog=new dog();
		dog.eat();
		dog.bark();
	}

}