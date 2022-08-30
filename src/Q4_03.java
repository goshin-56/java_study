
//１から10までの乱数を発生させ、その数を表示した後、forループを用いて、その数だけ■マークを表示するプログラム(do~while文)

import java.util.Random;

public class Q4_03 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		int i = 0;
		do {
			System.out.print(" ■ ");
			i++;
		} while (i < b);
	}
}