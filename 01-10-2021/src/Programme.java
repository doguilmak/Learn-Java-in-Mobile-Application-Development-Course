import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
				
		//System.out.print("Hello World");
		/*int sayi1=10;
		char karakter='A';
		boolean boolean=true;
		float sayi2=10;
		double sayi3=100;
		String ad="Can";
		
		System.out.println(sayi1);
		System.out.println(karakter);
		System.out.println(boolean);
		System.out.println(sayi2);
		System.out.println(sayi3);
		System.out.println(ad);*/
		
		/*int s1;
		int s2;
		int sonuc;*/
		//int s1, s2, sonuc;
		
		/*int s1=5;
		int s2=3;
		int sonuc;
		
		sonuc= s1 + s2;				
		System.out.print("İki Sayının Toplamı: "+sonuc);*/

		
		//KLAVYEDEN VERİ ALMA İŞLEMİ
		/*Scanner okuyucu=new Scanner(System.in);//klavyeden veri alımı için tanımlama
		System.out.print("Klavyeden bir değer giriniz:");
		String a = okuyucu.next();
		System.out.print("Klavyeden girilen değer: "+a);*/
		

		//TANIMLAMA
		/*int s1, s2, toplam;
		
		//GİRİŞ İŞLEMLERİ
		Scanner klavye=new Scanner(System.in);
		System.out.print("1. Sayıyı Giriniz:");
		s1 = klavye.nextInt();
		System.out.print("2. Sayıyı Giriniz:");
		s2 = klavye.nextInt();
		
		//İŞLEMLER
		toplam= s1 + s2;
		
		//ÇIKIŞ İŞLEMLERİ
		System.out.println("İki sayının toplamı: " + toplam);*/
		
		/*int s1, s2, sonuc;
		
		Scanner klavye=new Scanner(System.in);
		System.out.print("1. Sayıyı Giriniz:");
		s1=klavye.nextInt();
		System.out.print("2. Sayıyı Giriniz:");
		s2=klavye.nextInt();
		
		//İŞLEMLER
		sonuc = s1 + s2;
		System.out.println("İki sayının toplamı:"+sonuc);
		
		sonuc = s1 - s2;
		System.out.println("İki sayının farkı:"+sonuc);
		
		sonuc = s1 * s2;
		System.out.println("İki sayının çarpımı:"+sonuc);*/
		
		/*float s1, s2, sonuc;
		
		Scanner klavye=new Scanner(System.in);
		System.out.print("1. Sayıyı Giriniz:");
		s1 = klavye.nextFloat();
		System.out.print("2. Sayıyı Giriniz:");
		s2 = klavye.nextFloat();
		
		//İŞLEMLER
		sonuc=s1+s2;
		System.out.println("İki sayının toplamı:"+sonuc);
		
		sonuc= s1 - s2;
		System.out.println("İki sayının farkı:"+sonuc);
		
		sonuc= s1 * s2;
		System.out.println("İki sayının çarpımı:"+sonuc);
		
		sonuc= s1 / s2;
		System.out.println("İki sayının bölümü:"+sonuc);*/
		
		float s1, s2, sonuc;
		String islem="";
		
		Scanner klavye=new Scanner(System.in);
		System.out.print("1. Sayıyı Giriniz: ");
		s1 = klavye.nextFloat();
		System.out.print("2. Sayıyı Giriniz: ");
		s2 = klavye.nextFloat();
		System.out.print("Yapmak İstediğiniz İşlemi Giriniz: ");
		islem = klavye.next();
		
		sonuc=0;				
		if(islem.equals("+"))
			sonuc= s1 + s2;
		else if(islem.equals("-"))
			sonuc= s1 - s2;
		else if(islem.equals("*"))
			sonuc= s1 * s2;
		else if(islem.equals("/"))
			sonuc = s1 / s2;
		
		System.out.println("Sonuç: " + sonuc);
	}

}
