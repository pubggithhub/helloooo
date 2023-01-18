package org.sdnb;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Block1 {


	public static void main(String[] args) {
		// create map 
		
		Map<Integer,String>mp=new LinkedHashMap <Integer,String>();
		
		// add value in map 
		mp.put(10, "java");
		mp.put(30, "sql");
		mp.put(40, "oracle");
		mp.put(20, "python");
		mp.put(50, "sql");
		mp.put(10, "selenium");
		
		System.out.println(mp);
		
		// size [number of key and value pair ]of map
		
		int si=mp.size();
		System.out.println(si);
		
		//check whether key is present in map or not 
		boolean c=mp.containsKey(20);
		System.out.println(c);
		
		// check whether value present in map  or not 
		 boolean v =mp.containsValue("java");
		 System.out.println(v);
		 
		 //fetch value of  particular  key 
		  String g =mp.get(40);
		  System.out.println(g);
		  
		  // print all key from map 
		  
		  System.out.println("print all key");
		  Set<Integer>ke =mp.keySet();
		  System.out.println(ke);
		  System.out.println("iterate key");
		 

		  for(Integer x:ke) {
			  System.out.println(x);
		  
		
		  }
		
		
	// print all values from map
		  
		  System.out.println("print all value");
		  Collection <String> va = mp. values();
		  
		System.out.println(va);
		System.out.println("iterate value");
		for (String y :va) {
			System.out.println(y);
			
			
			
			}

		
	}
		

	
	
}
	





