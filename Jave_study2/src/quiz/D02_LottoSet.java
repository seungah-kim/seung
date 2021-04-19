package quiz;

import java.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;


public class D02_LottoSet {
	
	/*
	  1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 HashSet을 생성하는 
	  반환하는 메서드를 작성 후 테스트해보기

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
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 ArrayList를 생성하여
	 	반환하는 메서드를 작성 후 테스트
	 */
	public ArrayList<Integer> getLottoList() {
		return new ArrayList<>(getLottoSet());
	}
	/*
	 	1부터 45사이의 중복없는 랜덤 숫자 7개로 이루어진 int[]을 생성하여
	 	반환하는 메서드를 작성 후 테스트
	 	
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
