package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {
	/*
	 	�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
	 	
	 	�� �ʿ���� ������ ������� �� ��
	 	ex: 0�� 0�� 5�ð� 0�� 20���� ��� 0�� 0���� ������ �ʾƾ� ��
	 	
	 	3601 -> 1�ð� 0�� 1��

	 */
		/*public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�� �� �� �� �����̽��ϴ�");
			
			String year = sc.nextInt();
			String download;
			
			switch(year) {
			case 1: case 2: case 3: case 4: case 5: case 6:
			case 7: case 8: case 9: case 10: case 11: case 12:
				year = "��";
				
			System.out.println("");
		*/
	
		public static void main(String[] args) {
			
			
			System.out.print("�� >");
			int second = new Scanner(System.in).nextInt();
			
			//90000000�� 
			
			// 1�� : 60 * 60 * 24 * 365 
			// 1�� : 60 * 60 * 24��
			// 1�ð� : 60 * 60��
			// 1�� : 60��
			
			final int SECOND_PER_YEAR = 31536000; //60 * 60 * 24 * 365; 
			final int SECOND_PER_DAY = 86400; //60 * 60 * 24;
			final int SECOND_PER_HOUR = 3600; //60 * 60;
			final int SECOND_PER_MINUTE = 60;
			
			int y = 0, d = 0 , h = 0 , m = 0 , s = 0; // + =0�� �� ������ �ʱ�ȭ �ϰڴ� �ϴ� 0���� ����� �����ϰڴٶ�� �ǹ�
			
			int original = second;
			
			//31,536,000
			y = second / SECOND_PER_YEAR; 
			//second = second % (60 * 60 * 24 *365); // = second -> %=
			second %= SECOND_PER_YEAR;
			
			d = second / SECOND_PER_DAY; 
			second %= SECOND_PER_DAY;
		
			h = second / SECOND_PER_HOUR;
			second %=  SECOND_PER_HOUR;
			
			m = second / SECOND_PER_MINUTE;
			second %= SECOND_PER_MINUTE;
			
			s= second;
			
			
//			System.out.printf("'%d'�ʴ� ��ȯ�ϸ� '%d�� %d�� %d�ð� %�� %�� �Դϴ�.\n"
//					, original, y, d, h, m, s);
				
			System.out.printf("'%d'�ʴ� ��ȯ�ϸ� " , original);	
			
//			System.out.println(true || false); // �ڿ� ���� �Ⱥ��� or?
		
//			System.out.println(false && true); //and �����ڴ� �յڿ� ���� �޶�����? false�� �� ��� f�� ���?
	
			boolean exist = false;
			
			if (y != 0) {
				System.out.print(y + "�� 86");
				exist = true;
			}
			if (exist || d != 0) {
				System.out.print(d + "�� ");
				exist = true;
			}
			if (exist || h != 0) {
				System.out.print(y + "�ð� ");
				exist = true;
			}
			if (exist || m != 0) {
				System.out.print(y + "�� ");
			}
			System.out.println(s + "�� �Դϴ�.");
		}
		
}
