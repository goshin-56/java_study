
//1から10までの乱数を発生させてそれを画面に表示し、5以上ならば、”5以上です”と表示するプログラム

import java.util.Random;

public class Q3_1 {
	public static void main (String[] args) {
		
		Random a = new Random();	
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		if (b >= 5) {
			System.out.println("5以上です");
		}
	}
}