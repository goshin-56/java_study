
//�P����10�܂ł̗����𔭐������ĕ\�����A5�ȏ�Ȃ�΁A�h5�ȏ�ł��h�ƕ\�����A�����łȂ���΁A�h5�����ł��h�ƕ\������v���O����

import java.util.Random;

public class Q3_7 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		if (b >= 5) {
			System.out.println("�T�ȏ�ł�");
		} else {
			System.out.println("�T�����ł�");
		}
	}
}