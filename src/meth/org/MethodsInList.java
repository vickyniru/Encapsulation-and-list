package meth.org;

import java.util.ArrayList;

import java.util.List;
import java.util.TreeSet;
import java.util.LinkedHashSet;


import java.util.List;

public class MethodsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> m  = new ArrayList<Integer>();
      m.add(100);
      m.add(104);
      m.add(8105);
      m.add(910);
      m.add(103);
      m.add(100);
      m.add(100);
      m.add(310);
    
     // m.add("Akshu");
     // m.add("Mirudhu");

      
      System.out.println(m);
      System.out.println(m.size());
      System.out.println(m.indexOf(910));
      System.out.println(m.indexOf(100));
      System.out.println(m.lastIndexOf(100));
      System.out.println(m.get(5));
      System.out.println(m.get(3));
      System.out.println(m.contains(9100));
      System.out.println(m.isEmpty());
      
      
    //  for(String x: m) {
    	// System.out.println(x); 
      List<String> l1 = new ArrayList<String>();
      l1.add("10");
      l1.add("20");
      l1.add("30");
      l1.add("40");
      l1.add("100");
    
      for(String x:l1) {
    	  System.out.println(x);
      }
      System.out.println(l1);
      List<String> l3 = new ArrayList<String>();
      l3.add("10");
      l3.add("20");
      l3.add("705");
      l3.toArray();
      System.out.println(l3);
     
      l1.remove(3);
      l1.addAll(l3);
       System.out.println(l1);
      
     //  System.out.println(l1);
     l1.retainAll(l3);
     System.out.println(l1);
     l3.add(3, "45");
     System.out.println(l3);
   // l1.addAll(l3);
    // System.out.println(l1);
     l3.set(2, "mt");
     System.out.println(l3);
    
    		 
      }
  
  
	
   
    
  
    
    
}
