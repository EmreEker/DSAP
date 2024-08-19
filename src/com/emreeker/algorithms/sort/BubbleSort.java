package com.emreeker.algorithms.sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 7, 2, 9, 22, 1, 13 };
		sort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j);
				}
			}
		}
	}

	private static void swap(int[] array, int j) {
		int temp = array[j];
		array[j] = array[j + 1];
		array[j + 1] = temp;
	}
}
