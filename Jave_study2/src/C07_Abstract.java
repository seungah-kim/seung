
public class C07_Abstract {
	/*
	 
	 	# �߻� Ŭ����
	 	
	 	- �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
		- Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ������ �տ� abstract�� �ٿ� ǥ���ؾ� �Ѵ�
		
		# �߻� �޼��� (abstract method)
		
		 - �޼����� ���� (���� Ÿ��, ���� ������, �Ű�����)�� ���س��� 
		   �ڼ��� ������ �ڽ� Ŭ�������� �������̵带 ���� �����ϴ� �޼���
		 - �ڽ� Ŭ�������� �������̵� ���� ������ ������ ������ �߻��Ѵ�
	 */

}

abstract class Vehicle {
	
	abstract void ride();
		
	
	
}
	
class Bike extends Vehicle {
	
}

	// �������̵� ���� (���� �Լ���, ���� ���� Ÿ��, ���� �Ű� ����)
	@Override
	void ride() {}
	
}