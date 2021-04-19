package quiz;

public class B11_Reverse {

	
		//사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
	
	public static void manin(String[] args) {
		
		String sentense = " I am iron man";
		
		for (int i = sentense.length() -1; i > 0; --i) {
			
			System.out.println(sentense.charAt(i));
			
			
		}
		
	}
}
