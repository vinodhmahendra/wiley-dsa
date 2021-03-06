package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.example.java8.model.Person;

public class ArrayToStream {
	public static void main(String[] args) {

			Person[] people = {
				new Person("Joe", 48),
				new Person("Mary",30),
				new Person("Mike", 78)
			};
		
			
//			Stream<Person> stream = Stream.of(people);
			Stream<Person> stream = Arrays.stream(people);
//			stream.forEach(p -> System.out.println(p.getPersonInfo()));
			
//			stream.flatMap(s -> Stream.of))
			
			List<String> list = Arrays.asList("vinodh","kumar","mahendra","bhavya");
			
			list.stream().flatMap(s -> Stream.of(s.charAt(2))).forEach(System.out::println);
	}
}
