
//�P����10�܂ł̓�̗����𔭐������A���ꂼ��a,b�Ƃ����ϐ��ɑ�����ĕ\�����Aa�̂ق����傫����΁A�ha�̂ق����傫���ł��B�h�ƕ\�����Ab�̂ق����傫����΁hb�̂ق����傫���ł��B�h�ƕ\�����A�����łȂ���΁A�h�������ł��h�ƕ\������v���O����

import java.util.Random;

public class Q3_14 {
	public static void main (String[] args) {
		
		Random x = new Random();
		Random y = new Random();
		int a = x.nextInt(10)+1;
		int b = y.nextInt(10)+1;
		
		System.out.println(a+"�A"+b);
		if (a > b) {
			System.out.println("a�̂ق����傫���ł�");
		} else if (a < b) {
			System.out.println("b�̂ق����傫���ł�");
		} else {
			System.out.println("�������ł�");
		}
	}
}