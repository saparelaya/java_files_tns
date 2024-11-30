package org.tns.capgemini.c2tc.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
public class WithStreamAPI {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> result=numbers.stream()
				                    .filter(n -> n % 2 ==0)
				                    .map(n -> n *2)
				                    .sorted()
				                    .collect(Collectors.toList());
		System.out.println(result);

	}

}