
//１から100までの乱数を発生させ、値が20以上80未満であれば、”20以上80未満です”と表示し、そうでなければ、”20未満か、80以上です”と表示するプログラム

import java.util.Random;

public class Q3_11 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b >= 20 && b < 80) {
			System.out.println("２０以上８０未満です");
		} else {
			System.out.println("２０未満か８０以上です");
		}
	}
}