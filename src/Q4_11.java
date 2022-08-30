
//個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラム
//数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとする

import java.util.Scanner;

public class Q4_11 {
	public static void main (String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("数字を入力してください＝＞");
		int b = a.nextInt();
		a.close();
		
		for (int i = 0, j = 0; i < b; i++) {
			System.out.print(j++);
			if (j > 9) {
				j = 0;
			}
		}
	}
}