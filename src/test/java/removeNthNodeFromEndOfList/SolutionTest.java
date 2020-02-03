package removeNthNodeFromEndOfList;

import com.google.common.collect.Lists;
import common.ListUtils;
import common.PrintUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	@Test
	void removeNthFromEnd() {
		Solution solution = new Solution();
		assertEquals(PrintUtil.toString(solution.removeNthFromEnd(ListUtils.makeFromList(Lists.newArrayList(5,4,3,2,1)),2)), "1-2-3-5-");  ;
	}
}