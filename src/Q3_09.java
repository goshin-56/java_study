
//�P����100�܂ł̗����𔭐������ĕ\�����A50�����Ȃ�΁A�h50�����ł��h�Ƃ����łȂ���΁A�h50�ȏ�ł��h�ƕ\������v���O����

import java.util.Random;

public class Q3_09 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b < 50) {
			System.out.println("�T�O�����ł�");
		} else {
			System.out.println("�T�O�ȏ�ł�");
		}
	}
}