package quiz;

public class B04_ConditionQuiz {

	/*
	 [ �˸��� �񱳿����� ��������]
	 
	 1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true // (a > 10 && a < 20)
	 2. int�� ������ b�� ¦���� �� true // 
	 3. int�� ���� c�� 7�� ����϶� true
	 4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
	 5. int�� ���� d�� e�� ���̰� 30�϶� true
	 6. int�� ���� year�� 400���� ������ �������ų� 
	 	�Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
	 7. �μ��� ö������ 2�� ������ true
	 8. �μ��� ö������ ������ 3�� ������ true
	 9. boolean�� ���� powerOn�� false�� �� true
	 10. ���ڿ� �������� str�� "yes"�� �� true
	 
	*/
	
	public static void main(String[] arg) {
		int a = 15;
		int b = 2;
		int c = 14;
		int hour = 23;
		int d = 60; int e = 30;
		
		
		
		System.out.println(a > 10 && a < 20);
		
		System.out.println(b % 2 == 0);
		
		System.out.println(c % 7 == 0);
		
		System.out.println(!(hour < 0 || hour >= 24 ) && hour >= 12);
		
		/**/System.out.println(d - e == 30);
		
		
		
		
		
		
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main (String[]args) {
		
		int a = 15 , b = 10 , c = 7, d = 50 , e = 30;
		
		System.out.println(a > 10 && a < 20 ); //����
		System.out.println(b % 2 == 0 ); //����
		System.out.println(c % 7 == 0); // ����??
	
		
		System.out.println(0 <= 24 || 0 <= 12 );
		System.out.println(d != e );
		
		System.out.println(0 % 400 ==  0 % 4 || 0 != 100 );
		*/
	
		