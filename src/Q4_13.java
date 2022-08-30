
//１から10までの乱数を発生させ、もしも5以上だったら、その数だけ★マークを表示し、5未満だったら、その数を表示するプログラム

import java.util.Random;

public class Q4_13 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		if (b < 5) {
			System.out.print(b);
		} else if (b >= 5) {
			for (int i = 1; i <= b; i++) {
				System.out.print(" " + "★" + " ");
			}
		}
	}
}