package myobj.item;

public class inventory {
	
	Item[] inventory;
	int size;
	
   public inventory(int size) {
	   inventory = new Item[size];
}
   	public boolean put(Item item) {
   		for (int i = 0;  i < inventory.length; ++i) {
   			if(inventory[i] == null) {
   			   inventory[i] = item;
   			   return true;
   			}
   		}
   		
   		System.out.println("������ �� á���ϴ�");
   		return false;
   	}
   		public void useAllItems() {
   			for(Item item : inventory) {
   				if (item != null) {
   					item.use();
   			}
   		}
   	}
   	public static void main(String[] args) {
   		inventory inven1 = new inventory(5);
   		
   		// �� Item�� �־�� �ϴ� �ڸ��� Item�� ��ӹ��� ��� �͵��� �� �� �ִ�
   		
   		//for (int i = 0; i < 4; ++i) {
   		//	if (inven1.put(new Canddy("���ݶ�", 3000))) {
   		//		System.out.println("�������� �� ���� put()�ּ� true�� ������");
   		//	}else {
   		//		System.out.println("�������� �� �ȵ��� put()���� false�� ���ϵ�");
   		//	}
   		//}
   		inven1.put(new Canddy("���ݶ�", 3000));
   		inven1.put(new Food("���ݶ�", 3000));
   		inven1.put(new Exercise("���ݶ�", 3000));
   		
   		inven1.useAllItems();
   	}
	
		
	}

