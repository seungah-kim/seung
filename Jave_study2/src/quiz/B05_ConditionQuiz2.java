package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {
	
	/*
    [ 알맞은 조건식을 만들어보세요 ]

    1. char형 변수 a가 'q'또는 'Q'일 때 true
    2. char형 변수 b가 공백이나 탭이 아닐 때 true
    3. char형 변수 c가 문자('0' ~ '9')일 때 true
    4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
    
     ※ 유니코드 표 참조
    5. char형 변수 e가 한글일 때 true
    6. char형 변수 f가 일본어일 때 true 
    
    7. 사용자가 입력한 문자열이 exit일 때 true
            
    */ 
	
	/*public static void main(String[] args) {
	
	int a = 'q';
	char ch = 'Q';
	System.out.println((char) a);
	*/
	
	public static void main (String args[]) {
		
		char a = 'Q';
		char b = 'A';
		char c = '5';
		char d = ' ';
		char e = '박';
		char f = 'あ';
		String user_input;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		System.out.println("2. " + (b != ' ' && b != '\t'));
		System.out.println("3. " + (c >= '0' && c <= '9'));
		System.out.println("4. 알파벳인가?" 
				+ ((d >= 'A' && d <= 'z') || (d >= 'a' && d <= 'z')));
		System.out.println("5. " + (e >= '가' && e <= '박')); 
		System.out.println(e >= 0xAC00 && e <= 0xD7AF);
		
		System.out.printf("&X\n", (int)'힣');
		
		System.out.println((f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF));
		// ** 같은것들인데 왜 <= >= 기호를 사용하는것인가?
		
		System.out.print("아무 단어나 입력해 보세요 > ");
		user_input = sc.next();
		
		System.out.println(user_input.equals("exit"));
	}

}
