import java.util.Scanner;

public class Programme {	
	
	public static void yaz(String gelen) {
		System.out.print(gelen);
	}
	public static void yazln(String gelen) {
		System.out.println(gelen);
	}
	
	public static void yazln() {
			System.out.println();		
	}	
	
	public static void yazln(Integer gelen) {
		System.out.println(gelen); 
	}	
	
	public static void yaz(Integer gelen) {
		System.out.print(gelen); 
	}
	
	public static void yaz(Double gelen) {
		System.out.print(gelen); 
	}	
	
	public static void yaz(int s1, int s2) {
		yaz("Sayıların toplamı : "+ (s1+s2)); 
	}
	
	public static int okuint()	{
		@SuppressWarnings("resource")
		Scanner okuyucu=new Scanner(System.in);
		return okuyucu.nextInt();
	}
	
	public static String oku()	{
		@SuppressWarnings("resource")
		Scanner okuyucu=new Scanner(System.in);
		return okuyucu.next(); 
	}
	
	public static int topla(int s1,int s2) {
		return s1+s2;
	}	
	
	public static int cıkar(int s1,int s2) {
		return s1-s2;
	}	
	
	public static int carp(int s1,int s2) {
		return s1*s2;
	}	
	
	public static int bol(int s1,int s2) {
		return s1/s2;
	}	
	
	public static int faktoriyel(int sayi) {
	    int num = 1;
	    yazln(num);
	    for (int i = 2; i <= sayi; i++) {	
	    	num = num * i;
	    	yazln(num);
	    }
	    return num;
	}	
	
	
	public static void main(String[] args) {	
	
		// HM 2 FAKTORIYEL		
			
		yazln("Faktörüyeli alınacak sayıyı giriniz: ");
		int sayi=okuint();
		faktoriyel(sayi);
	
	}
}
