
//�����������l����͂��A���̌������� 0 �` 9 �̐�����\������v���O����
//������ 0, 1, 2, 3, , �̏��ɕ\�����A9 �̎��� 0 �ɖ߂���̂Ƃ���

import java.util.Scanner;

public class Q4_11 {
	public static void main (String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("��������͂��Ă�����������");
		int b = a.nextInt();
		a.close();
		
		for (int i = 0, j = 0; i < b; i++) {
			System.out.print(j++);
			if (j > 9) {
				j = 0;
			}
		}
	}
}