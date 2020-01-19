package maximun69number;

public class Solution {
	public int maximum69Number(int num) {
		String number = num + "";
		int index = number.indexOf('6');
		if (index >= 0) {
			String result = number.substring(0, index) + "9" + number.substring(index + 1);
			return Integer.parseInt(result);
		}
		return num;
	}
}
