import java.util.Scanner;

public class fourthfunction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir Kelime Giriniz: ");
		String kelime = sc.nextLine();
		
		System.out.println("Girilen Kelime: "+kelime);
		System.out.println("Kelimenin Tersten Yazilmis Hali= "+tersten(kelime));
		}
		public static String tersten(String kelime) {
			String ters = "";
			for(int i=kelime.length(); i>0;i--) {
				ters += kelime.substring(i-1,i);
			}
			return ters;
		}
	
}
