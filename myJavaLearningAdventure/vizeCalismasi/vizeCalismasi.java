import java.util.Scanner; 
public class Sinav {

	public static void main(String[] args) {
		//---------------------------------------------------------
		/*Scanner input = new Scanner (System.in);
		int n , m; //n int bir say� olmal�
		System.out.println("Ilk Sayiyi Gir : ");
		n = input.nextInt();// kullan�c�dan n de�eri al�n�r
		System.out.println("Ikinci Sayiyi Gir: ");
		m = input.nextInt();
		
		System.out.println("Sayilar : "+n+" "+m);*/

		
		
		//-----------------------------------------------------
		
		
		/*int GirilenSayi1 , GirilenSayi2;
		System.out.println("Dolar �u An Ka� TL: ");
		GirilenSayi2 = input.nextInt();
		
		System.out.println("Dolar D�n Ka� TL'ydi: ");
		GirilenSayi1 = input.nextInt();
		
		if (GirilenSayi2>GirilenSayi1)
		    System.out.println("Dolar y�kseldi");
		else 
			if (GirilenSayi2<GirilenSayi1)
				System.out.println("Dolar d��t�");
			else
			   System.out.println("dolar de�i�medi");*/
			
		
		//------------------------------------------------		
			
		  
		/*String metin = "Hasan Alt�n";
		char karakter = 'a';
		int tane = 0;
		
		for(int i = 0; i < metin.length(); i++) {
			if(karakter == metin.charAt(i)) {
				++tane;
			}
		}
		System.out.println( karakter+" yaz� i�inde "+ +tane+ " tane var.");*/
		
		//-----------------------------------------------
		/*Scanner imput = new Scanner(System.in);
		int n = imput.nextInt();
		
		while(n<7) {
		System.out.println(n);
		n = n+1;*/
		//-----------------------------------------------
	/*	Scanner input =new Scanner(System.in);
		System.out.println("�lk say�: ");
		int x = input.nextInt();
		System.out.println("�kinci say�: ");
		int y = input.nextInt();
		int sonu� =1;
		int i = 1;
		while(i<=y) {
			sonu� = sonu�*x;
			i = i+1;
		}
		System.out.println("Sonu�:" +sonu�);
		

		*/
		//-------------------------------------------------------
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int sonu� = 0;
		int y = 1;
		while(y<=100) {
			if(x%y == 0) {
				System.out.println(y);
				sonu� = sonu� +y;
			}
			y++;
			
		}
		
		if(x == sonu�-x)
			System.out.println("m�kemmel say�d�r");
		
		else
			System.out.println("m�kemmel say� de�ildir");
		
		
		/*
		double x;
		int b = 1;
		for (int a = 1;a<=10;a++) {
			if(a*x+b == 0)
				System.out.println(x);*/
		
		
		
		
				
		
		}		
		
		
		
		
	}


