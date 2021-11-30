public class Programme {

    public static void main(String[] args) {
    
    	int oyun_hakki = 4;
	    while (true) {   
	    	
	    	int zar1=(int)(Math.random()*6+1);
	        int zar2=(int)(Math.random()*6+1);
	        int toplam = zar1 + zar2;
	        
	        System.out.println("1 Numarali Zar = " + zar1); 
	        System.out.println("2 Numarali Zar = " + zar2);
	        System.out.println("Zar toplami = " + toplam);
	        if (oyun_hakki == 0) {
	        	System.out.println("Hakkınız doldu.");
	        	break;
	        }
	        if (toplam==2 || toplam==3 || toplam==12) {
	            System.out.println("Kaybettin! Sayi: " + toplam);
	            break;
	        } else if(toplam==7 || toplam==11) { 
	            System.out.println("Kazandin! Sayi: " + toplam);
	            break; 
	        }
	        
	        System.out.println("============");	        
	        oyun_hakki--;
	    
	    }
    
    }

}