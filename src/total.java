
//数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラム

import java.util.Scanner;

public class total {
	public static void main (String[] args) {
		
	    // 配列sの初期化
	    int[] s = new int[10];
	    //### 合計値を表す変数を持つ
	    int total = 0;
	    //### どこまで入力されたかを示す変数を持つ
	    int lastIndex = -1;
	    System.out.println("整数を入力してください"); //### プロプトの表示は最初の１回で良いはず
	    Scanner scan = new Scanner(System.in); //### Scannerのインスタンスもループごとに作る必要はない
	    // 入力を10(=配列のサイズ)回受け付ける
	    for( int i = 0; i < s.length; ++i ) { //### 配列全体を回すときは i < s.length が常套句
	        try {
	            s[i] = scan.nextInt();
	            total += s[i]; //### 合計値を更新
	            //### どこまでを合計に加えたかを覚えておく
	            lastIndex = i;
	            //### 合計値が100を超えると入力ストップ
	            //### (「入力が10回行われたら」は、for()で実現できている
	            if( total > 100 ) {
	                break;
	            }
	        } catch( Exception e ) {
	            //### 問題の条件にはないが、整数値が入力できない場合も入力終了
	            break;
	        }
	    }
	    scan.close();
	    // 入力された数値を全て出力
	    for( int i = 0; i <= lastIndex; ++i ) { //### `lastIndex`番目の値も有効なので`<=`になっている
	         System.out.println(s[i]);
	    }
	}
}