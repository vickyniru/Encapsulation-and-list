package meth.org;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Count {
	
	public static void main(String[] args) {
		Count c = new Count();
		c.words();
		c.character();
			
	}
		
	public void words(){
		
		String name = "Welcome to java sql java to java sqlplsql";
		String[] x = name.split(" ");

		Map<String, Integer>emp = new LinkedHashMap<>();
				for (String v : x) {
			if (emp.containsKey(v)) {
				int count = emp.get(v);
				emp.put(v, count + 1);
			} else {
				emp.put(v, 1);
			}

			
		}
		System.out.println(emp);
	}
		
		public void character() {
			String name1 = "Rajarajeswari";
			Map<Character, Integer>st = new HashMap<>();
			System.out.println(st);
			char[] ch = name1.toCharArray();
			System.out.println(ch);
			for(char m:ch) {
				if(st.containsKey(m))
				{
					st.put(m,st.get(m) +1);
				}
					else
					{
						st.put(m, 1);
					}
				}
			System.out.println("count of character in the String" + st);
			Set<Map.Entry<Character,Integer>> s1 = st.entrySet();
		    System.out.println("Entryset values : " + st);
		    for(Map.Entry<Character, Integer> entry:s1) {
		    	//System.out.println(entry);
		 if(entry.getValue()>1) {
			 System.out.println(entry.getKey() + " " + entry.getValue());
		    	}
		    }
			}
			
			
			}
			
		
	




