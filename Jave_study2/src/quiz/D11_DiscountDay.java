package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class D11_DiscountDay {

	/*
	 * 어떤 카페에서 쩍수번째 목요알머더 헐안행사를 진행한다고 가정 할 때
	 * 
	 * 년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해보세요
	 * 
	 */

	public static void main(String[] args) {
		int year = 2020;
		printAllEventDays(year);

	}

	// ※ Calendar 클래스는 어떤 필드를 변경하면 나머지 필드도 상황에 맞게 알아서 업데이트 된다
	public static void printAllEventDays(int year) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy년 M월 d일");
		Calendar event = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		event.set(year, 0, 1, 0, 0, 0);

		// for (int i = 0; i < 12; ++i) {
		int count = 1;
		while (event.get(Calendar.YEAR) == year) {
			// event.set(Calendar.MONTH, i);
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY); // 목요일로 바꾸고
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2); // 이번 달 두 번째 요일로 설정
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d번째 행사]\n", count++);
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4); // 이번 달 네 번째 요일로 설정

			System.out.printf(eventFormat.format(event.getTime())+ "\t[%d번째 행사]\n", count++);

			// add() : 운하는 필드를 운하는 수치만큼 더하거나 뺄 수 있다
			event.add(Calendar.MONTH, 1);
		}

	}

}