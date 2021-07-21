package com.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

import com.example.java8.model.Person;

public class SumAndAverage {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike",73));
		
		
		
		int sum = people.stream().mapToInt(p->p.getAge()).sum();
		
		System.out.println("Total of ages " + sum);
		
		OptionalDouble average = people.stream().mapToDouble(p->p.getAge()).average();
		
		if ( average.isPresent()) {
			System.out.println("Average : " + average.getAsDouble());
		}else {
			System.out.println("Average is not calculated");
		}
		
	}


}
