package addtwosum;

public class PrintUtil {

	public static void printOut(ListNode listNode) {
		System.out.println(toString(listNode));

	}
	public static String toString(ListNode listNode) {
		StringBuffer buffer = new StringBuffer();

		while(listNode != null) {
			buffer.append(listNode.val);
			buffer.append("-");
			listNode = listNode.next;
		}

		return buffer.toString();
	}
}
