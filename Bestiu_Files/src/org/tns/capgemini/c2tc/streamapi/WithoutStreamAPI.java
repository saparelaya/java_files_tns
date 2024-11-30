package org.tns.capgemini.c2tc.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class WithoutStreamAPI {
    public static void main(String[] args) {
        // Original list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // List to hold the results
       List<Integer> result = new ArrayList<>();
       	// Iterate over each number in the original list
        for (Integer number : numbers) {
            // Check if the number is even
            if (number % 2 == 0) {
                // Double the even number
                int doubled = number * 2;
                // Add the doubled number to the result list
                result.add(doubled);
            }
        }
        // Print the result list
        System.out.println("Doubled even numbers: " + result);
    }
}

