package myobj;

import java.util.Random;

public class Student2 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private static Random ran = new Random();
	private static int sno = 0;
	
	public static int BEST_TOTAL = 0;
	
	private static int getRandomScore() {
		return ran.nextInt(101);
	}
	
	public  Stunent2() {
		kor = getRandomScore();
		eng = getRandomScore();		
		math = getRandomScore();
		name = String.format("학생%06d", sno++);
		BEST_TOTAL = (int).Math.max(getToatl(), BEST_TOTAL);

	}
	
	public int getTotal() {
		return kor + eng + math;
		
	}
	
	public double getAvg() {
		return getTotal() / 3.0;
	}
	
	//public String getTranscript() {
		//System.out.println("서식 %d" , 10);
		//String str = String.format("서식 %d", 10);
		
		return String.format("%s / %3\t / %.2f", name, getTotal(), getAvg());
	}

}
