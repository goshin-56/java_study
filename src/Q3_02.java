
//1から10までの乱数を発生させてそれを画面に表示し、その値が1でなければ”１ではありません”と表示するプログラム

import java.util.Random;

public class Q3_02 {
	public static void main(String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		if (b != 1) {
			System.out.println("１ではありません");
		}
	}
}