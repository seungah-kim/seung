package quiz;

import java.util.Scanner;

public class B07_CheckWord {
	
	/*
	  ����ڷκ��� �ܾ �ϳ� �Է¹ް�
	  ù ��° ���ڿ� ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ���
	  �ƴ϶�� "NOT OK"�� ����غ�����
	
	 */
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			//next() : ���� �ܾ StringŸ������ �޾ƿ��� (���� ����)
			//nextLine() : ���� �� ���� StringŸ������ �޾ƿ��� (\n ����)
			//apple banana orange
			System.out.print("�ƹ��ų� �Է��غ����� > ");
			String word = sc.next();
			
			
			int lastIndex = word.length()-1;
			
			//System.out.println(word); ������
			if(word.charAt(0) == word.charAt(word.length()-1)) {
				System.out.println("OK");
			} else {
				System.out.println("NOT OK");
			}
			
			
			
			
			
		}
	
	
	
	
	

}
