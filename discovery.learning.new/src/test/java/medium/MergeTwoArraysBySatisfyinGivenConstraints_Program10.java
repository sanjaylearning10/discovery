package medium;

public class MergeTwoArraysBySatisfyinGivenConstraints_Program10 {

	public static void main(String[] args) {

		int arr[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
		int Y[] = { 1, 8, 9, 10, 15 };
		int X[] = new int[arr.length - Y.length];
		int i = 0;
		int j = 0;
		int k = 0;
		int[] array = new int[X.length + Y.length];

		int b = 0;
		for (int a = 0; a < arr.length; a++) {
			if (arr[a] != 0) {
				X[b] = arr[a];
				b++;
			}
		}
		for (int c = 0; c < X.length; c++) {
			System.out.println("Value of X is " + X[c]);
		}

		while (i < X.length && j < Y.length) {
			if (X[i] < Y[j]) {
				array[k] = X[i];
				i++;
				k++;
			} else {
				array[k] = Y[j];
				j++;
				k++;
			}
		}

		while (i < X.length) {
			if (X[i] < Y[j]) {
				array[k] = X[i];
				i++;
				k++;
			}
		}

		while (j < Y.length) {
			array[k] = Y[j];
			j++;
			k++;
		}
		
		for (int c = 0; c < array.length; c++) {
			System.out.println("Final Merged Array is " + array[c]);
		}

	}

}
