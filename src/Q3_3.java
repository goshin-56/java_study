
//1����100�܂ł̗����𔭐������Ă������ʂɕ\�����A�A50�����Ȃ�΁A�h50�����ł��h�ƕ\������v���O����

import java.util.Random;

public class Q3_3 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b < 50) {
			System.out.println("50�����ł�");
		}
	}
}