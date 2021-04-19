package quiz;

import java.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;


public class D02_LottoSet {
	
	/*
	  1���� 45������ �ߺ����� ���� ���� 7���� �̷���� HashSet�� �����ϴ� 
	  ��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ�غ���

	*/
	public HashSet<Inte
	ger> getLottoSet() {
		HashSet<Integer> lotto = new HashSet<>();
	
		while (lotto.size() < 7) {
			lotto.add((int)(Math.random() * 45 + 1));
		}

		
		return lotto;
	
	}
	
	/*
	 	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� ArrayList�� �����Ͽ�
	 	��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
	 */
	public ArrayList<Integer> getLottoList() {
		return new ArrayList<>(getLottoSet());
	}
	/*
	 	1���� 45������ �ߺ����� ���� ���� 7���� �̷���� int[]�� �����Ͽ�
	 	��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ
	 	
	 */
	public int[] getLottoArrya() {
		return getLottoList().toArray(new Integer[7]);
	}
	public int[] getLottoArrya2() {
		Integer[]lotto = getLottoArray();
		int[] result = new int[7];
		
		for (int i = 0; i < 7; ++i) {
			result[i] = lotto[i];
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new D02_LottoSet().getLottoSet();
		
		System.out.println(lotto);
	}
}
