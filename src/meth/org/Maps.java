package meth.org;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap hm = new HashMap();
    hm.put(10, "Java");
    hm.put(20, "Sql");
    hm.put(30, "Selenium");
    hm.put(40, "Selenium");
    hm.put(30, "OOps");
    System.out.println(hm);
    Set  s = hm.keySet();
    System.out.println("Key Values : " + s);
    System.out.println();
    Collection C = hm.values();
   System.out.println("Values are  : " + C);
    Set<Entry> s1 = hm.entrySet();
    System.out.println("Entryset values : " + s1);
    for(Entry entry:s1) {
    	System.out.println(entry);
    }
     LinkedHashMap hm1 = new LinkedHashMap();
     hm1.put(10, 5);
     hm1.put(20, 2);
     hm1.put(30, 6);
     hm1.put(40, 7);
     hm1.put(30, 1);
     System.out.println();
     System.out.println("LINKEDHASHMAP");
	System.out.println(hm1);	
	 Set s2=  hm1.keySet();
	 System.out.println("Key Values : " + s2);
	 
	}
	
	
	}
    
