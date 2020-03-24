package io.java8lambdabasics.unit3;

import java.util.Arrays;
import java.util.List;

import io.java8lambdabasics.common.Person;

public class CollectionIterationExample {

	public static void main(String args[]) {
		List<Person> people = Arrays.asList(new Person("Numery", "Zaber", 35), new Person("AM", "ALZaber", 65),
				new Person("Anika", "Omer", 25), new Person("Ferdowshi", "Begum", 55));
		
		System.out.println("Use for loop");
		
		for(int i=0; i<people.size(); i++) {             // This is external iteration
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in loop");       // This is external iteration
		for(Person p: people){
			System.out.println(p);
		}
		
		System.out.println("Using lambda for each loop");       // This is internal iteration		
		people.forEach(p->System.out.println(p));
		
		System.out.println("Using lambda for each loop using method reference");   // This is internal iteration
		people.forEach(System.out::println);
	}
}
