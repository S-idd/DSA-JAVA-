package HashMapQuestions;

import java.util.HashMap;
import java.util.Map;

public class Q1 {
	public static void main(String[] args) {

		HashMap<Character, Integer> hm = new HashMap<>();

		String s = "swiss";

		char[] toArray = s.toCharArray();

		for (char i : toArray) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}
		
		for (Map.Entry<Character, Integer> e :hm.entrySet()) {
			
			if (e.getValue() ==1) {
				
				System.out.print(e.getKey() +" ");
			}
		}
	
	}
}
