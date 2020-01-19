package printVertically;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<String> printVertically(String s) {
		String[] words = s.split(" ");

		List<String> verticalWords = new ArrayList<>();

		int maximwords = Arrays.stream(words).max((o1, o2) -> o1.length() >= o2.length() ? 1 : -1).get().length();
		char[][] matrix = new char[maximwords][words.length];
		/**
		 *  HOW ARE YOU
		 *  [0] HOW
		 *  [1] ARE
		 *  [2] YOU
		 *
		 *  CONTEST IS COMING
		 *      0123456 maxwords
		 *  [0] CONTEST
		 *  [1] IS
		 *  [2] COMING
		 *
		 *  TO BE OR NOT TO BE
		 *    01
		 *  0 TO
		 *  1 BE
		 *  2 OR
		 *  3 NOT
		 *  4 TO
		 *  5 BE
		 */

		for (int c = 0; c < maximwords; c++) {
			for (int i = 0; i < words.length; i++) {
				if (words[i].length() > c) {
					matrix[c][i] = words[i].charAt(c);
				} else {
					matrix[c][i] = ' ';
				}
			}
		}

		for (int j = 0; j < maximwords; j++) {
			verticalWords.add(makeLine(matrix[j]));
		}
		return verticalWords;
	}

	private String makeLine(char[] line) {
		String newWord = new String(line);
		return newWord.substring(0, lastNullChar(line) + 1);
	}

	public int lastNullChar(char[] line) {
		int findIndex = line.length - 1;
		for (int i = line.length - 1; i >= 0; i--) {
			if (line[i] != ' ') {
				findIndex = i;
				break;
			}
		}
		return findIndex;
	}
}
