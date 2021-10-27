package com.CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.mongodb.connection.Stream;

import edu.emory.mathcs.backport.java.util.Arrays;

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
		System.out.println("After remove list: " + set);
	}

	// how to reverse value
	public static void reverse() {
		String name = "Mohammad Mizanur Rahman";
		for (int i = name.length() - 1; i > 0; i--) {
			System.out.println(name.charAt(i));
		}
		// how to do split?
	}

	public static void splitString() {
		String country = "United State Of America";
		String[] split = country.split(" ");
		System.out.println(Arrays.toString(split));
		for (String s : split) {
			System.out.println(s);
		}
	}// how to find any letter like e, or a, anything

	public static void findAnyletter() {
		String country = "United State Of America";
		for (int i = 0; i < country.length(); i++) {
			if (country.charAt(i) == 'e') {
				System.out.println(" this is e: " + country.charAt(i));
				System.out.println("index of e: " + i);//

			}
		} // find out which number contains 3?
	}

	public static void containsSpecific() {
		for (int i = 0; i <= 50; i++) {
			if (String.valueOf(i).contains("3")) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// removeDuplicat();
		// findDup();
		// reverse();
		// splitString();
		// findAnyletter();
		// containsSpecific();
		String num = "20";
		int i = Integer.parseInt(num);
		//System.out.println(i + 20);
		double d = Double.parseDouble(num);
		System.out.println(d-10);
        int x=10;
       System.out.println(String.valueOf(x)+10);
	}
}
