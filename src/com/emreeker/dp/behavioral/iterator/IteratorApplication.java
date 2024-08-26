package com.emreeker.dp.behavioral.iterator;

import java.util.Iterator;

public class IteratorApplication {

	public static void main(String[] args) {

		Integer[] numArray = { 1, 2, 3, 4, 5 };
		String[] strArray = { "a", "b", "c", "d" };

		Iterator<Integer> numIterator = new CustomIterator<>(numArray);

		while (numIterator.hasNext()) {
			System.out.println(numIterator.next());
		}

		Iterator<String> stringIterator = new CustomIterator<>(strArray);

		while (stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
	}
}
