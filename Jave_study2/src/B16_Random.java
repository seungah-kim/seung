import java.util.Random;

public class B16_Random {

	
	public static void main(String[] args) {
		/*
		 	# JAVA에서 무작위 숫자 생성하기
		 	
		 	1.Math.randon()
		 	  - double  타입의 랜덤 소수를 생성한다 (0 <= x < 1)
		 	  -  이 랜덤 소수를 이용하여 원하는 범위의 숫자를 만들 수 있다
		 	  
		 	  ※ 원하는 범위의 숫자를 만드는 순서 (ex: 30 ~ 60 )
		 	  
		 		(1) 생성된 랜덤 소수 원하는 숫자의 개수를 곱한다 (31개)
		 		    0 * 31 <= x < 1 * 31
		 		(2) 원하는 숫자 중 가장 작은 숫자를 더한다 (30)
		 		 	(0 * 31 + 30 <= x < 1 * 31 + 30)
		 		(3) 소수점 아래를 삭제한다
		 		 	-> Math.floor ()  또는 int로 타입 캐스팅
		
		 */
		
		for (int i = 0; i < 10; ++i) {
			System.out.println((int)(Math.random() * 31 + 30));
		}
		
		// 연습문제 : 1 ~ 45의 랜덤 숫자를 7개 출력해보세요
		
		/*
		 
		 - 좀 더 편리하게 랜덤 값을 선택할 수 있는 기능들이 모여있는 클래스
		 - 생서랄 때 랜덤 시드가 생성된다
		 - 원하는 랜덤 시드를 선택할 수 있다
		 */
			System.out.println("------------------------");
			// # 새로운 랜덤 시드 생성
			Random ran = new Random();
			
			
			// # Random.nextInt(bound)
			// # 0 ~ bound 미만의 정수를 반환한다
			System.out.println(ran.nextInt(45) + 1); // 1 ~ 45의 랜더 정수
			System.out.println(ran.nextInt(41) + 30); // 30 ~ 70의 랜던 정수
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			System.out.println(ran.nextInt());
			
			
			// # Ramdon.nextBoolean()
			// - Random  클래스는 원하는 타입의 랜덤 값을 쉽게 얻을 수 있다
			
	}
	
}
