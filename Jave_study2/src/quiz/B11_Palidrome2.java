package quiz;

public class B11_Palidrome2 {
	
	public static void main (String[] args) {
		
		
		/*String word = "MAXICO";
		
	
		for (int  i = 0, j = word.length() -1; i < word.length(); ++i, --j) {
			
			System.out.printf("'%c' VS '%C' \n", word.charAt(i), word.charAt(i));
		*/
		
		String word = "ABBA";
		
		for (int i = 0, j = word.length() - 1; i < word.length() / 2; ++i, --j) {
			System.out.printf("'%c' VS '%C' \n", word.charAt(i), word.charAt(j));
		}	
	}

}
