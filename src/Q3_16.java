
//1‚©‚ç100‚Ü‚Å‚Ì”’l‚ğ—”‚Å”­¶‚³‚¹‚Ä•\¦‚µAˆÈ‰º‚Ìˆ—‚ğ‚µ‚È‚³‚¢B
//
//‚Q‚Ì”{”‚Å‚ ‚é‚È‚çAh2‚Ì”{”‚Å‚·Bh‚Æ•\¦
//‚R‚Ì”{”‚Å‚ ‚é‚È‚çAh3‚Ì”{”‚Å‚·Bh‚Æ•\¦
//‚½‚¾‚µA2‚Ì”{”‚Å‚à‚ ‚èA3‚Ì”{”‚Å‚à‚ ‚éê‡‚ÍAh2‚Æ3‚ÌŒö”{”‚Å‚·Bh‚Æ•\¦B

import java.util.Random;

public class Q3_16 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(100)+1;
		
		System.out.println(b);
		if (b % 2 == 0 && b % 3 == 0) {
			System.out.println("2‚Æ3‚ÌŒö”{”‚Å‚·");
		} else if (b % 3 == 0){
			System.out.println("3‚Ì”{”‚Å‚·");
		} else if (b % 2 == 0) {
			System.out.println("2‚Ì”{”‚Å‚·");
		}
	}
}