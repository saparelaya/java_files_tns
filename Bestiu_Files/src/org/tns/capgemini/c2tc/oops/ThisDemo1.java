package org.tns.capgemini.c2tc.oops;

class person{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
	public void displayDetails()
	{
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

public class ThisDemo1 {

	public static void main(String[] args) {
		 person obj=new  person();
		 obj.setName("alice");
		 obj.setAge(20);
		 obj.setName("joel");
		 obj.setAge(30);
		 obj.getName();
		 obj.getAge();
		 obj.displayDetails();

	}

}