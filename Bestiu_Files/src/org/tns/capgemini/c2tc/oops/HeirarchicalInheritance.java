package org.tns.capgemini.c2tc.oops;
class Animal2{
	void eat() {
		System.out.println("Animal is eating ");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("Dog is barking ");
	}
}
class cat extends Animal2{
	void meow() {
		System.out.println("cat is meowing ");
	}
}
class Elephant extends Animal2{
	void trumphet() {
		System.out.println("Elephant is trumpeting ");
	}
}
public class HeirarchicalInheritance {

	public static void main(String[] args) {
		Dog2 dog=new Dog2();
		cat cat=new cat();
		Elephant ele=new Elephant();
		
		dog.eat();
		cat.eat();
		ele.eat();
		
		dog.bark();
		cat.meow();
		ele.trumphet();
	}
}