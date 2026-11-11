package changecigniti;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int X[] = { 1, 4, 7, 8, 10 };
		int Y[] = { 2, 3, 9 };

		int Z[] = new int[X.length + Y.length];

		int k = 0;
		int i = 0;
		int j = 0;

		while (i < X.length && j < Y.length) {
			if (X[i] < Y[j]) {
				Z[k] = X[i];
				i++;
				k++;
			} else {
				Z[k] = Y[j];
				j++;
				k++;
			}
		}

		while (i < X.length) {
			Z[k] = X[i];
			i++;
			k++;
		}
		while (j < Y.length) {
			Z[k] = Y[j];
			j++;
			k++;
		}

		System.out.println("First array is " + Arrays.toString(X));
		System.out.println("Second array is " + Arrays.toString(Y));
		System.out.println("Sorted array is " + Arrays.toString(Z));

	}

}
