package org.tns.capgemini.c2tc.oops;

class Animal6{
	void makesound(){
		System.out.println("Animal is making a sound");
	}
}
class Dog7 extends Animal6{
	void makesound() {
		super.makesound();{
			System.out.println("Dogs bark");
		}
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		Dog7 dog=new Dog7();
		dog.makesound();

	}

}