package com.reverseAndSplitAndContains;

public class ReverseAndSplit {

	public static void reverseString() {
		String coun = "United State Of America";
		char[] rev = coun.toCharArray();
		for (int i = rev.length - 1; i > 0; i--) {
			// char rev=coun.charAt(i);
			System.out.println(rev[i]);

		}
	}public static String revReturn(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		//reverseString();
		String s= "Mahmud Pervez";
		String rev= revReturn(s);
		System.out.println(rev);
	}
}
