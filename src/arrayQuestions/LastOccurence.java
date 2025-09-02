package arrayQuestions;

class Q2 {

	public int LastOccurence(int Array[], int value) {

		int LastIndex = -1;

		for (int i = 0; i < Array.length; i++) {

			if (Array [ i ]  == value) {

				LastIndex = i;
			}
		}

		return LastIndex;
	}
}

public class LastOccurence {

	public static void main(String[] args) {

		Q2 Q2 = new Q2();

		int Array[] = { 5, 6, 8, 9, 5,9, 6, 7 };

		int value = 5;

		int FinalOutput = Q2.LastOccurence(Array, value);

		System.out.println("The Last Occurence Of The Array Is: " + FinalOutput);

	}
}
