package quiz;

public class B15_Count369Ver3 {

	public static void main(String[] args) {
		
		int input = 5678;
		int clap = 0;
		
		for(int i = 1; i <= input; ++i) {
			
			int testValue = i;
			System.out.print(i + ": ");
			
			while (testValue > 0) {
				int digit = testValue % 10;
				
				if (digit != 0 && digit % 3 == 0) {
					clap++;
					System.out.print("¦");
				}
			//if(testValue % 10 == 3 || testValue % 10 == 6 testValue % 10 == 9)
				
				testValue /= 10; 
			}
				System.out.println();
			
		}
		

		
/*	int i = 1234;
		
//		System.out.println(i % 10);
//		System.out.println(i / 10 % 10);
//		System.out.println(i / 10 / 10 % 10);
		
		
//		System.out.println(testValue / 1000);
//		System.out.println(testValue & 1000 / 100);
//		System.out.println(testValue % 100 /10);
		System.out.println(testValue % 10);		
*/
	}

}
