
//1����6�܂ł̗����𔭐������āA3�ȏ�̐��l���o���ꍇ�A�u3�ȏ�ł��v�ƕ\������v���O����

import java.util.Random;

public class Q3_6 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(6)+1;
		
		System.out.println(b);
		if (b >= 3) {
			System.out.println("�R�ȏ�ł�");
		}
	}
}