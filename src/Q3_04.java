
//1����100�܂ł̗����𔭐������Ă������ʂɕ\�����A�l��10�ȉ����A90�ȏ�Ȃ�A�h10�ȉ���90�ȏ�̒l�ł��h�ƕ\������v���O����

import java.util.Random;

public class Q3_04 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b <= 10 || b >= 90) {
			System.out.println("10�ȉ���90�ȏ�̒l�ł�");
		}
	}
}