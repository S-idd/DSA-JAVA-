package Twopointers;

/*
 * Input {1,2,3,4,5,6,7,8,9,9}
 * 
 * Output The Last Index Of The Value :9 is :9
 * 
 * */

class LastOcc {
	
	public int LastIndex (int Array[] ,int Value) {
		
		int left = 0 ;
		
		int right = Array.length - 1;
		
		int Count = 0 ;
		
		while (left <= right) {
			
			if (Array[left] == Value) {
				
				Count =  left;
				
			}
			left++;
		}
		return Count;
		
	}
}

public class Q1 {
	
	public static void main (String [] args) {
		
		LastOcc Q1 = new LastOcc ();
		
		int Array[] = {1,2,3,4,5,6,7,8,9,9};
		
		int Value = 9 ;
		
		int FinalOutput = Q1.LastIndex(Array, Value) ;
		
		System.out.println("The Last Index Of The Value :"+Value+" is :" +FinalOutput);
		
	}

}
