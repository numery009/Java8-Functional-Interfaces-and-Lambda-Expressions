package io.java8lambdabasics.unit1;

public class TypeInferenceExample {

	public static void main(String[] args) {		
		
		// 1) With paramaeter type 
		// StingLengthLambda myLambda= (String s)-> s.length();
		
		// 2) With out paramaeter type 
		// StingLengthLambda myLambda= (s)-> s.length();
		
		// 3) For one argument remove paranthasys 		
		StingLengthLambda myLambda= s-> s.length();
		
		System.out.println(myLambda.getLength("Hello Lambda"));
		
		// The example of Type inference
		printLambda(s->s.length());
				
		
	}
	
	public static void printLambda(StingLengthLambda l) {
		System.out.println(l.getLength("Hello Lambda"));
	}
	
	
	interface StingLengthLambda{
		int getLength(String s);
	}

}
