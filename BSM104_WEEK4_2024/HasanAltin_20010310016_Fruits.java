package Ödev;

import java.util.ArrayList;
import java.util.Collections;

public class HasanAltin_20010310016_Fruits {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		System.out.println(list.size());
       list.add("Elma");
       list.add("muz");
       System.out.println(list.toString());
       list.add(0 , "portakal");
       System.out.println(list.toString());
       
       System.out.println(list.contains("Elma"));
       
       System.out.println(list.get(0));
       
       System.out.println(list.get(list.size()- 1));
       
       list.set(0, "Portakal");
       System.out.println(list.toString());
       System.out.println(list.isEmpty());
       
       for(int index=0; index<list.size()-1; index++) {
    	   String str = list.get(index);
    	   System.out.println(str);
       }
       for (String friut : list ) {
    	   System.out.println(friut);
       }
       Collections.sort(list);
       System.out.println(list.toString());
       
       list.clear();
       System.out.println(list.toString());
	}

}
