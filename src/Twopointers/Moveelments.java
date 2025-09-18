package Twopointers;

class Move {

	public int[] MoveElements(int Array[]) {

		int left = 0;

		int right = Array.length - 1;

		int n = Array.length;

		while (left <= right) {

			if (Array[left] % 2 == 0) {
				left++;
			} else if (Array[right] % 2 != 0) {
				right--;
			} else {
				int temp = Array[left];

				Array[left] = Array[right];

				Array[right] = temp;
			}
		}
		return Array;
	}

	public int[] MoveElementsII(int Array[]) {

		int left = 0;

		int right = 1;

		int n = Array.length - 1;

		while (n > 0) {

			if (Array[left] % 2 == 0) {
				left += 2;
			} else if (Array[right] % 2 != 0) {
				right += 1;
			} else {
				int temp = Array[left];

				Array[left] = Array[right];

				Array[right] = temp;

				left += 2;

				right += 1;
			}
			n--;
		}
		return Array;
	}
}

public class Moveelments {

	public static void main(String[] args) {

		Move M = new Move();

		int Array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int FinalOutput[] = M.MoveElementsII(Array);

		for (int i : FinalOutput) {

			System.out.print(i + " ");
		}

	}

}
