
//1から6までの乱数を発生させて、3以上の数値が出た場合、「3以上です」と表示するプログラム

import java.util.Random;

public class Q3_6 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(6)+1;
		
		System.out.println(b);
		if (b >= 3) {
			System.out.println("３以上です");
		}
	}
}