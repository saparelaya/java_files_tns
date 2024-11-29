package org.tns.capgemini.c2tc.oops;

class Human1{
	private int age;
	private String name;
	  public void setAge(int a) {
		  age=a;
	  }
	  public int getAge() {
		  return age;
	  }
	  public void setName(String b) {
		  name=b;
	  }
	  public String getName() {
		  return name;
	  }
}
public class Encapsulation {

	public static void main(String[] args) {
		Human1 obj1=new Human1();
		Human1 obj2=new Human1();
		obj1.setAge(21);
		obj2.setName("Laya Sapare");
		System.out.println(obj1.getAge());
		System.out.println(obj2.getName());
		
		
	}

}