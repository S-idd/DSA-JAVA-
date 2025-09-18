package Twopointers;

class Sort {

	public int[] SortArray(int Array[]) {

		int left = 0;

		int right = Array.length - 1;

		while (left < right) {

			if (Array[left] == 0) {

				left++;
			} else if (Array[right] == 1) {

				right--;
			} else {
				int temp = Array[left];

				Array[left] = Array[right];

				Array[right] = temp;
			}
		}

		return Array;
	}
}

public class BinaryArray {

	public static void main(String[] args) {

		Sort s = new Sort();

		int Array[] = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };

		int FinalOutput[] = s.SortArray(Array);

		for (int i : FinalOutput) {

			System.out.print(i + " ");
		}

	}

}
