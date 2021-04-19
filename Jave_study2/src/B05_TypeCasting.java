
public class B05_TypeCasting {

	public static void main(String[] args) {
		
		/*
			#Ÿ�� ĳ����
			
			-Ÿ���� �ڿ������� ���ϴ� ��� (Ÿ���� ���ϴ��� ������ ���� ��)
			-Ÿ���� ������ ��ȯ���Ѿ� �ϴ� ��� (Ÿ���� ���ϸ� ������ ���� ��)
			
			#Ÿ���� ũ��
			
			- ���� Ÿ�� : byte(1) < char, short(2) < int(4) < long(8)
			- �Ǽ� Ÿ�� : float(4) < double(8)
			
			���� Ÿ���� ������ �Ǽ�Ÿ�� ���� ǥ�� ������ �۴�.

		*/
		
		//1. �ڿ������� Ÿ�� ĳ����
		byte _byte = 127;
		short _short;
		int _int;
		long _long;
		float _float;
		
		
		_int = _byte; 
		_int = 210000000;
		_long = _int;
		_float = _long; //�������� �Ǽ��� �۾Ƽ� ������ �ȶ�.
		
		System.out.println(_float);
		
		
		//2. ���� �ջ�� ������ �ִ� Ÿ�� ĳ����
		_int = 50000;
		_short = (short) _int; // ���� �ջ�� ���� �����Ƿ� ��� ���ش�. / (short)���� Ÿ�� ĳ�����̴�.
		
		
		System.out.println(_short); //10000 �� ��� 1000
		System.out.println(_short); //50000 �� ��� -15536
		
		
		//int a = (int)Math.round(10.3);
		
		//3. ���� ���̴��� �ٸ��� �ؼ��� �� �ִ� Ÿ���� ��� Ÿ�� ĳ������ �ʿ��ϴ�.
		
		int a = 80;
		char ch = 'z';
		
		System.out.println((char) a);
		System.out.println(a);
		
		System.out.println((int)ch);
		System.out.println(ch);
		//�ڵ�ǥ�� �ܿ� �ʿ䰡 ���� (charŸ�Կ� ���ڸ� ����� ������ ����)
		
		ch = 'M';
		
		System.out.println(ch > 'A');
		System.out.println(ch < 'Z');
		
		ch = '��';

		System.out.println(ch > '��');
		System.out.println(ch < '��');
		
		System.out.println((int)'��');
		
	}

}
