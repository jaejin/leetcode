package pascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * f(i,j)=f(i−1,j−1)+f(i−1,j)
 */
public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 1; i <= numRows; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 1; j <= i; j++) {
				row.add(triangle(i, j));
			}
			result.add(row);
		}
		return result;
	}

	private int triangle(int i, int j) {
		if (i <= 1 || j <= 1) {
			return 1;
		}
		return triangle(i - 1, j - 1) + triangle(i - 1, j);
	}

}
