package myobj.item;

public class Canddy extends Item {
	
	int healthy;
	
	public Canddy(String name, int price) {
		super(name, price);
		healthy = 10;
	}
	
	public void use() {
		System.out.println(name + "�� �Ծ + healthy + ��ŭ �� �ǰ��� ���������ϴ�.");
	}
	public static void main(String[] args) {
		new Canddy("��ĵ��", 1500).info();
	}
	
}
