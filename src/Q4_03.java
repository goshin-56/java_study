
//�P����10�܂ł̗����𔭐������A���̐���\��������Afor���[�v��p���āA���̐��������}�[�N��\������v���O����(do~while��)

import java.util.Random;

public class Q4_03 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		int i = 0;
		do {
			System.out.print(" �� ");
			i++;
		} while (i < b);
	}
}