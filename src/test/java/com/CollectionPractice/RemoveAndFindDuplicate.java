package com.CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.mongodb.connection.Stream;

public class RemoveAndFindDuplicate {
// how to find the duplicate
	public static void findDup() {
		List<String> num = new ArrayList<>();
		num.add("Mizan");
		num.add("Mizan");
		num.add("sultana");
		num.add("munia");
		Set<String> set = new HashSet<>();
		for (String duplicat : num) {
			if (set.add(duplicat) == false) {
				System.out.println("My duplicat value is: " + duplicat);
			}

		}

	}
// how to remove the value
	public static void removeDuplicat() {
		List<Integer> set = new ArrayList<>();
		set.add(50);
		set.add(50);
		set.add(50);
		set.add(50);
		set.add(50);
		System.out.println("This is list value: " + set);
		set = set.stream().distinct().collect(Collectors.toList());
		System.out.println("After remove list: "+set);
	}
	// how to reverse value
	public static void reverse() {
		String name = "Mohammad Mizanur Rahman";
		for ( int i=name.length()-1; i>0; i--) {
			System.out.println(name.charAt(i));
		}
	}

	public static void main(String[] args) {
		//removeDuplicat();
		//findDup();
		reverse();
	}
}
