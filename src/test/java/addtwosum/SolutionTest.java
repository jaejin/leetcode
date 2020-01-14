package addtwosum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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

	public ListNode makeFromList(List<Integer> list) {
		ListNode tail = null;
		for(int i : list) {
			if (tail == null) {
				tail = new ListNode(i);
			} else {
				ListNode temp = new ListNode(i);
				temp.next = tail;
				tail = temp;
			}
		}
		return tail;
	}
	public ListNode sample99() {
		ListNode listNode = new ListNode(9);
		ListNode listNode2 = new ListNode(9);
		ListNode listNode3 = new ListNode(9);
		listNode.next = listNode2;
		listNode2.next = listNode3;

		return listNode;
	}

	@org.junit.jupiter.api.Test
	void reverse() {
		assertEquals("3-2-1-", PrintUtil.toString(solution.reverse(sample())));
	}

	@Test
	void sum() {
		assertEquals("2-4-6-", PrintUtil.toString(solution.addTwoNumbers(sample(), sample()))); ;
	}

	@Test
	void sum313_799() {
		assertEquals("0-1-3-1-", PrintUtil.toString(solution.addTwoNumbers(
			solution.reverse(makeFromList(Arrays.asList(3,1,3))),
			solution.reverse(makeFromList(Arrays.asList(7,9,9)))))); ;
	}

	@Test
	void sum3133_799() {
		assertEquals("0-1-3-4-", PrintUtil.toString(solution.addTwoNumbers(
			solution.reverse(makeFromList(Arrays.asList(3,1,3,3))),
			solution.reverse(makeFromList(Arrays.asList(7,9,9)))))); ;
	}

	@Test
	void sum1_99() {
		assertEquals("0-0-1-", PrintUtil.toString(solution.addTwoNumbers(
			solution.reverse(makeFromList(Arrays.asList(1))),
			solution.reverse(makeFromList(Arrays.asList(9,9)))))); ;
	}

	@Test
	void addNext_next_0() {
		assertEquals("9-9-9-", PrintUtil.toString(solution.addNext(sample99(),new ListNode(0))));
	}

	@Test
	void addNext_next_1() {
		assertEquals("0-0-0-1-", PrintUtil.toString(solution.addNext(sample99(), new ListNode(1))));
	}
}