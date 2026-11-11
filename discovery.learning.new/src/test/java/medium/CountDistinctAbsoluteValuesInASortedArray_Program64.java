package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountDistinctAbsoluteValuesInASortedArray_Program64 {

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

	public static int display(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println("Elements of List is " + list.get(i));
		}

		return list.size();
	}

	public static void main(String[] args) {

		int[] array = new int[] { -1, -1, -1, -1, 1 };
		// int[] array =new int[] { -1, -1, 0, 1, 1, 1 };
		// int[] array =new int[] { -2, -1, 0, 1, 2, 3};

		System.out.println("Number of Absoulte elememt in arrays is::=> " + display(removeDuplicates(array)));

	}

}
