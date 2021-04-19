import java.util.HashSet;
import java.util.Set;

public class D02_HashSet {
	
	/*
	 	# Set
	 	
	     - ������ �����س��� Ŭ����
	     - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
	     
	     # Hash
	      
	      - � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰���
	      - ���� ���� �־��� ���� �׻� ������ ���� ���;� �Ѵ�
	      - ������ ���� �־��� �� �����ϱ� ���� ���� �ٸ� ���� ���´�
	      - ������ �ؽ������� ���� ���� ã�� ���� �Ұ����ؾ� �Ѵ�
	      - �ٽ� ���� ������ ���ư� ���� ���� �ܹ��⼺ �˰���
	      - �ߺ� üũ�ÿ� �پ ������ ���δ�
	      
	      
	      * MD5 (����)
	      
	      hello -> 0000ABC3258169AFF21364...
	      hello1 -> 203AD5FFA1D&C65AD681FDFF3965CDs
	      hello + ���� ->��814893777BCC2295FFF05F00E508DA6
	 	
	 	 * SHA256 (��)
	 	   
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
			
			//���� �÷��� �������̽��̱� ������ ArrayList�� �ִ� �޼������ ���⿡�� �ִ�
			if (numbers.remove(100)) {
				System.out.println("����� ����");
				
			}else {
				System.out.println("����� ����");
			}
			System.out.println(numbers);
			
			// �� �̸��� �ؽ��� �� �˰������ ������ ����
			HashSet<String> english = new HashSet<>();
			
			english.add("apple");
			english.add("airplane");
			english.add("bio");
			english.add("cat");
			english.add("drama");
			english.add("zebra");
			english.add("elephant");
			
			System.out.println(english);
			
			// �� Set�� �ε����� ���� ������ for-each�� ����� �� �ִ� 
			for (String word  : english) {
				System.out.println(word);
				
			}
			
			//�� �÷��ǳ����� ��ȯ�� �����Ӵ�
			// - Set�� ������ �����ؾ� �Ѵٸ� List�� ��ȯ�Ͽ� ����� �� �ִ�
			// - List�� ����� �� �ߺ��� ������ ����� �ʿ��ϴٸ� Set���� ��ȯ�Ͽ� ����� �� �ִ�
			ArryaList<String> english_list = new ArrayList<>(english);
			Collections.sort(english_list);
			System.out.println(english_list);
			
			
			
			
			
			
			
			// contains() : �÷��ǿ� �ش� ��Ұ� ���ԵǾ� �ִ��� ���θ� ��ȯ
			 System.out.println(english.contains("apple"));
			 System.out.println(english.contains("banana"));
			 
			 
			 System.out.println(english_list.contains("apple"));
			 System.out.println(english_list.contains("banana"));
			 
			 
			 // containsAll(Collection) : ������ �÷����� ��� ���ԵǾ� �ִ����� �˻�
			 Set<String> subset = new HashSet<>();
			 List<String> sublist = new ArrayList<>();
			 
			 subset.add("zebra");
			 subset.add("drama");
			 
			 subset.add("apple");
			 subset.add("apple");
			 subset.add("apple");
			 
			 
			 
			 System.out.println("english���� subset�� ��� ������ ����ֳ���?"
					 + english.containsAll(subset));
			 System.out.println("english���� sublist�� ��� ������ ����ֳ���?"
					 + english.containsAll(sublist));
			 
			 //addAll(Collection) : ������ �÷����� ������ ��� �߰� (�߰� ���� ���θ� ��ȯ)
			 // - ���� �߰��� ���� ������ true
			 // - �̹� ��� ���Ե� ��쿡�� false�� ��ȯ�Ѵ�
			 System.out.println(english.addAll(subset));
			 System.out.println(english.addAll(subset));
			 
			 
			 // # removeAll(Collection) : ������ �÷��ǰ� ���� ������ ��� ����
			 // - �������� ������ true ������ false
			 System.out.println(english_list.removeAll(subset));
			 System.out.println(english_list);
			 
			 
			 // # retainAll(Collection) : ������ �÷��ǰ� ��ġ�� ���븸 ���´�
			 // - ���Ѱ��� �ִٸ� true ������ false
			 english.retainAll(subset);
			 System.out.println(english);
			 
			 // 
	}
		
}