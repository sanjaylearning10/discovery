package changecigniti;

import java.util.Arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		// int[] array = { 1, 0, 1, 0, 1, 0, 0, 1 };
		int[] array = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		int[] array1 = new int[array.length];

		int countZero = 0;

		System.out.println("UnSorted array is " + Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				countZero++;
			}

		}
		int j = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] != 0) {
				array1[j] = array[i];
				j++;
			}

		}

		for (int i = array.length - countZero; i < array.length; i++) {

			array1[i] = 0;

		}

		for (int i = 0; i < array.length; i++) {

			array[i] = array1[i];

		}
		System.out.println("Sorted array is " + Arrays.toString(array));

	}

}
