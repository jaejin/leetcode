package addtwosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	Solution solution = new Solution();

	public ListNode sample() {
		ListNode listNode = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		listNode.next = listNode2;
		listNode2.next = listNode3;

		return listNode;
	}

	@org.junit.jupiter.api.Test
	void reverse() {
		assertEquals("3-2-1-", PrintUtil.print(solution.reverse(sample())));
	}

	@Test
	void merge() {
		System.out.println(12 / 10);
		assertEquals("2-4-6-", PrintUtil.print(solution.addTwoNumbers(sample(), sample()))); ;
	}
}