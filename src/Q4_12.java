
//�������J��Ԃ����������A���v�� 100 �𒴂�������͂��~�߂č��v��\������v���O����

import java.util.Random;

public class Q4_12 {
	public static void main (String[] args) {
		
		int[] s = new int[10];
		int total = 0;
		
		for (int i = 0; i < s.length; i++) {
			Random a = new Random();
			int b = a.nextInt(100)+1;
			System.out.println(b);
			total = total + b;
			if (total > 100) {
				break;
			}
		}
		System.out.println("���v��" + total);
	}
}