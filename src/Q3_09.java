
//１から100までの乱数を発生させて表示し、50未満ならば、”50未満です”とそうでなければ、”50以上です”と表示するプログラム

import java.util.Random;

public class Q3_09 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b < 50) {
			System.out.println("５０未満です");
		} else {
			System.out.println("５０以上です");
		}
	}
}