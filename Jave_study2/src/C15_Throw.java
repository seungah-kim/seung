
public class C15_Throw {

	/*
	 	# throw
	 	
	 	 - ���ϴ� ���ܸ� �߻���Ų��
	 	 
	 	# throws
	 	
	 	- �ش� �޼ҵ忡�� �̷��� ���ܵ��� �߻���Ų�ٴ� ���� �˸���
	 	- �ش� �޼��带 ȣ���ϴ� ���� ��� ���� �� �ִ�
	
	 
	 # ExceptionŬ������ ��ӹ��� ���ܴ� "�ݵ�� ó���ؾ� �ϴ� ����"�� �ȴ�
	  - Exception�� ����ó���� ���� ������ ������ ������ �߻���Ų��
	  - ����ó���� �� ��쿡�� �������� ������ش�
	  
	  #RuntimeException Ŭ������ ��ӹ��� ���ܴ� "�� ó������ �ʾƵ� �Ǵ� ����"�� �ȴ�
	  
	   - InputMisamaExpetion, ArrayIndexOutOfBoundException ...��
	   - ���� ó���� ���� �ʾƵ� ������ ������ �߻����� �ʴ� ���ܵ�
	 
	 */
	
	
	
	public static void main(String[] args) {
		C15_Throw instance = new C15_Throw();
		
		try {
			instance.dangerous_method();
		}catch (FileNotFoundException e) {
			System.out.println("���� ��ã��");
		}
		System.out.println("���α׷� ���� ����");
	}
	
	public void dangerous_method() throws FileNotFoundException {
		// ������ ������ �о���� ���� �غ� ���� (�� ó���ؾ� �ϴ� ���ܰ� �߻�)
		File f = new File("D:\\namaless111.txt");
		FileReader reader = new FileReader(f);
		
	}
	
	
}
