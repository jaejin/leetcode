package swapNodesinPairs;

import common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
	public ListNode swapPairs(ListNode head) {
		if (head != null && head.next != null) {
			ListNode first = head;
			ListNode second = head.next;
			ListNode third = head.next.next;
			second.next = first;
			first.next = swapPairs(third);
			return second;
		}
		return head;
	}

}
