
//1����10�܂ł̗����𔭐������Ă������ʂɕ\�����A5�ȏ�Ȃ�΁A�h5�ȏ�ł��h�ƕ\������v���O����

import java.util.Random;

public class Q3_1 {
	public static void main (String[] args) {
		Random ran = new Random();
		
		int sei = ran.nextInt(10)+1;
		System.out.println(sei);
		if (sei>=5) {
			System.out.println("5�ȏ�");
		}
	}
}