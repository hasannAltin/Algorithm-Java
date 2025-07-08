import java.util.Scanner; 
public class Sinav {

	public static void main(String[] args) {
		//---------------------------------------------------------
		/*Scanner input = new Scanner (System.in);
		int n , m; //n int bir sayý olmalý
		System.out.println("Ilk Sayiyi Gir : ");
		n = input.nextInt();// kullanýcýdan n deðeri alýnýr
		System.out.println("Ikinci Sayiyi Gir: ");
		m = input.nextInt();
		
		System.out.println("Sayilar : "+n+" "+m);*/

		
		
		//-----------------------------------------------------
		
		
		/*int GirilenSayi1 , GirilenSayi2;
		System.out.println("Dolar Þu An Kaç TL: ");
		GirilenSayi2 = input.nextInt();
		
		System.out.println("Dolar Dün Kaç TL'ydi: ");
		GirilenSayi1 = input.nextInt();
		
		if (GirilenSayi2>GirilenSayi1)
		    System.out.println("Dolar yükseldi");
		else 
			if (GirilenSayi2<GirilenSayi1)
				System.out.println("Dolar düþtü");
			else
			   System.out.println("dolar deðiþmedi");*/
			
		
		//------------------------------------------------		
			
		  
		/*String metin = "Hasan Altýn";
		char karakter = 'a';
		int tane = 0;
		
		for(int i = 0; i < metin.length(); i++) {
			if(karakter == metin.charAt(i)) {
				++tane;
			}
		}
		System.out.println( karakter+" yazý içinde "+ +tane+ " tane var.");*/
		
		//-----------------------------------------------
		/*Scanner imput = new Scanner(System.in);
		int n = imput.nextInt();
		
		while(n<7) {
		System.out.println(n);
		n = n+1;*/
		//-----------------------------------------------
	/*	Scanner input =new Scanner(System.in);
		System.out.println("Ýlk sayý: ");
		int x = input.nextInt();
		System.out.println("Ýkinci sayý: ");
		int y = input.nextInt();
		int sonuç =1;
		int i = 1;
		while(i<=y) {
			sonuç = sonuç*x;
			i = i+1;
		}
		System.out.println("Sonuç:" +sonuç);
		

		*/
		//-------------------------------------------------------
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int sonuç = 0;
		int y = 1;
		while(y<=100) {
			if(x%y == 0) {
				System.out.println(y);
				sonuç = sonuç +y;
			}
			y++;
			
		}
		
		if(x == sonuç-x)
			System.out.println("mükemmel sayýdýr");
		
		else
			System.out.println("mükemmel sayý deðildir");
		
		
		/*
		double x;
		int b = 1;
		for (int a = 1;a<=10;a++) {
			if(a*x+b == 0)
				System.out.println(x);*/
		
		
		
		
				
		
		}		
		
		
		
		
	}


