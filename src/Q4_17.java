
//for文を用いて、iがjより大きいまたは等しいとき　■　、iがjより小さいとき □ を表示するプログラム

public class Q4_17 {
	public static void main (String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i >= j) {
					System.out.print("■" + "　");
				} else {
					System.out.print("□" + " ");
				}
			}
			System.out.println();
		}
	}
}