package org.tns.capgemini.c2tc.collections;

import java.util.LinkedHashSet;

public class LinkedListSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add("apple");
		set.add("Dragon fruit");
		set.add("pomegranate");
		set.add(null);
		set.add(null);
		System.out.println("LinkedHashSet   " + set);
	}

}