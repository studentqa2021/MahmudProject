package com.interviewCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang.RandomStringUtils;

public class InterviewCodingTest {
//how to remove the duplicate value?
	public void removeDuplicate() {
		List<Integer> age = new ArrayList<>();
		age.add(20);
		age.add(20);
		age.add(30);
		age.add(25);
		age.add(30);
		age.add(40);
		age.add(20);
		age.add(30);
		List<Integer> duplicat = age.stream().distinct().collect(Collectors.toList());
		System.out.println("all unique value is: " + duplicat);
	}

	// how to count the duplicate value?
	public void countDuplicate() {
		// String [] name = {"poly","poly","ani","ani","mizan","mizan","mou","mou"};
		int[] number = { 10, 10, 10, 20, 30, 30 };
		// Set<String> dupValue = new HashSet<String>();
		Set<Integer> countnum = new HashSet<>();
		// for(String countName:name)
		for (Integer num : number) {
			if (countnum.add(num) == false) {
				System.out.println("this is duplicate value: " + num);
			}
		}
	}

	public void setTest() {

		Set<Integer> number = new HashSet<>();
		number.add(100);
		number.add(100);
		number.add(null);
		number.add(null);
		number.add(1000);
		number.add(100);
		number.add(100);
		number.add(100);
		System.out.println("my set value: " + number);
	}

	// how to create random string>or randome number?
	public static String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		System.out.println("new random string: " + generatedString);
		return (generatedString);

	}

	public static void main(String[] args) {
		InterviewCodingTest obj = new InterviewCodingTest();
		 obj.removeDuplicate();
		// obj.countDuplicate();
		// obj.setTest();
		//randomString();
	}
}
