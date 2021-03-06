package com.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.example.java8.model.Person;

public class SequentialStream {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike",73));
		
		Predicate<Person> predicate = (p) -> p.getAge() > 65;
		
		displayPerson(people,predicate);

	}

	private static void displayPerson(List<Person> people, Predicate<Person> predicate) {
		people.stream().filter(predicate).forEach(p -> System.out.println(p.getPersonInfo()));
	}

}
