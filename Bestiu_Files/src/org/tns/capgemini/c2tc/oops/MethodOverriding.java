package org.tns.capgemini.c2tc.oops;

class Animal3{
	void makesound() {
		System.out.println("Animal is making a sound");
	}
}
class Dog4 extends Animal3{
	void makesound() {
		System.out.println("Dog barks");
	}
}
class cat2 extends Animal3{
	void makesound() {
		System.out.println("Cat meows");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Animal3 myAnimal=new Animal3();
		Animal3 mydog=new Dog4();
		Animal3 mycat=new cat2();
		myAnimal.makesound();
		mydog.makesound();
		mycat.makesound();
	}

}
