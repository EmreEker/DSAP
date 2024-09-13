package com.emreeker.algorithms.tabulation;

public class FactorialTabulation {

    public static long factorial(int n) {
       
        long[] table = new long[n + 1];
        
        table[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            table[i] = i * table[i - 1];
        }
        
        return table[n];
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
