package printVertically;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	Solution solution = new Solution();

	@Test
	void printVertically() {

		assertEquals(Lists.newArrayList("HAY", "ORO", "WEU"), solution.printVertically("HOW ARE YOU"));
		assertEquals(Lists.newArrayList("TBONTB", "OEROOE", "   T"), solution.printVertically("TO BE OR NOT TO BE"));
		assertEquals(Lists.newArrayList("CIC", "OSO", "N M", "T I", "E N", "S G", "T"), solution.printVertically("CONTEST IS COMING"));
	}

	@Test
	void lastNullChar() {

		assertEquals(0, solution.lastNullChar(new char[] { 'T', ' ', ' ' }));
	}

}