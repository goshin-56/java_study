
//1から100までの数値を乱数で発生させて表示し、以下の処理をしなさい。
//
//２の倍数であるなら、”2の倍数です。”と表示
//３の倍数であるなら、”3の倍数です。”と表示
//ただし、2の倍数でもあり、3の倍数でもある場合は、”2と3の公倍数です。”と表示。

import java.util.Random;

public class Q3_16 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b % 2 == 0 && b % 3 == 0) {
			System.out.println("2と3の公倍数です");
		} else if (b % 3 == 0){
			System.out.println("3の倍数です");
		} else if (b % 2 == 0) {
			System.out.println("2の倍数です");
		}
	}
}