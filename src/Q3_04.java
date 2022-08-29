
//1から100までの乱数を発生させてそれを画面に表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示するプログラム

import java.util.Random;

public class Q3_04 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b <= 10 || b >= 90) {
			System.out.println("10以下か90以上の値です");
		}
	}
}