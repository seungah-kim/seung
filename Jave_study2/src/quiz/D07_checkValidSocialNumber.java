package quiz;

import java.util.Collections;
import java.util.HashSet;

public class D07_checkValidSocialNumber {
	
	/*
	 	����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ�
	 	�� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��ϴ� ���α׷��� ��������
	 	
	 	�Ǿ� 2�ڸ� ����
	 	�� �ڸ��� 01 ~ 12 �̳��� ����
	 	�� �ڸ��� 01 ~ 31 �̳��� ����
	 	(1, 3, 5, 7, 8, 10, 12���̸� 31 / 4, 6, 9, 11�� �̸� 30 / 2���� �����϶� 29 �ƴϸ� 28)
	 	7��° �ڸ� '-'
	 	���ڸ� ���� ����
	 */
	public D07_checkValidSocialNumber() {
		HashSet<Integer> month31 = new HashSet<>();
		
		Collections.addAll(month31, 1, 3, 5, 7, 8, 10, 12);
		
		System.out.println(month31);
		
	}
	
	public static void main(String[] args) {
		new D07_checkValidSocialNumber();
		
	}
}
