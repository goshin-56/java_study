
//1����10�܂ł̗����𔭐������Ă������ʂɕ\�����A���̒l��1�łȂ���΁h�P�ł͂���܂���h�ƕ\������v���O����

import java.util.Random;

public class Q3_02 {
	public static void main(String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		if (b != 1) {
			System.out.println("�P�ł͂���܂���");
		}
	}
}