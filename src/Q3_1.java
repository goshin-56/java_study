
//1から10までの乱数を発生させてそれを画面に表示し、5以上ならば、”5以上です”と表示するプログラム

import java.util.Random;

public class Q3_1 {
	public static void main (String[] args) {
		Random ran = new Random();
		
		int sei = ran.nextInt(10)+1;
		System.out.println(sei);
		if (sei>=5) {
			System.out.println("5以上");
		}
	}
}