package changecigniti;

import java.util.Arrays;

public class SortArrayWith012 {

	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
		int[] array1 = new int[array.length];

		int k = 0;

		System.out.println("UnSorted array is " + Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array1[k] = 0;
				k++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				array1[k] = 1;
				k++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				array1[k] = 2;
				k++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = array1[i];
		}

		System.out.println("Sorted array is " + Arrays.toString(array));

	}

}
