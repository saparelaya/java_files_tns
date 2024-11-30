package org.tns.capgemini.c2tc.generics;

public class GenericMethod {

	public static <T> void display(T[]  array)
	{
		for(T element:array)
		{
			System.out.println(element + " ");
	}
	
	}
	
	public static void main(String[] args) {
	
		Integer[] intArray = {1,2,3,4,5};
		System.out.println("Integer array:  ");
		display(intArray);
		
		String[] strArray = {"apple","pineapple","mango"};
		System.out.println("String array:     ");
		display(strArray);
		
		Double[] dbArray= {1.22 ,2.33};
		System.out.println("Double array:  ");
		display(dbArray);
		
				
		}

	}
