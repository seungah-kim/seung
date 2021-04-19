package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {
	/*
	 	초를 입력받으면 년/일/시간/분/초로 변환하여 출력해보세요
	 	
	 	※ 필요없는 단위는 출력하지 말 것
	 	ex: 0년 0일 5시간 0분 20초인 경우 0년 0알은 나오지 않아야 함
	 	
	 	3601 -> 1시간 0분 1초

	 */
		/*public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("몇 분 몇 초 남으셨습니다");
			
			String year = sc.nextInt();
			String download;
			
			switch(year) {
			case 1: case 2: case 3: case 4: case 5: case 6:
			case 7: case 8: case 9: case 10: case 11: case 12:
				year = "년";
				
			System.out.println("");
		*/
	
		public static void main(String[] args) {
			
			
			System.out.print("초 >");
			int second = new Scanner(System.in).nextInt();
			
			//90000000초 
			
			// 1년 : 60 * 60 * 24 * 365 
			// 1일 : 60 * 60 * 24초
			// 1시간 : 60 * 60초
			// 1분 : 60초
			
			final int SECOND_PER_YEAR = 31536000; //60 * 60 * 24 * 365; 
			final int SECOND_PER_DAY = 86400; //60 * 60 * 24;
			final int SECOND_PER_HOUR = 3600; //60 * 60;
			final int SECOND_PER_MINUTE = 60;
			
			int y = 0, d = 0 , h = 0 , m = 0 , s = 0; // + =0은 이 변수로 초기화 하겠다 일단 0으로 만들고 시작하겠다라는 의미
			
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
			
			
//			System.out.printf("'%d'초는 변환하면 '%d년 %d일 %d시간 %분 %초 입니다.\n"
//					, original, y, d, h, m, s);
				
			System.out.printf("'%d'초는 변환하면 " , original);	
			
//			System.out.println(true || false); // 뒤에 것을 안본다 or?
		
//			System.out.println(false && true); //and 연산자는 앞뒤에 따라 달라진다? false가 올 경우 f로 뜬다?
	
			boolean exist = false;
			
			if (y != 0) {
				System.out.print(y + "년 86");
				exist = true;
			}
			if (exist || d != 0) {
				System.out.print(d + "일 ");
				exist = true;
			}
			if (exist || h != 0) {
				System.out.print(y + "시간 ");
				exist = true;
			}
			if (exist || m != 0) {
				System.out.print(y + "분 ");
			}
			System.out.println(s + "초 입니다.");
		}
		
}
