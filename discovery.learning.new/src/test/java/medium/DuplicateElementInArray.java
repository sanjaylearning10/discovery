package medium;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementInArray {

	public static List<Integer> removeDuplicates(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = array[i] * -1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (!list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		return list;
	}

	public static void main(String[] args) {

		int[] array = new int[] { -2, -1, 0, 1, 2, 3 };
		System.out.println("Number of Unique elememt in arrays is::=> " + removeDuplicates(array));
	}

}
