package arrayQuestions;

class Q4 {

	public int[] MaxAndMin(int Array[]) {

		int MAX = Integer.MIN_VALUE;

		int MIN = Integer.MAX_VALUE;

		for (int i = 0; i < Array.length; i++) {

			if (MAX < Array[i]) {

				MAX = Array[i];

			} else if (Array[i] < MAX && Array[i] != MAX) {

				MAX = Array[i];

			}

		}

		for (int j = 0; j < Array.length; j++) {

			if (MIN > Array[j]) {

				MIN = Array[j];

			} else if (Array[j] < MIN && Array[j] != MIN) {

				MIN = Array[j];

			}

		}

		return new int[] { MAX, MIN };
	}
}

public class MaxAndMin {

	public static void main (String [] args) {
		
		Q4 Q4 = new Q4 ();
		
		int Array [] = {5,6,7,8,1,2,3,4,9};
		
		int [] Finaloutput = Q4.MaxAndMin(Array);
		
		System.out.print("[ "+Finaloutput [ 0 ]+" , ");
		
		System.out.print(Finaloutput [ 1 ] +" ]");
	}

}
