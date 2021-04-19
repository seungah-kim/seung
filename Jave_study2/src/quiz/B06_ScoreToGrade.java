package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {
	
	/*
	 	
	 	점수를 입력받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요.
	 	
	 	90점 이상 : A등급
	 	80점 이상 : B등금
	 	70점 이상 : C등급
	 	60점 이상 : D등급
	 	그 외 : F등급
		
		※ 유요한 점수는 0 ~ 100점 입니다
		
	
	*/

	/*public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 int grade;
	 int point = 100;
	 
	 System.out.print("몇 점 입니까? ");
	 grade = sc.nextInt();
	 
	 if (0 <= 90) {
		 System.out.println("A등급입니다");
	 } else if(0 <= 80) {
		 System.out.println("B등급입니다");
	 } else if (0 <= 70) {
		 System.out.println("C등급입니다");
	 } else if 0 <= 60) {
		 System.out.println("D등급입니다");
	 } else if (0 <= 59) {
		 System.out.println("F등급입니다");
	 }
	 
	 

	}*/
	
		public static void main(String[]args) {
			System.out.print("점수 >> ");
			int score = 50; //new Scanner(System.in).nextInt();
			
			/*if (score < 0 || score >100) {
				System.out.println("점수가 이상합니다");
			//}else {
			//	System.out.println("정상적인 점수입니다.");
			} else if (score >= 90) { //&& score <= 100) {
				System.out.println("당신의 등급은 A등급입니다.");
			} else if (score >= 80 ) {
				System.out.println("당신의 등급은 A등급입니다.");
			} else if (score >= 70) {
				System.out.println("당신의 등급은 A등급입니다.");
			} else if (score >= 60) {
				System.out.println("당신의 등급은 A등급입니다.");
			} else {
				System.out.println("당신의 등급으느 F등급입니다 ");
		}*/
			char grade = 'F';
			
			if(score < 0 || score > 100) {
				System.out.println("점수가 이상합니다");
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
			System.out.printf("당신의 점수 %d 점으로 [ %c ] 입니다. \n" , score, grade);
	}
		}
}		
