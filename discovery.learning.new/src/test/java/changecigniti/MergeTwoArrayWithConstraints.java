package changecigniti;

import java.util.Arrays;

public class MergeTwoArrayWithConstraints {

	public static void main(String[] args) {
		int X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
		int Y[] = { 1, 8, 9, 10, 15 };		
		int Z[] = new int[X.length ];
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
