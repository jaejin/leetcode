package addtwosum;

public class Solution {

	public ListNode addTwoNumbers(ListNode first, ListNode second) {
		ListNode result = null;
		int next = 0;
		while(first != null || second != null) {
			int sumValue = first.val + second.val;
			int val = sumValue % 10;
			ListNode temp = new ListNode(val + next);

			next = sumValue / 10;
			temp.next = result;
			result = temp;
			first = first.next;
			second = second.next;
		}

		if (result != null && second != null && first == null ) {
			result.next = second.next;
		}

		if (result != null && first != null && second == null) {
			result.next = first.next;
		}


		return result;
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
