package _20010310016_HasanAltin_Soru6;

import java.util.Scanner;

public class _20010310016_HasanAltin_Soru6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayýyý girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("Ýkinci sayýyý girin: ");
        int sayi2 = scanner.nextInt();

        int carpim = 0;
        int sayac = 0;

        while (sayac < sayi2) {
            carpim += sayi1;
            sayac++;
        }

        System.out.println(sayi1 + " * " + sayi2 + " = " + carpim);

	}

}
