package dev;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetContains {

	public static void main(String[] args) {
		Set<Integer> data = new LinkedHashSet<Integer>();
		data.add(12);
		data.add(21);
		data.add(34);
		data.add(40);
		
		System.out.println("data:"+data);
		System.out.println("contain 21? :" + data.contains(21));
		System.out.println("contain 5 ? : " + data.contains(91));

	}

}
