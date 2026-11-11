
public class MaxProductTwoInteger {

	public static void main(String[] args) {
		int[] array = { -10, -3, 5, 6, -2 };
		int prod = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] * array[j] >= prod) {
					prod = array[i] * array[j];
					System.out.println("Element of arrays are ::=> " + i + " " + j);
				}
			}
		}

		System.out.println("Maximun product of two integer is ::=>" + prod);

	}

}
