package org.tns.capgemini.c2tc.oops;
class Animal4{
	Animal4()
	{
		System.out.println("Animal Constructor");
	}
}
class Dog5 extends Animal4 {
	Dog5(){
		System.out.println("Dog constructor");
	}
	void display() {
		System.out.println("This is a dog");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		Dog5 dog=new Dog5();
		dog.display();

	}

}
