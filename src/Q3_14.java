
//１から10までの二つの乱数を発生させ、それぞれa,bという変数に代入して表示し、aのほうが大きければ、”aのほうが大きいです。”と表示し、bのほうが大きければ”bのほうが大きいです。”と表示し、そうでなければ、”等しいです”と表示するプログラム

import java.util.Random;

public class Q3_14 {
	public static void main (String[] args) {
		
		Random x = new Random();
		Random y = new Random();
		int a = x.nextInt(10)+1;
		int b = y.nextInt(10)+1;
		
		System.out.println(a+"、"+b);
		if (a > b) {
			System.out.println("aのほうが大きいです");
		} else if (a < b) {
			System.out.println("bのほうが大きいです");
		} else {
			System.out.println("等しいです");
		}
	}
}