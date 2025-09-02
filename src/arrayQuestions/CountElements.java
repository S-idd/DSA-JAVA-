package arrayQuestions;

class Q3 {

	public int CountElemenst(int Array[], int Value) {

		int Count = 0;

		for (int i = 0; i < Array.length; i++) {

			if (Array [ i ] == Value) {
				
				Count++;
				
			}
			
		}
		
		return Count;
	}
}

public class CountElements {
	
	public static void main (String [] args) {
		
		Q3 Q3 = new Q3 ();
		
		int Array [] = {5,6,8,9,5,5,6,8,9,5};
		
		int Value = 8;
		
		int Finaloutput = Q3.CountElemenst(Array, Value);
		
		System.out.println("The Elements Greater Than The Value "+ Value + " Are : "+Finaloutput);
	}
}
