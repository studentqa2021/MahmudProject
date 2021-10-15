package com.LoopPractice;

import java.util.ArrayList;
import java.util.List;

import edu.emory.mathcs.backport.java.util.Arrays;

public class NumberPattern {
	/*
	 * how to pattern Like * * * * * * * * * * * * * * * * * * * * * *
	 */
	public static void main(String[] args) {
		arraListToArry();
		for (int x = 0; x <= 5; x++) {
			for (int y = 0; y <= x; y++) {
				System.out.print(y + "* ");
			}
			System.out.println();
		}
	}

	public static void arraListToArry() {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		// Error: incompatible types: Object[]
		// cannot be converted to Integer[]
		Object[] objects = al.toArray();
		System.out.println(Arrays.toString(objects));
		for (Object obj : objects)
			System.out.println(obj);
	}
}
