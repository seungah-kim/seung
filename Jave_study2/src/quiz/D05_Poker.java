package quiz;

import java.util.ArrayList;
import java.util.HashSet;



public class D05_Poker {

	/*
	 	
	 	��Ŀ�� �����غ�����
	 	
	 */
	
	public static void main(String[] args) {
		
			ArrayList<Integer> numbers = new ArrayList<>();
			
			numbers.add(1);
			numbers.add(3);
			numbers.add(5);
			numbers.add(7);
			numbers.add(9);
			
			HashSet<Integer> answer = new HashSet<>();
			
			answer.add(3);
			answer.add(5);
			answer.add(7);
			
			System.out.println("number�� answer�� ���� �����ϰ� �ִ°�?" 
							+ numbers.containsAll(answer));

			
	}

}


