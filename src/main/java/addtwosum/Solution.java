package addtwosum;

public class Solution {

	public ListNode addTwoNumbers(ListNode first, ListNode second) {
		ListNode result = null;
		int next = 0;
		while(first != null || second != null) {
			int sumValue = 0;
			if (first != null && second != null) {
				sumValue = first.val + second.val +next;
			} else if (first == null) {
				sumValue = second.val+next;
			} else if (second == null) {
				sumValue = first.val+next;
			}
			int val = sumValue % 10;

			if (result == null) {
				result = new ListNode(val);
			} else {
				ListNode temp = new ListNode(val);
				temp.next =	result;
				result = temp;
			}
			PrintUtil.printOut(result);

			next = sumValue / 10;
			if (first != null)
				first = first.next;
			if (second != null)
				second = second.next;
		}

		if (next >0) {
			ListNode temp = new ListNode(next);
			temp.next = result;
			result = temp;
		}

		return reverse(result);
	}

	public ListNode addNext(ListNode start, ListNode next) {
		ListNode temp = start;
		ListNode prevNode = null;
		while(temp != null) {
			prevNode = temp;
			int sumValue= temp.val + next.val;
			temp.val = sumValue % 10;
			next = new ListNode(sumValue / 10);
			temp = temp.next;
		}

		if (next.val >0) {
			prevNode.next = next;
		}
		return start;
	}

	public ListNode reverse(ListNode node) {
		ListNode result = null;
		ListNode search = node;
		while(search != null) {
			ListNode temp = new ListNode(search.val);
			temp.next = result;
			result = temp;
			search = search.next;
		}

		return result;
	}
}
