package coinChange;

import java.util.Arrays;

public class Solution {
	public int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		return changeCoins(coins.length - 1, amount, coins, 0);
	}

	private int changeCoins(int index, int amount, int[] coins, int result) {
		if (index == -1) {
			return -1;
		}

		if (amount == 0) {
			return result;
		}

		if (amount >= coins[index]) {
			return changeCoins(index, amount - coins[index], coins, result + 1);
		}

		int remain = amount - coins[index];
		if (remain < 0) {
			return changeCoins(index - 1, amount, coins, result);
		} else {
			return changeCoins(index - 1, remain, coins, result + 1);
		}

	}

}
