
//１から10までの乱数を発生させて表示し、5以上ならば、”5以上です”と表示し、そうでなければ、”5未満です”と表示するプログラム

import java.util.Random;

public class Q3_07 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		if (b >= 5) {
			System.out.println("５以上です");
		} else {
			System.out.println("５未満です");
		}
	}
}