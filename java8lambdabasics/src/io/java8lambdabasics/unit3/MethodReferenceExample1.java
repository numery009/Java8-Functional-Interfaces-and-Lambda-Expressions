package io.java8lambdabasics.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		// Thread t =new Thread(()-> printMessage());

		// "Thread t =new Thread(MethodReferenceExample1::printMessage); " and "Thread t
		// =new Thread(()-> printMessage());" are same.

		Thread t = new Thread(MethodReferenceExample1::printMessage); // Method Reference -- ()-> method()

		t.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}

}
