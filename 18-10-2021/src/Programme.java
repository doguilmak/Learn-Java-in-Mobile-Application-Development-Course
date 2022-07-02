import java.util.Random;

public class Programme {

	// Belirli Sayi Araliginda Rastgele 6 Farkli Sayi Üretme
	public static int rastgele_bul(int min, int max) {
		Random rastgele=new Random();
		int[] dizi=new int[6];
		
		if (max-min < 6) {
			System.out.println("Maksimum ve minimum sayı aralığı en az 6 olmalıdır.");
			System.exit(0);
		}
		if (min>max) {
			System.out.println("Maksimum sayı minimum sayıdan büyük olmalıdır.");
			System.exit(0);
		}
		
		int yedek;
		int sira=0;		
		while(true) {
			
			yedek=rastgele.nextInt(max-min)+min;
			int i = 0;
			for (i = 0; i < dizi.length; i++) {
				if(yedek==dizi[i])
					break;
			}
			
			
			if(i==dizi.length)	{
				dizi[sira]=yedek;
				sira++;
			}
			
			if(sira==6)
				break;
		}			
		for(int i = 1; i <= 6; i++)	{
			System.out.println(i+ " Numaralı Sayı: "+ dizi[i-1]);
			
		}
		return sira;		
		
	}
	
	public static void main(String[] args) {
		
		// Random sayılar
		rastgele_bul(5, 11);
			
	}

}
