
//1����100�܂ł̗����𔭐������Ă������ʂɕ\�����A�l��20�ȏ�80�����ł���΁A�h20�ȏ�80�����ł��h�ƕ\������v���O����

import java.util.Random;

public class Q3_05 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b >= 20 && b < 80) {
			System.out.println("�Q�O�ȏ�W�O�����ł�");
		}
	}
}