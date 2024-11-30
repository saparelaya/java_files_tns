package org.tns.capgemini.c2tc.generics;

import java.util.List;
import java.util.ArrayList;
public class LowerBound {

	public static void addNumbers(List<? super Integer> list)
	{
		list.add(1);
		list.add(8);
		//list.add(2.3); //compliation error 
	}
	
	public static void printList(List<?> list)
	{
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		List<Integer> integerList=new ArrayList<>();
		addNumbers(integerList);
		printList(integerList);
	}

}