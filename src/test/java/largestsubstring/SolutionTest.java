package largestsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


	@Test
	void lengthOfLongestSubstring() {
		Solution solution = new Solution();
		assertEquals(solution.lengthOfLongestSubstring("abcabcbb"), 3);
		assertEquals(solution.lengthOfLongestSubstring("bbbbb"), 1);
		assertEquals(solution.lengthOfLongestSubstring("pwwkew"), 3);
		assertEquals(solution.lengthOfLongestSubstring("au"), 2);
		assertEquals(solution.lengthOfLongestSubstring("dvdf"), 3);
		assertEquals(solution.lengthOfLongestSubstring("aab"), 2);
	}
}