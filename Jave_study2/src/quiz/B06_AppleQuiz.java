package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {
	
	/*
	 
	   ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	   
	   ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
	   ����� ��� ������� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.

	 */
	  /*public static void main(String[] args) {
	  
	
	  int a = 10;
	   
	  if (a == 10) {
		  
	  } else if (a >= 0 && a <= 0)
		  System.out.println();
		  
	  
	
	
	  }
*/
	
	public static void main(String[]args) {
		
		Scanner sc  =  new Scanner(System.in);
		int apple;
		int size = 10;
		
		System.out.print("�����ϰ� ���� ����� ���� >> ");
		apple = sc.nextInt();
		
		if (apple < 0) {
			System.out.println("�߸��� ��� �����Դϴ�.");
		}else if (apple % size != 0) {
			System.out.println("�ʿ��� �ٱ����� ���� : " + (apple/size + 1));
		}else {
			System.out.println("�ʿ��� �ٱ����� ���� : " + apple /  size);
			
		}
		
		
		//if (apple < 0) {
		//	System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�");
		//}else {
		//+ System.out.println("�ʿ��� �ٱ����� ���� :" + apple /size); //25���� �ٱ��� 2���� ������ �ø��� �ؾ���
		//System.out.println("�ʿ��� �ٱ����� ���� :" 
		//		+ (int)Math.ceil(apple /(double)size));
		
		
		//} 
		//�̷��� �ΰ��� ����� �ִ�
		//+ �� 25���� ���� �� 2�� �ٱ��ϸ� ���� 5���� ��� �����ϴ� ���
		
	}
	
}
