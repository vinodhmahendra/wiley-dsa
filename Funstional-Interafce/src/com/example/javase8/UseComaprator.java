package com.example.javase8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComaprator {
	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
		
//		Collections.sort(strings);
		
		
	//	Collections.sort(strings,Collections.reverseOrder());
		Comparator<String> comp = (x,y)->{
			return x.compareToIgnoreCase(y);
		};
		
		Collections.sort(strings,comp);
		for (String string : strings) {
			System.out.println(string);
		}
		
	}

}
