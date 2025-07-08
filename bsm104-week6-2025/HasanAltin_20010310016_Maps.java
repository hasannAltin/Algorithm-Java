package s2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HasanAltin_20010310016_Maps {

	public static void main(String[] args) {
		Map<String, String> danismanlar = new HashMap<String, String>();
		danismanlar.put("Evrim G", "Algoritma");
		System.out.println(danismanlar.size());
		System.out.println(danismanlar.toString());
		danismanlar.put("Furkan A", "Alg. Uyg.");
		danismanlar.put("Evrim G", "Algoritma2");
		System.out.println(danismanlar.toString());
		System.out.println(" -----");
		Map<String, Set<String>> danismanlar2 = new TreeMap<String, Set<String>>();
		danismanlar2.put("Evrim G", new TreeSet<String>());
		danismanlar2.get("Evrim G").add("Algoritma");
		danismanlar2.get("Evrim G").add("Algoritma2");
		Set<String> ders = new HashSet<String>();
		ders.add("Algoritma");
		danismanlar2.put("Furkan A", ders);
		danismanlar2.get("Furkan A").add("Alg. Uyg.1");
		danismanlar2.get("Furkan A").add("Alg. Uyg.2");
		System.out.println(danismanlar2.toString());
		for (String danisman : danismanlar.keySet()) {
			System.out.println("danisman:" + danisman);
		}
		for (String dersismi : danismanlar.values()) {
			System.out.println("value:" + dersismi);
		}
	}
}
