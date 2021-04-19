package myobj.item;

public class Canddy extends Item {
	
	int healthy;
	
	public Canddy(String name, int price) {
		super(name, price);
		healthy = 10;
	}
	
	public void use() {
		System.out.println(name + "를 먹어서 + healthy + 만큼 목 건강이 좋아졌습니다.");
	}
	public static void main(String[] args) {
		new Canddy("목캔디", 1500).info();
	}
	
}
