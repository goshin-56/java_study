
//‚P‚©‚ç100‚Ü‚Å‚Ì—”‚ğ”­¶‚³‚¹‚Ä•\¦‚µA50–¢–‚È‚ç‚ÎAh50–¢–‚Å‚·h‚Æ‚»‚¤‚Å‚È‚¯‚ê‚ÎAh50ˆÈã‚Å‚·h‚Æ•\¦‚·‚éƒvƒƒOƒ‰ƒ€

import java.util.Random;

public class Q3_09 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b < 50) {
			System.out.println("‚T‚O–¢–‚Å‚·");
		} else {
			System.out.println("‚T‚OˆÈã‚Å‚·");
		}
	}
}