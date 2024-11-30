package org.tns.capgemini.c2tc.generics;

import java.util.List;

public class UnboundedWildCard {

	public static void printList(List<?> list)
	{
		for(Object element:list)
		{
			System.out.println(element + " ");
		}
	}
	
	public static void main(String[] args) {
		//list of integer
		List<Integer> inlist=List.of(1,2,3,4,5);
		System.out.println("Integer List:  ");
		printList(inlist);
		
		
		//list of string 
		List<String> strlist=List.of("cherry","mango","banana");
		System.out.println("String List:  ");
		printList(strlist);
				
	}

}