package ARRAY;

public class Q1 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };

		int max = findMaximum(array);
		double average = calculateAverage(array);

		System.out.println("Maximum Element: " + max);
		System.out.println("Average of Elements: " + average);
	}

	public static int findMaximum(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static double calculateAverage(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return (double) sum / array.length;
	}
}
