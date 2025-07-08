
public class Soru2 {
	 public static double ortalamaHesapla(int[] dizi) {
	        if (dizi == null || dizi.length == 0) {
	         
	            return -1;
	        }

	        int enBuyuk = dizi[0];
	        int enKucuk = dizi[0];

	       
	        for (int i = 1; i < dizi.length; i++) {
	            if (dizi[i] > enBuyuk) {
	                enBuyuk = dizi[i];
	            } else if (dizi[i] < enKucuk) {
	                enKucuk = dizi[i];
	            }
	        }

	        
	        double ortalama = (enBuyuk + enKucuk) / 2.0;
	        return ortalama;
	    }
}
