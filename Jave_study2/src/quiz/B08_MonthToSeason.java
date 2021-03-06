package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {
	
	/*
		사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
		(switch-case 문을 이용) 
	 */
	
	public static void main(String[] args) {
	
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("몇 월? ");
		
		int month = sc.nextInt();
		String season;
		
		switch (month) {
		case 12: case 1: case 2:
			season = "겨울";
		case 3: case 4: case 5:
			season = "봄";
		case 6: case 7: case 8:
			season = "여름";
		case 9: case 10: case 11:
			season = "가을";
			break;
			
		default:
			season = "잘못된 계절";
			break;
			
		
		}
		System.out.printf("%d월은 [%s]입니다 \n", month, season);
}
}