
//1から100までの乱数を発生させてそれを画面に表示し、、50未満ならば、”50未満です”と表示するプログラム

import java.util.Random;

public class Q3_3 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b < 50) {
			System.out.println("50未満です");
		}
	}
}