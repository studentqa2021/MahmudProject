package com.convertStringToInt;

import org.testng.annotations.Test;

public class ConvertPractice {
    @Test
	public static void convertStringToInt() {
		String num = "20";
		int a = Integer.parseInt(num);
		System.out.println(a+10);
	}
}
