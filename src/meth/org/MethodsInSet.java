package meth.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;


public class MethodsInSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s = new HashSet<Integer> ();
		s.add(10);
		s.add(70);
		s.add(140);
		s.add(10);
		s.add(100);
		System.out.println(s);
		//s.removeAll(s);
		//System.out.println(s);
		HashSet<Integer> s5 = new HashSet<Integer> ();
     s5.add(10);
     s5.add(19);
     s5.add(100);
     s5.add(70);
     s5.contains(s);
     System.out.println(s5);
     
		
		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer> ();
		s1.add(118);
		s1.add(186);
		s1.add(181);
		s1.add(158);
		s1.add(198);
		s1.add(148);
		System.out.println(s1);
		s1.removeAll(s1);
		System.out.println(s1);
        TreeSet<Integer> s2 = new TreeSet<Integer> ();
        s2.add(571);
        s2.add(25);
        s2.add(565);
        s2.add(56);
        System.out.println(s2);
        
        List<Integer>l1= new ArrayList<Integer>();
        l1.add(5);
        l1.add(5);
        l1.add(5);
        System.out.println(l1);
        HashSet<Integer> s3 = new HashSet<Integer>();
        s3.addAll(l1);
        System.out.println(s3);
        
        LinkedHashSet n = new LinkedHashSet();

        
		
	}

}
