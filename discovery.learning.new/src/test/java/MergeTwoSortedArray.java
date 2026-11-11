import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] array1 = { 1, 4, 7, 8, 10 };
		int[] array2 = { 2, 3, 9 };
		int[] array3 = new int[array1.length + array2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < array1.length && j < array2.length) {
			if (array1[i] <= array2[j]) {
				array3[k] = array1[i];
				i++;
				k++;
			} else {
				array3[k] = array2[j];
				j++;
				k++;
			}
		}
		while (i < array1.length) {
			array3[k] = array1[i];
			i++;
			k++;
		}
		while (j < array2.length) {
			array3[k] = array2[j];
			j++;
			k++;
		}

		System.out.println("Final Array is ::=> " + Arrays.toString(array3));
	}

}
