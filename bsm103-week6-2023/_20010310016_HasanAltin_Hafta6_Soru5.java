package _20010310016_HasanAltin_Soru5;

import java.util.Scanner;

public class _20010310016_HasanAltin_Soru5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Çarpým tablosu için bir üst sýnýr girin: ");
	        int ustSinir = scanner.nextInt();

	        int i = 1;

	        while (i <= ustSinir) {
	            int j = 1;

	            while (j <= ustSinir) {
	                System.out.print(i * j + "\t");
	                j++;
	            }

	            System.out.println();
	            i++;
	        }
	}

}
