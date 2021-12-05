import java.util.Scanner;


public class Programme {

	private static String[] iller = {"ADANA", "AFYON", "BURSA", "KONYA", "TOKAT"};
	private static String il = iller[(int) (Math.random() * iller.length)];
	private static String gizli = new String(new char[il.length()]).replace("\0", "*");
	private static int say = 0;

	public static void main(String[] args) {
		
		long basla = System.currentTimeMillis();
		long bitir = basla + 60*1000; // Milisaniye
		Scanner sc = new Scanner(System.in);
		
		while (say < 4 && gizli.contains("*")) {			
			if (System.currentTimeMillis() > bitir) {
				System.out.println("60 saniye doldu. Islem gecersiz.");
			    System.exit(1);
			}			
			System.out.println("Harf tahmin et!");
			System.out.println(gizli);
			String tahmin = sc.next().toUpperCase();
			sehir_bul(tahmin);
		}
		if(say >= 4) {
			System.out.println("Oyun Bitti");
		}
		sc.close();					
	
	}	
	
	public static void sehir_bul(String tahmin) {
		
		String newasterisk = "";
		for (int i = 0; i < il.length(); i++) {
			if (il.charAt(i) == tahmin.charAt(0)) {
				newasterisk += tahmin.charAt(0);
			} else if (gizli.charAt(i) != '*') {
				newasterisk += il.charAt(i);
			} else {
				newasterisk += "*";
			}
		}

		if (gizli.equals(newasterisk)) {
			say++;
		} else {
			gizli = newasterisk;
		}
		if (gizli.equals(il)) {
			System.out.println("Kazandiniz! Sehir: " + il);
		}		
	
	}
}
