
package ARRAY;

import java.util.HashMap;

public class Q4 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 3, 4, 4, 4, 5 };

		HashMap<Integer, Integer> occurrences = countOccurrences(array);

		System.out.println("Occurrences of each element:");
		for (HashMap.Entry<Integer, Integer> entry : occurrences.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static HashMap<Integer, Integer> countOccurrences(int[] array) {
		HashMap<Integer, Integer> countMap = new HashMap<>();

		for (int num : array) {
			if (countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num) + 1);
			} else {
				countMap.put(num, 1);
			}
		}
		return countMap;
	}
}
