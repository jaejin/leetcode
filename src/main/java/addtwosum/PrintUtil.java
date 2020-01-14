package addtwosum;

public class PrintUtil {

	public static String print(ListNode listNode) {
		StringBuffer buffer = new StringBuffer();

		while(listNode != null) {
			buffer.append(listNode.val);
			buffer.append("-");
			listNode = listNode.next;
		}

		return buffer.toString();
	}
}
