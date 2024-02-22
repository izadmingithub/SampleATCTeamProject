package dev;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetAddALL {

	public static void main(String[] args) {
		Set<Integer> data =new LinkedHashSet<Integer>();
		data.add(12);
		data.add(13);
		data.add(14);
		data.add(15);
		
		System.out.println(data);
		
		ArrayList<Integer> data2 = new ArrayList<Integer>();
		data2.add(91);
		data2.add(21);
		data2.add(41);
		data.addAll(data2);
		System.out.println(data);
		}

	}

