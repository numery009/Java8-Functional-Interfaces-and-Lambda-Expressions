package io.java8lambdabasics.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java8lambdabasics.common.Person;

public class StandardFunctionInterfaceExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Numery", "Zaber", 35), new Person("AM", "ALZaber", 65),
				new Person("Anika", "Omer", 25), new Person("Ferdowshi", "Begum", 55));

		// Step 1: Sort list by the last name

		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons.");
		performConditionally(people, p -> true, p -> System.out.println(p));

		// Step 3: Create a method that prints all people that have last name beginning
		// with Z

		System.out.println("Printing all persons with Last name beginning with Z");
		performConditionally(people, (p) -> p.getLastName().startsWith("Z"), p -> System.out.println(p));

		System.out.println("Printing all persons with First name beginning with A");
		performConditionally(people, (p) -> p.getFirstName().startsWith("A"), p -> System.out.println(p));

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
