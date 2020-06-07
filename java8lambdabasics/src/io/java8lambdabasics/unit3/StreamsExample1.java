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
		
		
		// Following are the samples of Stream API with Lambda Expression
		
		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);

		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		System.out.println("-----------------------------");

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		// demonstration of filter method
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("-----------------------------");

		// demonstration of sorted method
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);

		System.out.println("-----------------------------");

		// create a list of integers
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

		// collect method returns a set
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println("List to Set -- " + squareSet);

		System.out.println("-----------------------------");

		// demonstration of forEach method
		number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		System.out.println("-----------------------------");

		// demonstration of reduce method
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

		System.out.println(even);

		System.out.println("-----------------------------");
		
		
	}
}
