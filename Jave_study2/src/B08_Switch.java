
public class B08_Switch {

	public static void main(String[] args) {
		
		
		/*
		  # switch-case��
		  	
		  	- ()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
		  	- () �ȿ� booleanŸ���� �� �� ����
		 	- if������ �Ϻ��ϰ� ��ü �����ϴ�
		 	-  break�� �� ���� break�� ���������� �������鼭 ��� case�� �����Ѵ�.
		 	- default�� if���� else ������ �Ѵ�.	 
		 */
		
		int a =10;
		
		switch (a % 2 ){
		case 0:
			System.out.println("a�� ¦���Դϴ�");
		case 1:
			System.out.println("a�� Ȧ���Դϴ�");
			break;
		}
		
		char grade = 'A';
		
		switch (grade) {
		case 'E': case 'e':
			System.out.println("��ü �������Դϴ�");
			break;
		case 'K':
			System.out.println("12�� �̻� �������Դϴ�.");
			break;
		case 'Y':
			System.out.println("15�� �̻� �������Դϴ�.");
			break;
		case 'A':
			System.out.println("û�ҳ� �����Ұ��Դϴ�.");
			break;
		default:
			System.out.println("������ ����Դϴ�");
			break;
		}

		/*int score = 100;
		
		switch (score / 10) {
		case 100: case 99: case:98 ...
		case 10: case9:
			grade = 'A'
		}*/
		
		
		
		
	}

}
