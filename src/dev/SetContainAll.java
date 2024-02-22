package dev;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetContainAll {

	public static void main(String[] args) {
		
		Set<Integer> data = new LinkedHashSet<Integer>();
		data.add(12);
		data.add(22);
		data.add(34);
		data.add(54);
		
		System.out.println("data"+data);
		
		Set<Integer> data2 = new LinkedHashSet<Integer>();
		data2.add(91);
		data2.add(98);
		data2.add(100);
		
		//data.addAll(data2);
		//System.out.println("data :" +data);
		System.out.println("data containAll : " +data.containsAll(data2));
		System.out.println("\nDoes data contains newData?: "+ data.containsAll(data2));
		

	}

}
