
//‚P‚©‚ç100‚Ü‚Å‚Ì—”‚ð”­¶‚³‚¹A’l‚ª20ˆÈã80–¢–ž‚Å‚ ‚ê‚ÎAh20ˆÈã80–¢–ž‚Å‚·h‚Æ•\Ž¦‚µA‚»‚¤‚Å‚È‚¯‚ê‚ÎAh20–¢–ž‚©A80ˆÈã‚Å‚·h‚Æ•\Ž¦‚·‚éƒvƒƒOƒ‰ƒ€

import java.util.Random;

public class Q3_11 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b >= 20 && b < 80) {
			System.out.println("‚Q‚OˆÈã‚W‚O–¢–ž‚Å‚·");
		} else {
			System.out.println("‚Q‚O–¢–ž‚©‚W‚OˆÈã‚Å‚·");
		}
	}
}