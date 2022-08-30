
//forの二重ループを用いて、iとjが等しいとき □ 、それ以外は ■ を表示するプログラム

public class Q4_18 {
	public static void main (String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) {
					System.out.print("□" + " ");
				} else {
					System.out.print("■" + " ");
				}
			}
			System.out.println();
		}
	}
}