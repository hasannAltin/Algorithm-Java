package _20010310016_HasanAltin_Soru3;

import java.util.Scanner;

public class _20010310016_HasanAltin_Soru3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyelini hesaplamak istediðiniz sayýyý girin: ");
        int sayi = scanner.nextInt();

        long faktoriyel = 1;
        int sayac = 1;

        while (sayac <= sayi) {
            faktoriyel *= sayac;
            sayac++;
        }

        System.out.println(sayi + "! = " + faktoriyel);

        scanner.close();
    

	}

}
