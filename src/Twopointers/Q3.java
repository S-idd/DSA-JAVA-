package Twopointers;

class NON {
	
	public int [] Sort (int Array[]) {
		
		int left = 0 ;
		
		int right = Array.length - 1;
		
		int  n = Array.length ;
		
		int Result [] = new int [n];
		
		int pos = 0 ;
		
		while (left <= right) {
			
			if (Math.abs(Array[left]) < Math.abs(Array[right])) {
				
				Result[pos] = Array[left] * Array[left] ;
				left++;

			}else {

				Result[pos] = Array[right] * Array[right] ;
				right--;

			}
			pos++;

		}
		return Result ;
	}
}

public class Q3 {
	
	public static void main (String [] args) {
		
		NON N = new NON ();
		
		int Array[] = {-2,-8,-7,5,6};
		
		int FinalOutput[] = N.Sort(Array) ;
		
		for (int i : FinalOutput) {
			System.out.print(i+" ");
		}
		
	}

}
