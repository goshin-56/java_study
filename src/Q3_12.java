
//-10から10までの乱数を発生させて表示し、もしも負の値であれば”負の値です”と表示し、正の値であれば、”正の値です”と表示し、そうでなければ、”0です”と表示するプログラム

import java.util.Random;

public class Q3_12 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(21)-10;
		
		System.out.println(b);
		if (b > 0) {
			System.out.println("正の値です");
		} else if (b < 0) {
			System.out.println("負の値です");
		} else {
			System.out.println("0です");
		}
	}
}