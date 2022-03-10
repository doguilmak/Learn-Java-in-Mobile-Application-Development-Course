import java.util.Random;

public class Programme {

	public static void main(String[] args) {
		//İKİ BOYUTLU DİZİ//
		
		/*
		int satir=5;
		int sutun=5;
		int sabit=1;
		
		int[][] dizi = new int[satir][sutun];
		
		for(int i=0;i<satir;i++)
		{
			for(int j=0;j<sutun;j++)
			{
				dizi[i][j]=sabit;
				sabit++;
			}
		}
		for(int i=0;i<satir;i++)
		{
			for(int j=0;j<sutun;j++)
			{
				System.out.print(dizi[i][j]+ "\t");  //buraya dikkat//
			}
		System.out.println();
		}
		*/
		
		int satir=5;
		int sutun=5;
				
		int[][] dizi = new int[satir][sutun];
		
		for(int i=0;i<satir;i++)
		{
			for(int j=0;j<sutun;j++)
			{
				Random rast=new Random();	
				int sabit=rast.nextInt(25);
				dizi[i][j]=sabit;				
			}
		}
		for(int i=0;i<satir;i++)
		{
			for(int j=0;j<sutun;j++)
			{
				System.out.print(dizi[i][j]+ "\t");
			}
		System.out.println();
		}	
	}
}
