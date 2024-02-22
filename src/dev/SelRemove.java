package dev;

import java.util.LinkedHashSet;
import java.util.Set;

public class SelRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Set<Integer> data = new LinkedHashSet<Integer>();   
	        data.add(31);   
	        data.add(21);   
	        data.add(41);   
	        data.add(51);   
	        data.add(11);   
	        data.add(81);   
	        System.out.println("data: " + data); 
	       //System.out.println(" set empty : " +data.isEmpty());
	        
	        // remove all and remove method
	        
	      // data.remove(41);
	        //data.remove(21);
	        //System.out.println(" print all remainning  data :"+ data);
	        
	       Set<Integer> data2 = new LinkedHashSet<Integer>();
	       data2.add(11);
	       data2.add(81);
	       
	       System.out.println("data :" +data2);
	       data.removeAll(data2);
	       System.out.println(data);
	       
	        
	    
	       
	        
	}

}