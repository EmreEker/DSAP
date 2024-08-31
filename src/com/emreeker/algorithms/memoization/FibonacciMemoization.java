package com.emreeker.algorithms.memoization;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {
    
    private static Map<Integer, Long> memoizationMap = new HashMap<>();

    public static void main(String[] args) {
        int n = 8; 
        long result = fib(n);
        System.out.println("Fibonacci number " + n + " is " + result);
    }

    public static long fib(int n) {
       
        if (n <= 1) {
            return n;
        }

       
        if (memoizationMap.containsKey(n)) {
            return memoizationMap.get(n);
        }

       
        long result = fib(n - 1) + fib(n - 2);
        memoizationMap.put(n, result);

        return result;
    }
   
	
}
