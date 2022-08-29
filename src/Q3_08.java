
//1から10までの乱数を発生させて表示し、その値が1でなければ”１ではありません”と表示し、1であれば、”1です。”と表示するプログラム

import java.util.Random;

public class Q3_08 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		if (b == 1) {
			System.out.println("１です");
		} else {
			System.out.println("１ではありません");
		}
	}
}