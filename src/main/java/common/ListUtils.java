package common;

import java.util.List;

public class ListUtils {
	public static ListNode makeFromList(List<Integer> list) {
		ListNode tail = null;
		for (int i : list) {
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
}
