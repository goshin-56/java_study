
//1から100までの乱数を発生させてそれを画面に表示し、値が20以上80未満であれば、”20以上80未満です”と表示するプログラム

import java.util.Random;

public class Q3_5 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b >= 20 && b < 80) {
			System.out.println("２０以上８０未満です");
		}
	}
}