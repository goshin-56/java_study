
//１から10までの乱数を発生させ、その数を表示した後、forループを用いて、その数だけ■マークを表示するプログラム(while文)

import java.util.Random;

public class Q4_02 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		int i = 0;
		while (i < b) {
		    System.out.print(" ■ ");
		    i++;
			if (i == b) {
				break;
			}
		}
	}
}