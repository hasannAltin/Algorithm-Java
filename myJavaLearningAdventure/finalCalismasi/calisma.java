package finalcalismasi;

import java.util.Scanner;

public class calisma {
	/*1 den 1000 e kadar olan say�lardan asal olanlar� yazd�ran proje
	public static boolean asalMi(int sayi) {
		for(int i = 2 ; i < sayi ; i++) {
			
			if (sayi % i == 0) {
				return false;
			}
			
		}
		return true ;
		
	}

	public static void main(String[] args) {
		
		for (int i = 2 ; i < 100 ; i++) {
			
			if (asalMi(i)) {
				System.out.println(i);
			}
		}

	
	
	
	}*/
/*----------------------------------------------------------------------*/	
	/*kullan�c�dan al�nan iki say�n�n ebobunu bulma
	public static int ebobBulma(int sayi1,int sayi2) {
		
		int ebob = 1;
		
		for (int i = 1 ;i<=sayi1 && i <= sayi2; i++) {
			if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
				
				ebob = i ;
			}
			
		}
		return ebob;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci Say� : ");
		int birinci_sayi = scanner.nextInt();
		
		System.out.print("�kinci Say� : ");
		int ikinci_sayi = scanner.nextInt();
		
		System.out.println("�kinci Say�n�n Ebobu : " + ebobBulma(birinci_sayi, ikinci_sayi));*/
		
/*private static Scanner scanner;
	/*------------------------------------------------------------------------*/		
	/*public static void main(String[] args) {
		String islemler = "1. Toplama i�lemi\n"
				+"2. ��karma i�lemi\n"
				+"3. �arma ��lemi\n"
				+"4. B�lme ��lemi\n"
				+"��k�� i�in q ya bas�n�z";
		System.out.println("------------------------------------------");
		System.out.println(islemler);
		System.out.println("------------------------------------------");
		
		while(true) {
			System.out.print("i�lemi se�in: ");
			scanner = null;
			String islem = scanner.nextLine();
			
			if(islem.equals("1")) {
				System.out.println("programdan ��k�l�yor...");
				break;
			}
			else if (islem.equals("1")) {
				System.out.println("Ka� de�er toplayacaks�n�z (2,3): ");
				
				int kacsayi = scanner.nextInt();
				
				if (kacsayi == 2 ) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("Girilen sayilerin toplam� :" + (toplama(a,b)));
				}
				else if (kacsayi ==3) {
					
				}
				else {
					System.out.println("bunun i�in uygun metod bulunmuyor ...");
					
					
				}
			}		
		}
		
	}
	public static int cikarma(int a,int b) {
		return ( a-b );
		
	}
	public static double bolme(int a,int b) {
		return ((double)a/b);
		
	}
	public static int toplama(int a,int b) {
		return (a+b);
	}
	public static int toplama(int a,int b,int c) {
		return (a+b+c);
		
		
	}
	public static int carpma(int a,int b) { 
		return (a*b);
	}
	public static int carpma(int a,int b,int c) {
		return (a*b*c);
	}*/
	/*public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("sayiyi giriniz: ");
		int sayi = scanner.nextInt();
		System.out.println("Basamak sayisi: ");
		int basamakSayisi = scanner.nextInt();
		
		int geciciSayi = sayi;
		int toplam = 0;
		
		do {
			
		}while(geciciSayi)*/
	/*-----------------------------------------------------------------------*/
	/*static int buyuksayi;
		public static int hesapla(int a,int b) {
			if(a>b) 
			buyuksayi = a;
			
			else if(b>a) 
				buyuksayi = b;
			return buyuksayi;
			

			
		
	}
		public static int hesapla(int a,int b , int c) {
			if(a>b>c) 
			buyuksayi = a;
			
			else if(b>a>c) 
				buyuksayi = b;
			else if(c>b>a)
				buyuksayi = c;
			return buyuksayi;
			
		}
		public static void main(String[] args){
			Scanner input = new Scanner(System.in); 
				int hesapla = input.nextInt();
				System.out.println("b�y�k olan say� :" + hesapla);
			
		}*/
	/*---------------------------------------------------------------------------*/
	/*public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("bir say� girin :");
		int deger = s.nextInt();
		long sonuc=hesapla(deger);
		System.out.print("Sonu� :" + sonuc);
		
		
		
		
	}
	static long hesapla(int a) {
		int carpim = 1;
		for (int i=1; i<=a;i++) {
			carpim*=i;
		}
		return carpim;
	}
*/
	/*static int fibonacci(int x) {
		if (x<=1)
			return x;
		else
			return fibonacci(x-1)+fibonacci(x-2);
		
	}
	public static void main(String[] args) {
		
	}*/

