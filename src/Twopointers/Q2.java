package Twopointers;

/*
 * input : {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,9,9}
 * 
 * output : The Unique Element Is:5
 * */
class UniqueElement {
	
	public int UniqueElement (int Array[]) {
		
		int left = 0 ;
		
		int right = Array.length - 1;
		
		int Result = 0 ;
		
		while (left <= right) {
			
			Result ^= Array [left] ;
			left++;
			
		}
		
		return Result ;
		
	}
}
public class Q2 {
	
	public static void main (String [] args) {
		
		UniqueElement UE = new UniqueElement ();
		
		int Array[] = {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,9,9};
		
		int FinalOutput = UE.UniqueElement(Array) ;
		
		System.out.println("The Unique Element Is:"+FinalOutput) ;
	}

}
