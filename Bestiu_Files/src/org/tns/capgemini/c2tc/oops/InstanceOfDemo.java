package org.tns.capgemini.c2tc.oops;

class Person5{
	
}
class Employee extends Person5{
	
}
class Manager extends Employee{
	
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		Person5 person=new Person5();
		Employee employee= new Employee();
		Manager manager=new Manager();
		System.out.println(employee instanceof Person5);
		System.out.println(employee instanceof Employee);
		System.out.println(employee instanceof Manager);
		System.out.println(manager instanceof Person5);
		System.out.println(manager instanceof Employee);
		System.out.println(manager instanceof Manager);
		System.out.println(person instanceof Person5);
		System.out.println(person instanceof Employee);
		System.out.println(person instanceof Manager);
	}

}