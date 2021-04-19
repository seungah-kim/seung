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
   		
   		System.out.println("가방이 꽉 찼습니다");
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
   		
   		// ※ Item을 넣어야 하는 자리에 Item을 상속받은 모든 것들이 들어갈 수 있다
   		
   		//for (int i = 0; i < 4; ++i) {
   		//	if (inven1.put(new Canddy("리콜라", 3000))) {
   		//		System.out.println("아이템이 잘 들어가면 put()애서 true가 리턴함");
   		//	}else {
   		//		System.out.println("아이템이 잘 안들어가면 put()에서 false가 리턴됨");
   		//	}
   		//}
   		inven1.put(new Canddy("리콜라", 3000));
   		inven1.put(new Food("리콜라", 3000));
   		inven1.put(new Exercise("리콜라", 3000));
   		
   		inven1.useAllItems();
   	}
	
		
	}

