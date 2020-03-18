package SortCharactersByFrequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public String frequencySort(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		List<Pair> pairs = new ArrayList<>();
		Pair prev = new Pair(chars[0], 1);
		pairs.add(prev);

		for (int i = 1; i < chars.length; i++) {
			if (prev.c == chars[i]) {
				prev.count++;
			} else {
				prev = new Pair(chars[i], 1);
				pairs.add(prev);
			}
		}

		Collections.sort(pairs);
		return pairs.stream().map(Pair::toString).collect(Collectors.joining());
	}

	private class Pair implements Comparable<Pair> {
		private char c;
		private int count = 0;

		Pair(char c, int count) {
			this.c = c;
			this.count = count;
		}

		@Override
		public int compareTo(Pair o) {
			if (count > o.count) {
				return -1;
			} else if (count == o.count) {
				return c < o.c ? -1 : 0;
			}
			return 1;
		}

		public String toString() {
			String result = "";
			for (int i = 0; i < count; i++) {
				result += c + "";
			}
			return result;
		}
	}
}
