
//�P����10�܂ł̗����𔭐������A������5�ȏゾ������A���̐��������}�[�N��\�����A5������������A���̐���\������v���O����

import java.util.Random;

public class Q4_13 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		if (b < 5) {
			System.out.print(b);
		} else if (b >= 5) {
			for (int i = 1; i <= b; i++) {
				System.out.print(" " + "��" + " ");
			}
		}
	}
}