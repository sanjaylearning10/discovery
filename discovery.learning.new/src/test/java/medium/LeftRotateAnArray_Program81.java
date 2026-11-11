package medium;

public class LeftRotateAnArray_Program81 {

	public static void leftRotate(int[] array, int num) {

		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length - num; i++) {
			newArray[i] = array[i + num];
		}
		for (int i = 0; i < num; i++) {
			newArray[array.length - num + i] = array[i];
		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.println("Element of array is::=> " + newArray[i]);
		}

	}

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		leftRotate(array, 6);

	}

}
