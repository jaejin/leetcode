package removeNthNodeFromEndOfList;

import common.ListNode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		Queue<ListNode> queue = new LinkedBlockingQueue<ListNode>();
		ListNode newHead = head;
		while(newHead != null) {
			queue.add(new ListNode(newHead.val));
			ListNode temp = newHead.next;
			newHead = temp;
		}

		ListNode result = null;
		newHead = null;
		int totalSize = queue.size();
		for(int i=0;i<totalSize;i++) {

			if (i != (totalSize-n)) {
				if (newHead == null) {
					result = queue.poll();;
					newHead = result;
				} else {
					newHead.next = queue.poll();;
					newHead = newHead.next;
				}
			}  else {
				queue.poll();
			}
		}

		return result;
	}
}
