import java.util.Scanner;
import java.util.Random;

public class Programme {

	public static void main(String[] args) {
		Random rastgele=new Random();
		int elemansayisi=49;
		int[] dizi=new int[6];
		
		int yedek;
		int sira=0;
		while(true) {
			yedek=rastgele.nextInt(elemansayisi)+1;
			int i = 0;
			for (i = 0; i < dizi.length; i++) {
				if(yedek==dizi[i])
					break;
			}
			if(i==dizi.length)
			{
				dizi[sira]=yedek;
				sira++;
			}
			if(sira==6)
				break;
		}		
		/*
		for (int i : dizi) {
			System.out.print(i+"\t");
		}
		*/
		for(int i = 1; i <= 6; i++)
		{
			System.out.println(i+ " Numaralı Sayı: "+ dizi[i-1]);
		}
	}
}
