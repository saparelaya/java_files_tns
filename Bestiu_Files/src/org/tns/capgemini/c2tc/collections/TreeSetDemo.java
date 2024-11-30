package org.tns.capgemini.c2tc.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("apple");
		set.add("Dragon fruit");
		set.add("pine apple");
//		set.add(null); // it will not allow ,throws an exception
		System.out.println("Treeset " +set);

	}

}