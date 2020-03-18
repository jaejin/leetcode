package GenerateParentheses;

public class Solution {

	static void permutation(String[] arr, int depth, int n, int r) {
		if (depth == r) {
			print(arr, r);
			return;
		}

		for (int i = depth; i < n; i++) {
			swap(arr, depth, i);
			permutation(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}
	}

	static void swap(String[] arr, int depth, int i) {
		String temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}

	static void print(String[] arr, int r) {
		for (int i = 0; i < r; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] parenthes = { "(", "(", "(", ")", ")", ")" };
		permutation(parenthes, 0, 6, 6);
	}

}
