package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array: " + Arrays.toString(array));

		rightRotate(array);
		System.out.println("Array after Right Rotation: " + Arrays.toString(array));

		array = new int[] { 1, 2, 3, 4, 5 };

		leftRotate(array);
		System.out.println("Array after Left Rotation: " + Arrays.toString(array));

		scanner.close();
	}

	public static void rightRotate(int[] array) {
		if (array.length == 0)
			return;

		int last = array[array.length - 1];

		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}

		array[0] = last;
	}

	public static void leftRotate(int[] array) {
		if (array.length == 0)
			return;

		int first = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}

		array[array.length - 1] = first;
	}
}
