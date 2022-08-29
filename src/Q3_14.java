
//‚P‚©‚ç10‚Ü‚Å‚Ì“ñ‚Â‚Ì—”‚ð”­¶‚³‚¹A‚»‚ê‚¼‚êa,b‚Æ‚¢‚¤•Ï”‚É‘ã“ü‚µ‚Ä•\Ž¦‚µAa‚Ì‚Ù‚¤‚ª‘å‚«‚¯‚ê‚ÎAha‚Ì‚Ù‚¤‚ª‘å‚«‚¢‚Å‚·Bh‚Æ•\Ž¦‚µAb‚Ì‚Ù‚¤‚ª‘å‚«‚¯‚ê‚Îhb‚Ì‚Ù‚¤‚ª‘å‚«‚¢‚Å‚·Bh‚Æ•\Ž¦‚µA‚»‚¤‚Å‚È‚¯‚ê‚ÎAh“™‚µ‚¢‚Å‚·h‚Æ•\Ž¦‚·‚éƒvƒƒOƒ‰ƒ€

import java.util.Random;

public class Q3_14 {
	public static void main (String[] args) {
		
		Random x = new Random();
		Random y = new Random();
		int a = x.nextInt(10)+1;
		int b = y.nextInt(10)+1;
		
		System.out.println(a+"A"+b);
		if (a > b) {
			System.out.println("a‚Ì‚Ù‚¤‚ª‘å‚«‚¢‚Å‚·");
		} else if (a < b) {
			System.out.println("b‚Ì‚Ù‚¤‚ª‘å‚«‚¢‚Å‚·");
		} else {
			System.out.println("“™‚µ‚¢‚Å‚·");
		}
	}
}