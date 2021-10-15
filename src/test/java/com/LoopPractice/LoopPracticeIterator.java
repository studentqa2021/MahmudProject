package com.LoopPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.set.SynchronizedSortedSet;

public class LoopPracticeIterator {
	
	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Ford");
		cars.add("Toyota");
		// get the iterator
	Iterator<String> iterator = cars.iterator();
	System.out.println(iterator.next());
	System.out.println(iterator.next());
//	while(iterator.hasNext()) {
//		String i =iterator.next();
//		if(i=="Ford") {
//			iterator.remove();
//		}
//	}
//	
//	System.out.println(cars);
	}

}
