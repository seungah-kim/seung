package quiz;

import java.util.ArrayList;
import java.util.HashSet;



public class D05_Poker {

	/*
	 	
	 	포커를 구현해보세요
	 	
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
			
			System.out.println("number가 answer를 전부 포함하고 있는가?" 
							+ numbers.containsAll(answer));

			
	}

}


