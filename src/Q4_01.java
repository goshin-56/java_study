
//�P����10�܂ł̗����𔭐������A���̐���\��������Afor���[�v��p���āA���̐��������}�[�N��\������v���O����(for��)

import java.util.Random;

public class Q4_01 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		for (int i = 0; i < b; i++) {
			System.out.print(" �� ");
			if (i == b) {
				break;
			}
		}
	}
}