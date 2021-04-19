
public class C07_Abstract {
	/*
	 
	 	# 추상 클래스
	 	
	 	- 완성을 자식 클래스에게 미루는 클래스
		- 클래스 내부에 추상 메서드를 지닌 클래스는 앞에 abstract를 붙여 표시해야 한다
		
		# 추상 메서드 (abstract method)
		
		 - 메서드의 형태 (리턴 타입, 접근 제어자, 매개변수)만 정해놓고 
		   자세한 구현은 자식 클래스에서 오버라이드를 통해 구현하는 메서드
		 - 자식 클래스에서 오버라이드 하지 않으면 컴파일 에러가 발생한다
	 */

}

abstract class Vehicle {
	
	abstract void ride();
		
	
	
}
	
class Bike extends Vehicle {
	
}

	// 오버라이드 조건 (같은 함수명, 같은 리턴 타입, 같은 매개 변수)
	@Override
	void ride() {}
	
}