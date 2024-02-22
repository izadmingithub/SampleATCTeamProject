package dev;

import java.util.LinkedHashSet;
import java.util.Set;
import java.io.*;   
import java.util.*;  

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		    {   
		        Set<Integer> data = new LinkedHashSet<Integer>();   
		        data.add(31);   
		        data.add(21);   
		        data.add(41);   
		        data.add(51);   
		        data.add(11);   
		        data.add(81);   
		        System.out.println("data: " + data);  
		          
		        Iterator newData = (Iterator) data.iterator();  
		        System.out.println("The NewData values are: ");   
		        while (newData.hasNext()) {   
		            System.out.println(newData.next());   
		        }  
		    }   
		}  
	}


