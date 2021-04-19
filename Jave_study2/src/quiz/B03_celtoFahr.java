package quiz;

import java.util.Scanner;

public class B03_celtoFahr {
	
	//사용자로부터 섭씨 온도를 입력받으면
	//화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
	//(변환 공식은 구글 검색, 츌력은 소수 첫째 자리 까지)
	//private static final String System = null;

	/*public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//double cel;
		//double fahr;
		
		System.out.print();("섭씨 (ºC) 온도를 입력하세요 >");
		//cel = sc.nextDouble();
		
		fahr = (cel * 9/5) + 32;
		
		System.out.printf("%.1fºC는 %1fºF입니다. \n" , cel, fahr);
		
	}*/
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨((℃)온도를 입력하세요 : ");
		float cel = sc.nextFloat();
		float fahr;
		
		//fahr = cel * 2 + 30;
		fahr = (cel * 9/5) + 32;
		
		System.out.printf("%.1fC는 %.1fF입니다" , cel, fahr);
	}
	

}
