package meth.org;

import java.util.ArrayList;

import java.util.List;
import java.util.TreeSet;
import java.util.LinkedHashSet;



public class RestMethodsinList {


		

	List <Integer> t = new ArrayList<Integer>();
	{ 
    t.add(2);
    t.add(11);
    t.add(111);
    t.add(56);
    t.add(1);
    t.add(2);
  
   //
    System.out.println(t);
    
    LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer> (t);
    {
    System.out.println("After removing duplicates ->" + s1);
    System.out.println(t.subList(2, 4));
    ArrayList<Integer> s = new ArrayList<Integer>();
    s.add(25);
    s.add(63);
    s.add(73);
   
    t.addAll(s);
    System.out.println(t);
    //t.removeAll(s);
    System.out.println(t.retainAll(s));
    System.out.println(t);
    
   // List m = new ArrayList();

	}		

}
}