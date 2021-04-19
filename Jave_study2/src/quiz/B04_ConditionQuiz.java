package quiz;

public class B04_ConditionQuiz {

	/*
	 [ 알맞은 비교연산을 만들어보세요]
	 
	 1. int형 변수 a가 10보다 크고 20보다 작을 때 true // (a > 10 && a < 20)
	 2. int형 변수가 b가 짝수일 때 true // 
	 3. int형 변수 c가 7의 배수일때 true
	 4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
	 5. int형 변수 d와 e의 차이가 30일때 true
	 6. int형 변수 year가 400으로 나누어 떨어지거나 
	 	또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
	 7. 민수가 철수보다 2살 많으면 true
	 8. 민수가 철수보다 생일이 3달 빠르면 true
	 9. boolean형 변수 powerOn이 false일 때 true
	 10. 문자열 참조변수 str이 "yes"일 때 true
	 
	*/
	
	public static void main(String[] arg) {
		int a = 15;
		int b = 2;
		int c = 14;
		int hour = 23;
		int d = 60; int e = 30;
		
		
		
		System.out.println(a > 10 && a < 20);
		
		System.out.println(b % 2 == 0);
		
		System.out.println(c % 7 == 0);
		
		System.out.println(!(hour < 0 || hour >= 24 ) && hour >= 12);
		
		/**/System.out.println(d - e == 30);
		
		
		
		
		
		
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main (String[]args) {
		
		int a = 15 , b = 10 , c = 7, d = 50 , e = 30;
		
		System.out.println(a > 10 && a < 20 ); //정답
		System.out.println(b % 2 == 0 ); //정답
		System.out.println(c % 7 == 0); // 정답??
	
		
		System.out.println(0 <= 24 || 0 <= 12 );
		System.out.println(d != e );
		
		System.out.println(0 % 400 ==  0 % 4 || 0 != 100 );
		*/
	
		