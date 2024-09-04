package com.emreeker.algorithms.memoization;

import java.util.HashMap;
import java.util.Map;

public class CoinChangeMemoization {

	private static Map<String, Integer> memo = new HashMap<>();

	public static int countWays(int[] coins, int amount, int index) {

		if (amount == 0) {
			return 1;
		}
		if (amount < 0) {
			return 0;
		}
		if (index >= coins.length) {
			return 0;
		}
		String key = amount + "-" + index;

		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		int includeCurrentCoin = countWays(coins, amount - coins[index], index);
		int excludeCurrentCoin = countWays(coins, amount, index + 1);
		int totalWays = includeCurrentCoin + excludeCurrentCoin;
		memo.put(key, totalWays);
		return totalWays;
	}

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		int result = countWays(coins, amount, 0);
		System.out.println("Total number of ways to make amount " + amount + ": " + result);
	}
}
