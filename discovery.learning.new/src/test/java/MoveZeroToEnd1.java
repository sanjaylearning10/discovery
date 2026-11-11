import java.util.Arrays;

public class MoveZeroToEnd1 {

	public static void main(String[] args) {
		int[] array = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };

		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			if (array[low] == 0) {
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
				low++;
				high--;
			} else if (array[high] == 0) {
				high--;
			} else {
				low++;
			}
		}

		System.out.println("Final Arrays is::=> " + Arrays.toString(array));

	}

}
