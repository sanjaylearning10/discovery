import java.util.Arrays;

public class SortBinaryArray {

	public static void main(String[] args) {
		int[] array = { 1, 0, 1, 0, 1, 0, 0, 1 };
		int zero = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				zero = zero + 1;
			}
		}

		for (int i = 0; i < zero; i++) {
			array[i] = 0;
		}

		for (int i = zero; i < array.length; i++) {
			array[i] = 1;
		}
		System.out.println("Value of zero is::=> " + zero);
		System.out.println("Sorted Arrays is::=> " + Arrays.toString(array));

	}

}
