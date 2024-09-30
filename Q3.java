package ARRAY;

public class Q3 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 4, 45, 99, 99, 1 };

		int secondMax = findSecondMaximum(array);
		int secondMin = findSecondMinimum(array);

		System.out.println("Second Maximum Element: " + secondMax);
		System.out.println("Second Minimum Element: " + secondMin);
	}

	public static int findSecondMaximum(int[] array) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : array) {
			if (num > max) {
				secondMax = max;
				max = num;
			} else if (num > secondMax && num < max) {
				secondMax = num;
			}
		}
		return secondMax;
	}

	public static int findSecondMinimum(int[] array) {
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int num : array) {
			if (num < min) {
				secondMin = min;
				min = num;
			} else if (num < secondMin && num > min) {
				secondMin = num;
			}
		}
		return secondMin;
	}
}
