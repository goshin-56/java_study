
//1から10までの乱数を発生させ、偶数なら、★を、奇数なら☆を、それぞれ発生した数の文だけ表示するプログラム

import java.util.Random;

public class Q4_14 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		for (int i = 1; i <= b; i++) {
			if (b % 2 == 0) {
				System.out.print(" " + "★" + " ");
			} else {
				System.out.print(" " + "☆" + " ");
			}
		}
	}
}