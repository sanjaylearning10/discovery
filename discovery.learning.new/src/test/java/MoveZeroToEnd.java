import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] array1 = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		int[] array2 = new int[array1.length];

		for (int i = 0, j = 0; i < array1.length; i++) {
			if (array1[i] != 0) {
				array2[j] = array1[i];
				j++;
			}
		}

		System.out.println("Final Arrays is::=> " + Arrays.toString(array2));

	}

}
