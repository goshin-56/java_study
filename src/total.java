
//���l���J��Ԃ����͂��A���v�� 100 �𒴂�������͂��~�߂č��v��\������v���O����

import java.util.Scanner;

public class total {
	public static void main (String[] args) {
		
	    // �z��s�̏�����
	    int[] s = new int[10];
	    //### ���v�l��\���ϐ�������
	    int total = 0;
	    //### �ǂ��܂œ��͂��ꂽ���������ϐ�������
	    int lastIndex = -1;
	    System.out.println("��������͂��Ă�������"); //### �v���v�g�̕\���͍ŏ��̂P��ŗǂ��͂�
	    Scanner scan = new Scanner(System.in); //### Scanner�̃C���X�^���X�����[�v���Ƃɍ��K�v�͂Ȃ�
	    // ���͂�10(=�z��̃T�C�Y)��󂯕t����
	    for( int i = 0; i < s.length; ++i ) { //### �z��S�̂��񂷂Ƃ��� i < s.length ���퓅��
	        try {
	            s[i] = scan.nextInt();
	            total += s[i]; //### ���v�l���X�V
	            //### �ǂ��܂ł����v�ɉ����������o���Ă���
	            lastIndex = i;
	            //### ���v�l��100�𒴂���Ɠ��̓X�g�b�v
	            //### (�u���͂�10��s��ꂽ��v�́Afor()�Ŏ����ł��Ă���
	            if( total > 100 ) {
	                break;
	            }
	        } catch( Exception e ) {
	            //### ���̏����ɂ͂Ȃ����A�����l�����͂ł��Ȃ��ꍇ�����͏I��
	            break;
	        }
	    }
	    scan.close();
	    // ���͂��ꂽ���l��S�ďo��
	    for( int i = 0; i <= lastIndex; ++i ) { //### `lastIndex`�Ԗڂ̒l���L���Ȃ̂�`<=`�ɂȂ��Ă���
	         System.out.println(s[i]);
	    }
	}
}