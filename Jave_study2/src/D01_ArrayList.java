import java.util.ArrayList;

public class D01_ArrayList {
	
	/*
	 	# Java Collection
	 	
	 	- 자바에서 기본적으로 제공하는 자료구조 인터페이스
	 	- Collection 인터페이스를 상속받은 인터페이스로는 List, Set 등이 있다
	 	
	 	# Java.util.ArrayList
	 	
	 	- 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스
	 	- 배열과 유사한 형태이다
	 	- 순차적으로 모든 데이터에 접근해야 할 때 가장 유리하다
	 */
	public static void main(String[] args) {
		
		// # 타입을 지정하며 ArrayList 생성하기
		// - 타입을 지정할 때 사영하는 <>를 제네릭(Generic)이라고 부른다
		ArrayList<String> fruits = new ArrayList<>();
		ArryaList<int> numbers = newArryaList<>();
		
		
		
		// add (item): 리스트에 원하는 데이터를 순차적으로 맨 뒤에 추가한다
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("kiwi");
		
		//add(index, item): 리스트의 원하는 위치에 데이터를 넣는다
		fruits.add(2, "orange");
		fruits.add(2, "peach");
		fruits.add(2, "grape");
		
		
		System.out.println(fruits);
		
		//get(index): 리스트에서 원하는 인덱스의 데이터를 하나 꺼낸다
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));
		
	}
	
}
