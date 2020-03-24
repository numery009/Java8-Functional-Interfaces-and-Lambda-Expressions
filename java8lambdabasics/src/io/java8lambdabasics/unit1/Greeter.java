package io.java8lambdabasics.unit1;

public class Greeter {

	public void greet(Greeting greeting){
		greeting.perform();		
	}
	
	public static void main(String[] args) {
		
		Greeter greeter =new Greeter();
		//HelloWorldGreeting helloWorldGreeting =new HelloWorldGreeting();
		
		
		// OOP concept. We are creating a class for implement the interface
		Greeting helloWorldGreeting =new HelloWorldGreeting();
		
		// Lamda expression function by calling the interface to implement method
		Greeting lambdaFunction= ()-> System.out.println("Hello world!");
		
		
		
		helloWorldGreeting.perform();
		lambdaFunction.perform();
		
		/// Passing a behaviour to greet method
		// Classic object oriented programming
		//greeter.greet(helloWorldGreeting);
		
		
		// Way to Declare the Lambda as interface
		// MyLambda myLambdaFunction= ()-> System.out.println("Hello world!");
		
		// Way to Declare the Lambda as interface
		// MyAdd addFunction= (int a, int b)-> a+b;
		
		
		
	}

}

interface MyLambda{
	void foo();
	
}

interface MyAdd{
	int foo (int a, int b);
}