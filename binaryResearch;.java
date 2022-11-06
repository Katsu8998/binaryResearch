package binaryResearch;

public class main {

	public static void main(String[] args) {
		// バイナリリサーチ
		int[] height = { 140, 155, 160, 177, 179, 181, 188 };
		int value = 181;
		int low = 1;
		int high = 7;
		int i = (high - low) / 2;

		while (low <= high) {
			if (height[i] == value) {
				System.out.println(i);
				break;
			} else if (height[i] < value) {
				low = i + 1;
			} else {
				high = i - 1;
			}
			i = (low + high) / 2;
		}
	}
}
