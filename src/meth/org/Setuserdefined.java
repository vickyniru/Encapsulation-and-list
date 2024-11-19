package meth.org;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Setuserdefined {
	public static void main(String[] args) {
		Userdefined us = new Userdefined();
		us.setId(1);
		us.setName("Niranjana");
		us.setGend("F");
	    us.setDob(181080);
	    us.setMail("vk@gmail.com");
	    us.setPhnnum(04657);
	    us.setDoj(120524);
	    us.setSal(4563782);
	    System.out.println("Name:" + us.getName());
	    System.out.println("Id:" + us.getId());
	    System.out.println("Gender:" + us.getGend());
	    System.out.println("E_Mail:" + us.getMail());
	    System.out.println("Phn_Num:" + us.getPhnnum());
	    
	    
	    Userdefined us1 = new Userdefined();
		us1.setId(2);
		us1.setName("Akshatha");
		us1.setGend("F");
	    us1.setDob(191006);
	    us1.setMail("AV@gmail.com");
	    us1.setPhnnum(784536219);
	    us1.setDoj(031123);
	    us1.setSal(7663782);
	    System.out.println();
	    System.out.println("Name:" + us1.getName());
	    System.out.println("Id:" + us1.getId());
	    System.out.println("Gender:" + us1.getGend());
	    System.out.println("E_Mail:" + us1.getMail());
	    System.out.println("Phn_Num:" + us1.getPhnnum());
	    
	    
	    Userdefined us2 = new Userdefined();
		us2.setId(3);
		us2.setName("Mirudhu");
		us2.setGend("F");
	    us2.setDob(96);
	    us2.setMail("MV@gmail.com");
	    us2.setPhnnum(734521791);
	    us2.setDoj(120524);
	    us2.setSal(8563782);
	  
	    System.out.println();
	    System.out.println("Name:" + us2.getName());
	    System.out.println("Id:" + us2.getId());
	    System.out.println("Gender:" + us2.getGend());
	   System.out.println("E_Mail:" + us2.getMail());
	    System.out.println("Phn_Num:" + us2.getPhnnum());
	    
	    List<Userdefined> l9 = new ArrayList<Userdefined>();
	    l9.add(us);
	    l9.add(us1);
	    l9.add(us2);
	   
	    System.out.println();
	    System.out.println();
	    for (Userdefined x : l9) {
	    	System.out.println("Name : "+ x.getName());
	    	System.out.println("Id :  " + x.getId());
	    	
	    	LinkedHashSet<Userdefined> s2 = new LinkedHashSet<Userdefined> ();
	    	s2.add(us);
	    	s2.add(us2);
	    	s2.add(us1);
	    	
	    	System.out.println();
		    System.out.println();
		    for (Userdefined n : s2) {
		    	System.out.println("Name : "+ n.getName());
		    	System.out.println("Id :  " + n.getId());
		    	System.out.println("Gender : " + n.getGend());
		    	System.out.println("E_mail : " + n.getMail());
		    	System.out.println("Salary : " + n.getSal());
	    }
		    
	    
	}
	}
}
