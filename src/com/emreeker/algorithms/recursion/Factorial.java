package com.emreeker.algorithms.recursion;

/*
factorial(4)
   └─ factorial(3)
       └─ factorial(2)
           └─ factorial(1)
           │   └─ returns 1
           └─ returns 2 * 1 = 2
       └─ returns 3 * 2 = 6
   └─ returns 4 * 6 = 24

*/

public class Factorial {

	public static int factorial(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		System.out.println(n + " and " + (n - 1));
		int result = n * factorial(n - 1);
		return result;
	}

	public static void main(String[] args) {

		int n = 4; 
		int result = factorial(n);
		System.out.println(n + " faktoriyel = " + result);

	}
}
