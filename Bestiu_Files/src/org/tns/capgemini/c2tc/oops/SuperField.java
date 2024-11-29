package org.tns.capgemini.c2tc.oops;

class Animal5{
	String name="Animal";
}
class dog6 extends Animal5 {
	String name="DOG";
	void display() {
		System.out.println("super class name:" +super.name);
		System.out.println("sub class name:" +name);
	}
}

public class SuperField {

	public static void main(String[] args) {
		dog6 dog=new dog6();
		dog.display();
	}

}