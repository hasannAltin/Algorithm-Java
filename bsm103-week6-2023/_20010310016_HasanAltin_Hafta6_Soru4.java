package _20010310016_HasanAltin_Soru4;

import java.util.Scanner;

public class _20010310016_HasanAltin_Soru4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayý girin: ");
        int sayi = scanner.nextInt();

        int basamakSayisi = 0;

        sayi = Math.abs(sayi);

        while (sayi > 0) {
            sayi /= 10;
            basamakSayisi++;
        }

        System.out.println("Girilen sayý " + basamakSayisi + " basamaklýdýr.");

        
	}

}
