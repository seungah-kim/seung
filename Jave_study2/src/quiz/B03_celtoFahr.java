package quiz;

import java.util.Scanner;

public class B03_celtoFahr {
	
	//����ڷκ��� ���� �µ��� �Է¹�����
	//ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
	//(��ȯ ������ ���� �˻�, ������ �Ҽ� ù° �ڸ� ����)
	//private static final String System = null;

	/*public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//double cel;
		//double fahr;
		
		System.out.print();("���� (��C) �µ��� �Է��ϼ��� >");
		//cel = sc.nextDouble();
		
		fahr = (cel * 9/5) + 32;
		
		System.out.printf("%.1f��C�� %1f��F�Դϴ�. \n" , cel, fahr);
		
	}*/
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����((��)�µ��� �Է��ϼ��� : ");
		float cel = sc.nextFloat();
		float fahr;
		
		//fahr = cel * 2 + 30;
		fahr = (cel * 9/5) + 32;
		
		System.out.printf("%.1fC�� %.1fF�Դϴ�" , cel, fahr);
	}
	

}
