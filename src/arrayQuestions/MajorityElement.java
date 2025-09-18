package arrayQuestions;

import java.util.HashMap;
import java.util.Map;

class LeetCode169{
	
	public int Element (int Array [] ) {
				
		int Element = 0 ;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for (int i : Array) {
			
			hm.put(i, hm.getOrDefault(i, 0)+1);
			
			
		}
		
		for (Map.Entry<Integer, Integer> e:hm.entrySet()) {
			
			if (e.getValue() > Array.length / 2) {
				
				Element = e.getKey();
				
			}
		}
		
		return Element ;
		
	}
}

public class MajorityElement {
	
	public static void main (String [] args) {
		
		LeetCode169 L169 = new LeetCode169 ();
		
		
		int Array[] = {6,6,6,7,7} ; // Test Case :- 1 3,2,3
		
		int FinalOutput = L169.Element(Array) ;
		
		System.out.println(FinalOutput) ;
	}
}
