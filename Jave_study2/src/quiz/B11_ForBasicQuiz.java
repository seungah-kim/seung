package quiz;

public class B11_ForBasicQuiz {
	
	/*
	 
	 	����ڰ� ���ڸ� �Է����� ��
	 	
	 	1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
	 	
	 	2. 1���� �Է��� ���� ������ 5�� ����� ��� ����غ�����
	 	
	 	
	 */

	public static void main(String[] args) {
		
		/*
		//1.
		for(int i = 0; i <= 10; ++i)
			System.out.println(++i);
	 
   
		//2.
		int sum = 0;
		
		for(int i = 1; i <= 5; ++i) {
			if (i % 5 == 0) {
				sum += 1;
			}
			System.out.println("5�� ��� : " + sum);
		 */
		// 1�� ������ ���� ���ڴ� 10, 2�� ������ ���� ���ڴ� 1
		int start1 = 10, start2 = 1;
		
		int end1 = -50, end2 = -50;
		int sum = 0;
		
		//���� start���� end������ ũ�ٸ�, �� ���� ��ȯ�Ѵ�
		if(start1 > end1) {
			int temp = start1;
			start1 = end1;
			end1 = temp;	
		}
		
		if (start2 > end2) {
			int temp = start2;
			start2 =  end2;
			end2 = temp;
			
		}
		
		
		for (int i = start1; i <= end1; ++i) {
			sum += i;	
		}
		System.out.println("10���� user�� �Է��� ���ڱ����� ����: " + sum);
		
		System.out.println();
		System.out.printf("#### %d ~ %d ������ 5�� ����� ��� ####\n",
				start2, end2);
		for (int i = start2; i <= end2; ++i) {
			
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		

}

}