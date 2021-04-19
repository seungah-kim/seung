
public class C15_Throw {

	/*
	 	# throw
	 	
	 	 - 원하는 예외를 발생시킨다
	 	 
	 	# throws
	 	
	 	- 해당 메소드에서 이러한 예외들을 발생시킨다는 것을 알린다
	 	- 해당 메서드를 호출하는 곳에 경고를 해줄 수 있다
	
	 
	 # Exception클래스를 상속받은 예외는 "반드시 처리해야 하는 예외"가 된다
	  - Exception은 예외처리를 하지 않으면 컴파일 에러를 발생시킨다
	  - 예외처리가 된 경우에만 컴파일을 허용해준다
	  
	  #RuntimeException 클래스를 상속받은 예외는 "꼭 처리하지 않아도 되는 예외"가 된다
	  
	   - InputMisamaExpetion, ArrayIndexOutOfBoundException ...등
	   - 예외 처리를 하지 않아도 컴파일 에러는 발생하지 않는 예외들
	 
	 */
	
	
	
	public static void main(String[] args) {
		C15_Throw instance = new C15_Throw();
		
		try {
			instance.dangerous_method();
		}catch (FileNotFoundException e) {
			System.out.println("파일 못찾음");
		}
		System.out.println("프로그램 정상 종료");
	}
	
	public void dangerous_method() throws FileNotFoundException {
		// 파일의 내용을 읽어오기 위한 준비 과정 (꼭 처리해야 하는 예외가 발생)
		File f = new File("D:\\namaless111.txt");
		FileReader reader = new FileReader(f);
		
	}
	
	
}
