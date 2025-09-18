package arrayQuestions;

class CountTheElements {

	public int[] Count(int Array[], int Value) {

		int left = 0;

		int Right = Array.length - 1;

		int Occ = 0;

	

		while (left <= Right) {

			if (Array[left] == Value) {

				Occ++;
				
				
				
				

			} else if (Array[Right] == Value) {

				Occ++;
				
			
			

			}
			left++;
			
			Right--;
		

		}
	
		

		return new int[] { Occ };

	}
}

public class Main {

	public static void main(String[] args) {

		CountTheElements c = new CountTheElements();

		int Array[] = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 7 };

		int value = 7;

		int OutputArray[] = c.Count(Array, value);

		System.out.println(OutputArray[0]);
	}
}
