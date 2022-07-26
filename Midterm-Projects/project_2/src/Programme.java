import java.util.Random;

public class Programme {
	
		public static void sans_topu(int tur) {
			
			while(true) {
				
				Random rastgele=new Random();
				int elemansayisi1=34;
				int elemansayisi2=14;
				int[] dizi=new int[6];			
				
				int yedek, yedek2;
				int sira=0;
				
				System.out.println("======== " + tur + " Numaralı Kolon ===========");
				
				while(true)	{
					yedek=rastgele.nextInt(elemansayisi1)+1;
					yedek2=rastgele.nextInt(elemansayisi2)+1;
					dizi[5] = yedek2;
					
					int i = 0;
					for (i = 0; i < dizi.length; i++)	{
						if(yedek==dizi[i])
							break;
					}
					if(i==dizi.length)	{
						dizi[sira]=yedek;
						sira++;
					}
					if(sira==5)
						break;
				}

				for(int i = 1; i <= 6; i++)	{
					System.out.println(i+ " Numaralı Sayı: "+ dizi[i-1]);
				}
				if (tur == 1)	{
					System.out.println("Kolon Doldu!");
					break;
				}
				
				tur--;
			}		
		
		}
		
		public static void main(String[] args) {			
			sans_topu(10);			
		}
		
}
