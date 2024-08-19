package com.emreeker.algorithms.shuffle;

import java.util.Random;

public class FisherYatesShuffle {
	
    public static <T> void shuffle(T[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    
    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    	String[] strArray = {"A", "B", "C", "D", "E","F","G"};
        shuffle(strArray);
        printArray(strArray);
	}
}
