package largestsubstring;

import java.util.*;

public class Solution {
	public int lengthOfLongestSubstring(String s) {
		if (s != null && !"".equals(s)) {
			Deque<Character> word = new ArrayDeque<Character>();
			for (char c: s.toCharArray()) {
				word.add(c);
			}

			Set<Character> maxWord = new HashSet<Character>();
			Set<Character> currentMax;
			while(!word.isEmpty()) {
				char prev = word.pop();
				Character[] subchar = word.toArray(new Character[]{});
				currentMax = new HashSet<Character>();
				currentMax.add(prev);
				for (int i=0;i<subchar.length;i++) {
					if (prev != subchar[i] && !currentMax.contains(subchar[i])) {
						currentMax.add(subchar[i]);
					} else {
						break;
					}
				}

				if (currentMax.size() > maxWord.size()) {
					maxWord = new HashSet<Character>();
					maxWord.addAll(currentMax);
				}
			}
			return maxWord.size();
		}
		return 0;
	}
}
