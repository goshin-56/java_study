
//ÇPÇ©ÇÁ10Ç‹Ç≈ÇÃóêêîÇî≠ê∂Ç≥ÇπÇƒï\é¶ÇµÅA5à»è„Ç»ÇÁÇŒÅAÅh5à»è„Ç≈Ç∑ÅhÇ∆ï\é¶ÇµÅAÇªÇ§Ç≈Ç»ÇØÇÍÇŒÅAÅh5ñ¢ñûÇ≈Ç∑ÅhÇ∆ï\é¶Ç∑ÇÈÉvÉçÉOÉâÉÄ

import java.util.Random;

public class Q3_7 {
	public static void main (String[] args) {
		
		Random a = new Random();
		int b = a.nextInt(10)+1;
		
		System.out.println(b);
		if (b >= 5) {
			System.out.println("ÇTà»è„Ç≈Ç∑");
		} else {
			System.out.println("ÇTñ¢ñûÇ≈Ç∑");
		}
	}
}