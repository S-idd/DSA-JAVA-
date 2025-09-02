package arrayQuestions;

import java.util.Arrays;

class Q6 {

	public boolean Isanagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			
			return false;
		}

		char[] charOfstr1 = str1.toCharArray();

		char[] charOfstr2 = str2.toCharArray();

		Arrays.sort(charOfstr1);
		
		Arrays.sort(charOfstr2);
		
		return Arrays.equals(charOfstr1, charOfstr2) ;

	}

}

public class Isanagram {
	
	public static void main(String [] args) {
		
		Q6 Q6 =new Q6();
		
		String str1 = "siddarth";
		
		String str2 = "kanamadi";
		
		
		boolean FinalOutput = Q6.Isanagram(str1, str2);
		
		if(FinalOutput == true) {
			
			System.out.println("The These Two String's Can From Angram");
			
		}else {
			
			System.out.println("The These Two String's Can Not From Angram");
			
		}
		
	}
}
