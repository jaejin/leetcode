package coinChange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	Solution solution = new Solution();

	@Test
	void coinChange() {
		assertEquals(solution.coinChange(new int[] { 1, 2, 5 }, 11), 3);
		assertEquals(solution.coinChange(new int[] { 186, 419, 83, 408 }, 6249), 20);

	}
}