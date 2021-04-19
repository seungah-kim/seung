import java.util.ArrayList;

public class D01_ArrayList {
	
	/*
	 	# Java Collection
	 	
	 	- �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
	 	- Collection �������̽��� ��ӹ��� �������̽��δ� List, Set ���� �ִ�
	 	
	 	# Java.util.ArrayList
	 	
	 	- �迭�� �ٸ��� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
	 	- �迭�� ������ �����̴�
	 	- ���������� ��� �����Ϳ� �����ؾ� �� �� ���� �����ϴ�
	 */
	public static void main(String[] args) {
		
		// # Ÿ���� �����ϸ� ArrayList �����ϱ�
		// - Ÿ���� ������ �� �翵�ϴ� <>�� ���׸�(Generic)�̶�� �θ���
		ArrayList<String> fruits = new ArrayList<>();
		ArryaList<int> numbers = newArryaList<>();
		
		
		
		// add (item): ����Ʈ�� ���ϴ� �����͸� ���������� �� �ڿ� �߰��Ѵ�
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("kiwi");
		
		//add(index, item): ����Ʈ�� ���ϴ� ��ġ�� �����͸� �ִ´�
		fruits.add(2, "orange");
		fruits.add(2, "peach");
		fruits.add(2, "grape");
		
		
		System.out.println(fruits);
		
		//get(index): ����Ʈ���� ���ϴ� �ε����� �����͸� �ϳ� ������
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(fruits.get(2));
		System.out.println(fruits.get(3));
		
	}
	
}
