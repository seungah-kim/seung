
public class B09_Operator3 {

	public static void main(String[] args) {
		/*
		 
		 	#���� ������
		 	
		 	-������ if���� �� �ٷ� ǥ���� �� �ִ٤�
		 	- ���� ��? : �ƴϿ�;
		 
		 
		 */
		
		//ex: �ʿ��� �ٱ��� ���� ���ϱ�
		int apple = 24;
		int size = 10;
		
		int needs = apple % size == 0 ?  size : apple / size + 1;
		
		boolean isEven = apple % 2 == 0;
		
		
		//if���� 3-4�� �����µ� �����ϰ� ����� �� �ִ�.
		System.out.println("�ʿ��� �ٱ��� ������" + needs + "�� �Դϴ�" ); 
	
		System.out.printf("����� ������ %s �Դϴ�.", isEven ? "¦��" : "Ȧ��");

	}

}
