package com.example.java8;

import java.util.ArrayList;
import java.util.List;

public class CountItems {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();
		for (int i = 0; i < 100000L; i++) {
			strings.add("Item" + i);
		}
		long count = strings.stream().parallel().count();
		System.out.println("Count : "  + count);
	}

}
