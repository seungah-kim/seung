package quiz;

public class B11_is_number_str {
	/*
	 	�Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ result�� 1
	 	�ٸ� ���ڰ� ���ԵǾ� �ִٸ� result�� 0

	 */

	public static void main(String[] args) {
		
		String word = "123456333423";
		String word2 = "1234a31";
		
		int numeric_str = 0;
		
		for (int i = 0; i < word.length(); ++i ) {
			
			char ch = word.charAt(i);
			
			// "1234a231"
			if (ch < '0' || ch > '9' ) {
				numeric_str = '1';
				break; // ���ڰ� �ƴ� �ٸ� ���ڸ� �ϳ��� ã���� �׸� ã��.
			}
		}
		
		System.out.println("numeric_str: " + (numeric_str > 0? "true" : "false")) ;
	}
	
	
}
