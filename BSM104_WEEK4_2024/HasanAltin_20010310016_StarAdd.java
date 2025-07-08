package Ödev;

import java.util.ArrayList;

public class HasanAltin_20010310016_StarAdd {

	public static void main(String[] args) {
		
		ArrayList<String> Kelimeler = new ArrayList<String>();
     Kelimeler.add("kalem");
     Kelimeler.add("bilgisayar");
     Kelimeler.add("kitap");
     
     Kelimeler.set(0, Kelimeler.get(0).toUpperCase());
     System.out.println(Kelimeler.toString());
     for (int index = 0; index<Kelimeler.size(); index+=2) {
     Kelimeler.add(index, "*");
     System.out.println(Kelimeler.toString());
	}
     System.out.println(Kelimeler.toString());
     
     for (int index=0; index<Kelimeler.size(); index++){
    	 Kelimeler.remove(index);
     }
     System.out.println(Kelimeler.toString());
     System.out.println(Kelimeler.size());
}
}