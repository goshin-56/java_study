
//-10����10�܂ł̗����𔭐������ĕ\�����A���������̒l�ł���΁h���̒l�ł��h�ƕ\�����A���̒l�ł���΁A�h���̒l�ł��h�ƕ\�����A�����łȂ���΁A�h0�ł��h�ƕ\������v���O����

import java.util.Random;

public class Q3_12 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(21)-10;
		
		System.out.println(b);
		if (b > 0) {
			System.out.println("���̒l�ł�");
		} else if (b < 0) {
			System.out.println("���̒l�ł�");
		} else {
			System.out.println("0�ł�");
		}
	}
}