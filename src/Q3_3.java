
//1から100までの乱数を発生させてそれを画面に表示し、、50未満ならば、”50未満です”と表示するプログラム

import java.util.Random;

public class Q3_3 {
	public static void main (String[] args) {
		Random few = new Random();
		
		int asd = few.nextInt(100)+1;
		System.out.println(asd);
		if (asd < 50) {
			System.out.println("50未満です");
		}
	}
}