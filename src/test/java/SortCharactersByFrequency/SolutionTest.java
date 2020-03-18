package SortCharactersByFrequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void frequencySort() {
		Solution solution = new Solution();
		assertEquals(solution.frequencySort("Aabb"), "bbAa");
	}
}