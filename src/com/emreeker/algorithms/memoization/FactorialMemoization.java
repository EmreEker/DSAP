package com.emreeker.algorithms.memoization;

import java.util.HashMap;
import java.util.Map;

public class FactorialMemoization {
   
    private static Map<Integer, Long> memoizationMap = new HashMap<>();

    public static void main(String[] args) {
        int n = 20; 
        long result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
    }

    public static long factorial(int n) {
       
        if (n <= 1) {
            return 1;
        }
       
        if (memoizationMap.containsKey(n)) {
            return memoizationMap.get(n);
        }
       
        long result = n * factorial(n - 1);
        memoizationMap.put(n, result);
        return result;
    }
}
