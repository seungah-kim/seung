
public class B09_Operator3 {

	public static void main(String[] args) {
		/*
		 
		 	#삼향 연산자
		 	
		 	-간단한 if문을 한 줄로 표현할 수 있다ㅏ
		 	- 조건 예? : 아니요;
		 
		 
		 */
		
		//ex: 필요한 바구니 개수 구하기
		int apple = 24;
		int size = 10;
		
		int needs = apple % size == 0 ?  size : apple / size + 1;
		
		boolean isEven = apple % 2 == 0;
		
		
		//if문은 3-4줄 나오는데 간단하게 사용할 수 있다.
		System.out.println("필요한 바구니 개수는" + needs + "개 입니다" ); 
	
		System.out.printf("사과의 개수는 %s 입니다.", isEven ? "짝수" : "홀수");

	}

}
