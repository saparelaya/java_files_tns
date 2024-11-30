package org.tns.capgemini.c2tc.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllIntermediateOps {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//1.map() : Multiple each number by 2
		List<Integer> doubled=numbers.stream()
				.map(n->n*2)
				.collect(Collectors.toList());
		System.out.println("Doubled: "+doubled);
		
		//2.filter(): keep only even numbers
		List<Integer> evens=numbers.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
		System.out.println("Even: "+evens);
		
		//3.distinct(): remove duplicates
		List<Integer> uniqueNumbers=numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Unique Numbers: "+uniqueNumbers);
		
		//4.sorted():sort the numbers in ascending order
		List<Integer> SortedNumbers=numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Sorted Numbers: "+SortedNumbers);
		
		//5.limit():take only first 3 elements
		List<Integer> LimitedNumbers=numbers.stream()
				.limit(3)
				.collect(Collectors.toList());
		System.out.println("Limited Numbers: "+LimitedNumbers);
		
		//6.Skip(): skip the first 4 elements
		List<Integer> SkipNumbers=numbers.stream()
				.skip(4)
				.collect(Collectors.toList());
		System.out.println("Skip Numbers: "+SkipNumbers);
		
	
		
	}

}