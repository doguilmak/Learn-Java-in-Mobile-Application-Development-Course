
public class Programme {

	public static void main(String[] args) {
		
		class cember {
			
			public static double cevre_hesapla(int r) {
				return 2 * Math.PI * r;
			}
				
			public static double alan_hesapla(int r) {
			        return Math.PI * Math.pow(r, 2);
			}
				
			public static double hacim_hesapla(int r) {
				return 4/3 * Math.PI * Math.pow(r, 3);
			}
				
			public double y_alan_hesapla(int r) {
				return 4 * Math.PI * Math.pow(r, 2);
			}
			
		}
		
		int r=3;
		double cevre=0, alan=0, hacim=0, y_alan=0;
				
		cevre = cember.cevre_hesapla(r);
		alan = cember.alan_hesapla(r); 
		hacim = cember.hacim_hesapla(r); 
		
		cember cm = new cember();
		y_alan=cm.y_alan_hesapla(r);
		
		System.out.println("Cevre: " + cevre);
		System.out.println("Alan: " + alan);
		System.out.println("Hacim: " + hacim);
		System.out.println("Yüzey alani: " + y_alan);		
				
	}

}
