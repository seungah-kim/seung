import java.util.HashSet;
import java.util.Set;

public class D02_HashSet {
	
	/*
	 	# Set
	 	
	     - 집합을 구현해놓은 클래스
	     - 요소로 같은 값이 들어오는 것을 허용하지 않는다
	     
	     # Hash
	      
	      - 어떤 값을 넣었을 떄 전혀 예측할 수 없는 값이 생성되어야 하는 알고리즘
	      - 같은 값을 넣었을 때는 항상 일정한 값이 나와야 한다
	      - 유사한 값을 넣었을 떄 예측하기 힘든 전혀 다른 값이 나온다
	      - 생성된 해쉬값으로 원해 값을 찾는 것이 불가능해야 한다
	      - 다시 원래 값으로 돌아갈 수도 없는 단방향성 알고리즘
	      - 중복 체크시에 뛰어난 성능을 보인다
	      
	      
	      * MD5 (약함)
	      
	      hello -> 0000ABC3258169AFF21364...
	      hello1 -> 203AD5FFA1D&C65AD681FDFF3965CDs
	      hello + 공백 ->ㄹ814893777BCC2295FFF05F00E508DA6
	 	
	 	 * SHA256 (셈)
	 	   
	 	    hello -> 2CF24DBA5FB0A30E26E83B2AC589E29E1B161E5C1FA7425E73043362938B9824	
	 	    ...
	 
	 */
		public static void main(String[] args) {
			HashSet<Integer> numbers = new HashSet<>();
			
			numbers.add(100);
			numbers.add(100);
			numbers.add(100);
			numbers.add(100);
			numbers.add(100);
			
			System.out.println(numbers);
			
			//같은 컬렉션 인터페이스이기 때문에 ArrayList에 있는 메서드들이 여기에도 있다
			if (numbers.remove(100)) {
				System.out.println("지우기 성공");
				
			}else {
				System.out.println("지우기 실패");
			}
			System.out.println(numbers);
			
			// ※ 이름에 해쉬가 들어간 알고리즘들은 순서가 없다
			HashSet<String> english = new HashSet<>();
			
			english.add("apple");
			english.add("airplane");
			english.add("bio");
			english.add("cat");
			english.add("drama");
			english.add("zebra");
			english.add("elephant");
			
			System.out.println(english);
			
			// ※ Set은 인덱스가 없기 떄문에 for-each만 사용할 수 있다 
			for (String word  : english) {
				System.out.println(word);
				
			}
			
			//※ 컬렉션끼리는 변환이 자유롭다
			// - Set의 내용은 정렬해야 한다면 List로 변환하여 사용할 수 있다
			// - List의 내용들 중 중복을 제거한 목록이 필요하다면 Set으로 변환하여 사용할 수 있다
			ArryaList<String> english_list = new ArrayList<>(english);
			Collections.sort(english_list);
			System.out.println(english_list);
			
			
			
			
			
			
			
			// contains() : 컬렉션에 해당 요소가 포함되어 있는지 여부를 변환
			 System.out.println(english.contains("apple"));
			 System.out.println(english.contains("banana"));
			 
			 
			 System.out.println(english_list.contains("apple"));
			 System.out.println(english_list.contains("banana"));
			 
			 
			 // containsAll(Collection) : 전달한 컬렉션이 모두 포함되어 있는지를 검사
			 Set<String> subset = new HashSet<>();
			 List<String> sublist = new ArrayList<>();
			 
			 subset.add("zebra");
			 subset.add("drama");
			 
			 subset.add("apple");
			 subset.add("apple");
			 subset.add("apple");
			 
			 
			 
			 System.out.println("english에는 subset의 모든 내용이 들어있나요?"
					 + english.containsAll(subset));
			 System.out.println("english에는 sublist의 모든 내용이 들어있나요?"
					 + english.containsAll(sublist));
			 
			 //addAll(Collection) : 전달한 컬렉션의 내용을 모두 추가 (추가 성공 여부를 반환)
			 // - 새로 추가된 것이 있으면 true
			 // - 이미 모두 포함된 경우에는 false를 반환한다
			 System.out.println(english.addAll(subset));
			 System.out.println(english.addAll(subset));
			 
			 
			 // # removeAll(Collection) : 전달한 컬렉션과 같은 내용을 모두 제거
			 // - 지워진게 있으면 true 없으면 false
			 System.out.println(english_list.removeAll(subset));
			 System.out.println(english_list);
			 
			 
			 // # retainAll(Collection) : 전달한 컬렉션과 일치한 내용만 남는다
			 // - 변한것이 있다면 true 없으면 false
			 english.retainAll(subset);
			 System.out.println(english);
			 
			 // 
	}
		
}