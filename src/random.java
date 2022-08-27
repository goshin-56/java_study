
//乱数のサンプルコード

import java.util.Random;

public class random {
	public static void main(String[] args) {
		Random ran = new Random();
		
		for (int i=1; i<=20; i++) {
			int sei = ran.nextInt(10)+1;
			System.out.println(sei);
		}
	}
}