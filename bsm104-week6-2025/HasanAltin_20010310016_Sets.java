package s2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasanAltin_20010310016_Sets {

	public static void main(String[] args) { 
		Set<String> sehirler = new HashSet<String>(); 
		sehirler.add("Bartın"); 
		sehirler.add("Ankara"); 
		sehirler.add("İstanbul"); 
		sehirler.add("Malatya"); 
		sehirler.add("Bartın"); 
		sehirler.add("Adana"); 
		sehirler.add("Trabzon"); 
		System.out.println(sehirler.toString()); 
		System.out.println(sehirler.contains("Ankara")); 
		System.out.println(sehirler.contains("Aydın")); 
		System.out.println(sehirler.size()); 
		Set<String> sehirler2 = new TreeSet<String>(); 
		sehirler2.add("Zonguldak"); 
		sehirler2.add("Yalova"); 
		sehirler2.add("Aydın"); 
		System.out.println(sehirler2); 
		for (String sehir : sehirler) { System.out.println(sehir); } 
		for (String sehir2 :sehirler2) { System.out.println(sehir2); 
		} 
		}
}
