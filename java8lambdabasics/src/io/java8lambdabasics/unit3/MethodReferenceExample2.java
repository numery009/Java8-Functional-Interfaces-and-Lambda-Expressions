package io.java8lambdabasics.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java8lambdabasics.common.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Numery", "Zaber", 35), new Person("AM", "ALZaber", 65),
				new Person("Anika", "Omer", 25), new Person("Ferdowshi", "Begum", 55));


		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons.");
		//performConditionally(people, p -> true, p -> System.out.println(p));
		performConditionally(people, p -> true, System.out::println);// p-> method(p)
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
