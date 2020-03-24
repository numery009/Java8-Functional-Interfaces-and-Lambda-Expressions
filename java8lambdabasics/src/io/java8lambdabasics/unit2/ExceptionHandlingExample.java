package io.java8lambdabasics.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;

		/*
		 * process(someNumbers, key, (x, y) -> { try { System.out.println(x / y); }
		 * catch (Exception ex) { System.out.println("An exception happened."); } });
		 */
		process(someNumbers, key, wrapperLambda((x, y) -> System.out.println(x / y)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (a,b)-> {
			//System.out.println("Executing from wrapper");
			try {
			consumer.accept(a, b);
			}
			catch (ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda.");
			}
		};
	}
}
