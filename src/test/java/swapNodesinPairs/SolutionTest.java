package swapNodesinPairs;

import com.google.common.collect.Lists;
import common.ListNode;
import common.ListUtils;
import common.PrintUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void swapPairs() {
		ListNode head = ListUtils.makeFromList(Lists.newArrayList(4, 3, 2, 1));
		PrintUtil.printOut(head);

		Solution solution = new Solution();
		assertEquals("2-1-4-3-", PrintUtil.toString(solution.swapPairs(head)));
	}
}