      /*public static void main(String[] args) {
    	int f1=1,f2=1;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Ka� kere istiyorsun:");
    	int input = scanner.nextInt();
    	Fibo(f1,f2,input);
      }
      static void Fibo(int f1, int f2, int input) {
    	  int sayac=0, f3=0;
    	  
    	  for(;sayac<input;sayac++) {
    		  f3=f1+f2;
    		  f1=f2;
    		  f2=f3;
    		  System.out.println("fibonacci f"  + f3);
    	  }
      }*/
	
	/*public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" say� giriniz: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		carpma(a,b,c);
		carpma(a,b);
		carpma2(a,c);
		carpma3(b,c);
		
		
		
		
	}
	public static int carpma(int a,int b) {
		System.out.println("1. ve 2. say�n�n �arp�m�");
		System.out.println(a*b);
	return a*b;}
	public static int carpma(int a,int b,int c){
		System.out.println("���n�n �arp�m� :");
		System.out.println(a*b*c);
		return a*b*c;
		
	}
	public static void carpma2 (int a , int c) {
		System.out.println("1. ve 3. say�n�n �arp�m�:");
		System.out.println(a*c);
		
	}
	public static int carpma3 (int  b , int c) {
		
	System.out.println("2. ve 3. say�n�n �arp�m�:");
	System.out.println(b*c);
	return b*c;
	}*/
	/*------------------------------------------------------------------------*/
	/*
	public static void main(String[] args) {
		
		int [] sayilar = {5,55,1,5,8};
		diziElemanYazdir(sayilar);
	}
	public static void diziElemanYazdir(int [] s) {
		for (int i=0;i< s.length;i++) {
			System.out.println(s[i]);
		}
	}
	public static int [] diziEleman�() {
		Scanner sc=new Scanner(System.in);
		int diziboyut;
		System.out.println("ka� elemanl� dizi gireceksiniz :");
		diziboyut=sc.nextInt();
		int [] sayilar = new int [diziboyut];
		for(int i=0;i<sayilar.length;i++) {
			
		}
		

	
	}*/
	/*---------------------------------------------------------------*/
	/*public static void main(String[] args) {
		int toplam ,max ,min ,x;
		min=max=toplam=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Eleman say�s� :");
		
		x=scanner.nextInt();
		int dizi[]=new int[x];
		for(int i=0;i<dizi.length;i++) {
			System.out.println((i+1)+"......Say�s�n� giriniz:");
			dizi[i]=scanner.nextInt();
			toplam+=dizi[i];
			
			
		}
		int ort=toplam;
		for(int s=0 ;s<dizi.length;s++) {
			if(dizi[s]>max)
				max=dizi[s];
		}
		min=dizi[0];
		for(int a=0;a<dizi.length;a++)
		{
			if(min>dizi[a])
				min=dizi[a];
		}
		int tut=0;
		for(int k=0;k<dizi.length-1;k++) {
			for(int y=0;y<dizi.length-1;y++) {
				if(dizi[y]>dizi[y+1]) {
					tut=dizi[y];
					dizi[y]=dizi[y+1];
							dizi[y+1]=tut;
				}
				
			}
		}
		System.out.println("Dizinin elemanlar�n�n toplam�:" +toplam);
		System.out.println("Dizinin elemanlar�n�n ortalamas�:" +ort);
		System.out.println("Dizinin elemanlar�n�n max:" + max);
		System.out.println("Dizinin elemanlar�n�n min:"+min);
		
		for(int b=0;b<dizi.length;b++) {
			System.out.println((b+1)+"eleman�n de�eri"+dizi[b]);
		}

	}*/
	
	
	
}


