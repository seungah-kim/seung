
public class C01_Function {
	
	/*
	 	# �Լ�
	 	  
	 	  - ����� �̸� �����صΰ� ���߿� ������ ���� �� //���� => ����
	 	  
	 	  - �ڹٿ��� �Լ�(�޼���)�� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ�
		  
		  - �����ص� �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ� 
		  	ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ�ȴ�
		 
		  - ���߿� ���� �� ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν�
		  	�۾��� �ݺ��� ���� �� �ִ�
		  
		  - �Լ��� ������ �� �ش� �Լ��� ��ȯ�� ���� Ÿ���� �տ� ����д�
		  	
		  - ���� Ÿ�� void�� �ش� �Լ��� ��ȯ�ϴ� ���� ���ٴ� ���� ��Ÿ����	
	 */
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; ++i) {
		
			print_rabbit(); 
			print_rabbit(); 
			print_rabbit(); 
		}
		/*int basket = apple_basket(123, 10);
		System.out.println("�ʿ��� �ٱ����� ������" + basket);*/
		System.out.println(apple_basket(155, 10)); 
		
	}
	
	//ex. ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�
	
	/*
	 	public static : ���߿� ������ ��
	 	int : �� �Լ��� ���� ����� Ÿ�� (���� Ÿ��)
	 	apple_basket : Ÿ�� �ڿ� �Լ����� ������ �� �ִ�
	 	apple_basket (int apple, int size)
	 		: �� �Լ��� ������ �� int Ÿ�� ���� �� �� ���� �޵��� ���� (�Ű� ����, argument)
	
	*/
	public static String apple_basket(int apple, int size) { 
		int result;
		
		
		if (apple % size == 0) {
			result = apple / size;
		}else {
			result = apple / size + 1;
			
		}
		//return : �Լ��� ��� �����Ű��, �� �Լ��� ȣ���� ���� ���� �����ش�
		return "�ʿ��� �ٱ����� ������ " + result + "�� �Դϴ�."; //return result;//
		
				
	}
	
	
	
	public static void print_rabbit() {
		System.out.println(" /)/) ");
		System.out.println("(  . .)");
		System.out.println("(   >$");
	}
}
