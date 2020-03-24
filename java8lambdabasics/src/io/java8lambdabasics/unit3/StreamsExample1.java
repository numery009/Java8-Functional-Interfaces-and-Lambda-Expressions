package io.java8lambdabasics.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import io.java8lambdabasics.common.Person;

public class StreamsExample1 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Numery", "Zaber", 35), new Person("AM", "ALZaber", 65),
				new Person("Anika", "Omer", 25), new Person("Ferdowshi", "Begum", 55));

		people.stream().filter(p -> p.getFirstName().startsWith("A"))
				.forEach(p -> System.out.println(p.getFirstName()));

		Stream<Person> stream = people.stream();
		
		long count=people.stream().filter(p -> p.getFirstName().startsWith("A")).count();
		System.out.println(count);

		long total=people.parallelStream().filter(p -> p.getFirstName().startsWith("A")).count();
		System.out.println(total);
	}
}
