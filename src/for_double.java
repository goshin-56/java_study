
//forの二重ループのサンプル【内容は九九の一覧表】

public class for_double {
	public static void main (String[] args) {
		
//		iのfor文が縦、jのfor文が横を表している
		for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "x" + j + "=" + i*j + " ");
            }
            System.out.println();
        }
	}
}