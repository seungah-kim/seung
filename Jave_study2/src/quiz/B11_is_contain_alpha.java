package quiz;

public class B11_is_contain_alpha {
	
	/*
	 	����ڰ� �Է��� ���ڿ��� 
	 	���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
	 */
		//i iterable�� ���Ӹ� �ݺ���
	public static void main(String[] args) {
		
		String word = "I have a dream";
		String word2 = "���� ���� �־��";
		
		boolean contain_alphabet = false; 
		

		//�ݺ����� �̿��� ���ڿ��� �� ���ھ� �����Ͽ� �˻��Ѵ�
		for(int index = 0; index < word.length(); ++index) {
			
			//System.out.println(word2.charAt(index));
			
			char ch = word.charAt(index);
			
			if (ch >= 'a' && ch <= 'z' || (ch >= 'A' && ch <= 'Z')) {
				//�ϳ��� �и��� ���� ch�� ���ĺ��� ��� �����ϴ� ��
				contain_alphabet = true;
				break; // �ϳ��� ã���� �� �̻� �ݺ����� ������ ������ ����.
			} 
		
		}
		
		System.out.println("contain_alphabet: " + contain_alphabet);
		
		
	
		/*
		 * for(int i = 0; i <= a;) {
			
		}
		*/
		
		
		
		
	}

}
