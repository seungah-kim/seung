package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	
	/*
	 	
	 	������ �Է¹����� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.
	 	
	 	90�� �̻� : A���
	 	80�� �̻� : B���
	 	70�� �̻� : C���
	 	60�� �̻� : D���
	 	�� �� : F���
		
		�� ������ ������ 0 ~ 100�� �Դϴ�
		
	
	*/

	/*public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 int grade;
	 int point = 100;
	 
	 System.out.print("�� �� �Դϱ�? ");
	 grade = sc.nextInt();
	 
	 if (0 <= 90) {
		 System.out.println("A����Դϴ�");
	 } else if(0 <= 80) {
		 System.out.println("B����Դϴ�");
	 } else if (0 <= 70) {
		 System.out.println("C����Դϴ�");
	 } else if 0 <= 60) {
		 System.out.println("D����Դϴ�");
	 } else if (0 <= 59) {
		 System.out.println("F����Դϴ�");
	 }
	 
	 

	}*/
	
		public static void main(String[]args) {
			System.out.print("���� >> ");
			int score = 50; //new Scanner(System.in).nextInt();
			
			/*if (score < 0 || score >100) {
				System.out.println("������ �̻��մϴ�");
			//}else {
			//	System.out.println("�������� �����Դϴ�.");
			} else if (score >= 90) { //&& score <= 100) {
				System.out.println("����� ����� A����Դϴ�.");
			} else if (score >= 80 ) {
				System.out.println("����� ����� A����Դϴ�.");
			} else if (score >= 70) {
				System.out.println("����� ����� A����Դϴ�.");
			} else if (score >= 60) {
				System.out.println("����� ����� A����Դϴ�.");
			} else {
				System.out.println("����� ������� F����Դϴ� ");
		}*/
			char grade = 'F';
			
			if(score < 0 || score > 100) {
				System.out.println("������ �̻��մϴ�");
			} else {
				if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';	
			}
			System.out.printf("����� ���� %d ������ [ %c ] �Դϴ�. \n" , score, grade);
	}
		}
}		
