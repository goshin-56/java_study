
//1����100�܂ł̗����𔭐������ĕ\�����A�l��10�ȉ����A90�ȏ�Ȃ�A�h10�ȉ���90�ȏ�̒l�ł��h�ƕ\�����A�����łȂ���΁A�h10���傫��90�����ł��h�ƕ\������v���O����

import java.util.Random;

public class Q3_10 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b <= 10 || b >= 90) {
			System.out.println("10�ȉ���90�ȏ�̒l�ł�");
		} else {
			System.out.println("�P�O���傫���X�O�����ł�");
		}
	}
}