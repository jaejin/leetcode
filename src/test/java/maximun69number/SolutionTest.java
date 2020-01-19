package maximun69number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void maximum69Number() {
		Solution solution = new Solution();
		assertEquals(solution.maximum69Number(9669), 9969);
		assertEquals(solution.maximum69Number(9996), 9999);
		assertEquals(solution.maximum69Number(9999), 9999);
	}
}