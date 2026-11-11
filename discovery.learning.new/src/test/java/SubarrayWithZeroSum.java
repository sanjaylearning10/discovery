
public class SubarrayWithZeroSum {

	public static void main(String[] args) {

		int[] array = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

		for (int i = 0; i < array.length; i++) {
			int isum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				isum = isum + array[j];
				if (isum == 0) {
					System.out.println("Value of pairs are ::=> " + i + " " + j);
				}

			}

		}

	}

}
