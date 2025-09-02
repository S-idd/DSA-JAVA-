package arrayQuestions;

class Q5 {

	public boolean IsSorted(int Array[]) {

		boolean flag = true;

		for (int i = 1; i < Array.length; i++) {

			if (Array[i] < Array[i - 1]) {

				flag = false;

				break;

			}

		}

		return flag;
	}
}

public class IsSorted {

	public static void main(String[] args) {

		Q5 Q5 = new Q5();

		int Array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // 5,6,7,8,1,2,3,4,9

		boolean Finaloutput = Q5.IsSorted(Array);

		if (Finaloutput == true) {

			System.out.println("The Array Is Sorted ");

		} else {

			System.out.println("The Array Is Not Sorted ");

		}
	}

}
