
//1����100�܂ł̐��l�𗐐��Ŕ��������ĕ\�����A�ȉ��̏��������Ȃ����B
//
//�Q�̔{���ł���Ȃ�A�h2�̔{���ł��B�h�ƕ\��
//�R�̔{���ł���Ȃ�A�h3�̔{���ł��B�h�ƕ\��
//�������A2�̔{���ł�����A3�̔{���ł�����ꍇ�́A�h2��3�̌��{���ł��B�h�ƕ\���B

import java.util.Random;

public class Q3_16 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b % 2 == 0 && b % 3 == 0) {
			System.out.println("2��3�̌��{���ł�");
		} else if (b % 3 == 0){
			System.out.println("3�̔{���ł�");
		} else if (b % 2 == 0) {
			System.out.println("2�̔{���ł�");
		}
	}
}