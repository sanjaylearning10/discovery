package medium;

public class InplaceMergeTwoSortedArrays_Program9 {

	public static void main(String[] args) {

		int X[] = { 1, 4, 7, 8, 10 };
		int Y[] = { 2, 3, 9 };
		int i = 0;
		int j = 0;
		int k = 0;
		int[] array = new int[X.length + Y.length];

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
			array[k] = X[i];
			i++;
			k++;
		}
		while (j < Y.length) {
			array[k] = Y[j];
			j++;
			k++;
		}

		for (int a = 0; a < array.length; a++) {
			System.out.println("New Sorted Arrays is " + array[a]);
		}
	}

}
