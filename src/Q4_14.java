
//1����10�܂ł̗����𔭐������A�����Ȃ�A�����A��Ȃ灙���A���ꂼ�ꔭ���������̕������\������v���O����

import java.util.Random;

public class Q4_14 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		for (int i = 1; i <= b; i++) {
			if (b % 2 == 0) {
				System.out.print(" " + "��" + " ");
			} else {
				System.out.print(" " + "��" + " ");
			}
		}
	}
}