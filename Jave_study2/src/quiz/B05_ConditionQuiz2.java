package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {
	
	/*
    [ ¾Ë¸ÂÀº Á¶°Ç½ÄÀ» ¸¸µé¾îº¸¼¼¿ä ]

    1. charÇü º¯¼ö a°¡ 'q'¶Ç´Â 'Q'ÀÏ ¶§ true
    2. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
    3. charÇü º¯¼ö c°¡ ¹®ÀÚ('0' ~ '9')ÀÏ ¶§ true
    4. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true
    
     ¡Ø À¯´ÏÄÚµå Ç¥ ÂüÁ¶
    5. charÇü º¯¼ö e°¡ ÇÑ±ÛÀÏ ¶§ true
    6. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ ¶§ true 
    
    7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true
            
    */ 
	
	/*public static void main(String[] args) {
	
	int a = 'q';
	char ch = 'Q';
	System.out.println((char) a);
	*/
	
	public static void main (String args[]) {
		
		char a = 'Q';
		char b = 'A';
		char c = '5';
		char d = ' ';
		char e = '¹Ú';
		char f = 'ª¢';
		String user_input;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		System.out.println("2. " + (b != ' ' && b != '\t'));
		System.out.println("3. " + (c >= '0' && c <= '9'));
		System.out.println("4. ¾ËÆÄºªÀÎ°¡?" 
				+ ((d >= 'A' && d <= 'z') || (d >= 'a' && d <= 'z')));
		System.out.println("5. " + (e >= '°¡' && e <= '¹Ú')); 
		System.out.println(e >= 0xAC00 && e <= 0xD7AF);
		
		System.out.printf("&X\n", (int)'ÆR');
		
		System.out.println((f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF));
		// ** °°Àº°ÍµéÀÎµ¥ ¿Ö <= >= ±âÈ£¸¦ »ç¿ëÇÏ´Â°ÍÀÎ°¡?
		
		System.out.print("¾Æ¹« ´Ü¾î³ª ÀÔ·ÂÇØ º¸¼¼¿ä > ");
		user_input = sc.next();
		
		System.out.println(user_input.equals("exit"));
	}

}
