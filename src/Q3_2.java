
//1����10�܂ł̗����𔭐������Ă������ʂɕ\�����A���̒l��1�łȂ���΁h�P�ł͂���܂���h�ƕ\������v���O����

import java.util.Random;

public class Q3_2 {
	public static void main(String[] args) {
		Random koe = new Random();
		
		int dau = koe.nextInt(10)+1;
		System.out.println(dau);
		if (dau != 1) {
			System.out.println("�P�ł͂���܂���");
		}
	}
}