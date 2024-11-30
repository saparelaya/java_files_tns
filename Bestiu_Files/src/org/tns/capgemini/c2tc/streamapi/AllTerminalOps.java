package org.tns.capgemini.c2tc.streamapi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays;

public class AllTerminalOps {

	public static void main(String[] args) {
		List<Integer> numbers=java.util.Arrays.asList(3,6,8,3,9,5,7);
		
		//1.foreach: print each number
		System.out.println("Numbers printed using foreach ");
		numbers.stream().forEach(n->System.out.println(n+" "));
		
		//2.to Array: convert stream to array
		Integer[] array=numbers.stream().toArray(Integer[]::new);
		System.out.println("Arrays: "+Arrays.toString(array));
		
		//3.reduce:sum of all numbers
		int sum1=numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of numbers: "+sum1);
		
		//4.collect:collect to list after filtering
		List<Integer>uniquenumber=numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Unique Numbers:" +uniquenumber);
		
		//5.min:find the minimum number
		Optional<Integer>min1=numbers.stream().min(Integer::compareTo);
		min1.ifPresent(value->System.out.println("Minimum number: "+value));
		
		//6.max:find the maximum number
		Optional<Integer>max1=numbers.stream().max(Integer::compareTo);
		max1.ifPresent(value->System.out.println("Maximum number: "+value));
		
		//7.count:count of numbers
		long count=numbers.stream().count();
		System.out.println("Count of numbers: "+count);
		
		//8.anymatch:check if any number is greater than 6
		boolean anygreaterthan=numbers.stream().anyMatch(n->n>6);
		System.out.println("Any number greater than 6: "+anygreaterthan);
		
		//9.allMatch:check if all numbers are positive
		boolean allpositivenumbers=numbers.stream().allMatch(n->n>0);
		System.out.println("No number are negative: "+allpositivenumbers);
		
		//10.noneMatch:check of no number is negative
		boolean nonenegative=numbers.stream().allMatch(n->n>0);
		System.out.println("No number are negative: "+nonenegative);
		
		//11.findfirst ->find the first element
		 
		 Optional<Integer> first=numbers.stream().findFirst();
		 first.ifPresent(value->System.out.println("first number: " + value));
		 
		 Optional<Integer> any=numbers.stream().findAny();
		 any.ifPresent(value->System.out.println("any number: " + value));
		 
		 
		
		
	}

}