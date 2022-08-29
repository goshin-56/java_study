
//1‚©‚ç100‚Ü‚Å‚Ì—”‚ð”­¶‚³‚¹‚Ä‚»‚ê‚ð‰æ–Ê‚É•\Ž¦‚µA’l‚ª20ˆÈã80–¢–ž‚Å‚ ‚ê‚ÎAh20ˆÈã80–¢–ž‚Å‚·h‚Æ•\Ž¦‚·‚éƒvƒƒOƒ‰ƒ€

import java.util.Random;

public class Q3_05 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b >= 20 && b < 80) {
			System.out.println("‚Q‚OˆÈã‚W‚O–¢–ž‚Å‚·");
		}
	}
}