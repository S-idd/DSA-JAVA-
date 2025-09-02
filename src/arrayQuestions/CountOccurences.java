package arrayQuestions;

class Q1 {

	public int CountOccurences(int Array[], int value) {

		int Count = 0;

		for (int i : Array) {

			if (i == value) {

				Count++;

			}
		}

		return Count++;
	}

}

public class CountOccurences {

	public static void main (String [] args) {
		
		Q1 Q1 =new Q1 ();
		
		int Array [] = {5,6,8,9,5};
		
		int Value = 5;
		
		int FinalOutput = Q1.CountOccurences(Array, Value);
		
		System.out.println("The Count Of The Value In The Array Is : " +FinalOutput);
	}

}
