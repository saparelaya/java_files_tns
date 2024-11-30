package org.tns.capgemini.c2tc.collections;

import java.util.ArrayList;


class Person6
{
	String name;
	int age;
	
	
	Person6(String name ,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void displayinfo()
	{
		System.out.println("Name:" + name + " age:"+ age);
	}

	
	public int compareTo(Person6 other)
	{	
		return this.name.compareTo(other.name);
	}
	
}
	
public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person6> people=new ArrayList<>();
		people.add(new Person6("Laya",22));
		people.add(new Person6("Aneesha",23));
		people.add(new Person6("Srujana",22));
		
		for(Person6 person:people)
		{
			person.displayinfo();
		}

	}

}