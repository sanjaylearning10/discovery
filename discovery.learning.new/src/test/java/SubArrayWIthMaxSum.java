
public class SubArrayWIthMaxSum {

	public static void main(String[] args) {
		int[] nums = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int target = 8;
		int len = -1;

		for (int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				sum = sum + nums[j];
				if (sum == target) {
					System.out.println("Sub arrays are::=> " + i + " " + j);
					if (j - i >= len) {
						len = j - i;
						System.out.println("Largest sub array length is::=> " + (len + 1));

					}
				}
			}
		}

	}

}
