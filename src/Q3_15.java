
//�P����100�܂ł̐��l�𗐐��Ŕ��������ĕ\�����A�ȉ��̏������s���Ȃ����B
//
//80�_�ȏ�Ȃ�h�D�h�ƕ\���B
//80�_�����A70�_�ȏ�Ȃ�A�h�ǁh�ƕ\���B
//70�_�����A60�_�ȏ�Ȃ�A�h�h�ƕ\���B
//60�_�����Ȃ�A�h�s�h�ƕ\���B

import java.util.Random;

public class Q3_15 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b+"�_");
		if (b >= 80) {
			System.out.println("�D");
		} else if (b >= 70 && b < 80) {
			System.out.println("��");
		} else if (b >= 60 && b < 70) {
			System.out.println("��");
		} else {
			System.out.println("�s��");
		}
	}
}