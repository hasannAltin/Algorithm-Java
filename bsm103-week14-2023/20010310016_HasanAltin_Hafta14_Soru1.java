
public class Soru1 {

	public static long faktoriyelHesapla(int n) {
        if (n < 0) {
           
            throw new negatif("Negatif sayıların faktöriyeli tanımsızdır.");
        } else if (n == 0 || n == 1) {
            
            return 1;
        } else {
           
            return n * faktoriyelHesapla(n - 1);
        }
    }
}
