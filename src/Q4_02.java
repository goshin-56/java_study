
//�P����10�܂ł̗����𔭐������A���̐���\��������Afor���[�v��p���āA���̐��������}�[�N��\������v���O����(while��)

import java.util.Random;

public class Q4_02 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		int i = 0;
		while (i < b) {
		    System.out.print(" �� ");
		    i++;
			if (i == b) {
				break;
			}
		}
	}
}