
//�P����3�̗����𔭐������A�P�Ȃ�A�h�O�[�h�A2�Ȃ�A�h�p�[�h3�Ȃ�h�`���L�h�ƕ\������v���O����

import java.util.Random;

public class Q3_13 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(3)+1;
		
		System.out.println(b);
		if (b == 1) {
			System.out.println("�O�[");
		} else if (b == 2) {
			System.out.println("�p�[");
		} else {
			System.out.println("�`���L");
		}
	}
}