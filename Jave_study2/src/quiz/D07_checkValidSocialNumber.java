package quiz;

import java.util.Collections;
import java.util.HashSet;

public class D07_checkValidSocialNumber {
	
	/*
	 	사용자가 주민등록번호를 입력하면
	 	그 주민등록번호가 유효한지 검사하는 프로그램을 만들어보세요
	 	
	 	맨앞 2자리 숫자
	 	월 자리에 01 ~ 12 이내의 숫자
	 	일 자리에 01 ~ 31 이내의 숫자
	 	(1, 3, 5, 7, 8, 10, 12월이면 31 / 4, 6, 9, 11월 이면 30 / 2월은 윤년일때 29 아니면 28)
	 	7번째 자리 '-'
	 	뒷자리 전부 숫자
	 */
	public D07_checkValidSocialNumber() {
		HashSet<Integer> month31 = new HashSet<>();
		
		Collections.addAll(month31, 1, 3, 5, 7, 8, 10, 12);
		
		System.out.println(month31);
		
	}
	
	public static void main(String[] args) {
		new D07_checkValidSocialNumber();
		
	}
}
