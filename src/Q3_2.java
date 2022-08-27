
//1から10までの乱数を発生させてそれを画面に表示し、その値が1でなければ”１ではありません”と表示するプログラム

import java.util.Random;

public class Q3_2 {
	public static void main(String[] args) {
		Random koe = new Random();
		
		int dau = koe.nextInt(10)+1;
		System.out.println(dau);
		if (dau != 1) {
			System.out.println("１ではありません");
		}
	}
}