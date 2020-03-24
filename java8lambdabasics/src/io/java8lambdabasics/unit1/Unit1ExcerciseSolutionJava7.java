package io.java8lambdabasics.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.java8lambdabasics.common.Person;

public class Unit1ExcerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Numery", "Zaber", 35), new Person("AM", "ALZaber", 65),
				new Person("Anika", "Omer", 25), new Person("Ferdowshi", "Begum", 55));

		// Step 1: Sort list by the last name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons.");
		printAll(people);

		// Step 3: Create a method that prints all people that have last name beginning
		// with Z

		System.out.println("Printing all persons with Last name beginning with Z");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("Z");
			}
		});

		System.out.println("Printing all persons with First name beginning with A");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("A");
			}
		});

	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

}

interface Condition {
	boolean test(Person p);
}