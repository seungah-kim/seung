package myobj.item;

public class Food extends Item {
	
	int chicken;
	
	public Food(String name, int price) {
		super(name, price);
		chicken = 10;
		
	}
	public void use() {
		System.out.println(name + "�� �Ծ + chicken + �� ���ֽ��ϴ�.");

	}
}
