
//１から3の乱数を発生させ、１なら、”グー”、2なら、”パー”3なら”チョキ”と表示するプログラム

import java.util.Random;

public class Q3_13 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(3)+1;
		
		System.out.println(b);
		if (b == 1) {
			System.out.println("グー");
		} else if (b == 2) {
			System.out.println("パー");
		} else {
			System.out.println("チョキ");
		}
	}
}