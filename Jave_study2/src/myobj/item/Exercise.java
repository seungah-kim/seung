package myobj.item;



public class Exercise extends Item {
	
	int kind;
	
	
	
	public Exercise(String name, int kind) {
		super (name, kind);
		kind = 50;
	
	}
	
	public void use() {
		System.out.println(name + "�� �ؼ� " + kind + "�ǰ��� ���������ϴ�");
		
		
	}

}
