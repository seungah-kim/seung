package quiz;

public class B17_CountAlphabet {
	
	/*
	 	����ڷκ��� ������ �ϳ� �Է¹ް�
	 	�ش� ���忡 � ���ĺ��� �� �� �����ߴ� ��� ��� ����غ�����
	 	(��ҹ��� ���о��� �� ��)
	 
	 */

	public static void main(String[]args) {
	
		String text = "Everthig is alright";
		
		// # ���ڿ��� ���� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ϱ�
		text = text.toUpperCase(); //�빮��
		//text.toLowerCase();
		
		int[] count = new int[26];

		for (int i = 0; i <text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			System.out.println(ch);
			
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++;
				
			}
		}
	
	}
	
}
