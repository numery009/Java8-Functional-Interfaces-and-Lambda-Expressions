# Java8-Functional-Interfaces-and-Lambda-Expressions

## Why Lambdas

  1) Enable Functional Programming: We can use function as an entity that can pass around.
  2) Readable and Concise Code: Anonymous inner clas which is robust. Lambda make it readable and concise.
  3) Easier to Use API's and Libreries : It has the collection API and more libraries to enable the functional programming          model.
  4) Enable Support for Parallel Processing: Collection can go through the parallel stream.
    
##  Code in OOP

  1) Everything is an object.
  2) All code blocks are associated with classes and objects.
  

<table>
   <tr>
      <td>
        OOP
      </td>     
      <td>
        Lambda
      </td>
   <tr>     
   <tr>
      <td>
          Greater Class{
          public void great(---){
          }
        }
      </td>     
      <td>
        public void great(action){
          action();
        }
      </td>
   <tr>
     <tr>
      <td>
         We are passing a class which has a method that has to perform.
      </td>     
      <td>
        we are passing the action and execute it.
      </td>
   <tr>
</table>

## Function as Values in Lambda

  Inline values -> 
  
  String name = "foo";
  double pi = 3.14;
  
    aBlockofCode={
      ......
      ......
    }

    -----------------------------
  
    aBlockofCode=public void perform(){
       system.out.println("Hello World");      
    }
  
  This can possible in Java8 by using Lambda expression. We do not need to access modifier, return type and name of the       method in the Lambda. So, the expression of upper method is ->
  
     aBlockofCode=()-> {
                      System.Out.println("Hello World!");
                        }
  We can assign the lambda expression to a variable. If the body of code is one line then we can remove the curly braces.
  
     1) aBlockofCode=()-> System.Out.println("Hello World!");
     
     
     2) DoubleNumberFunction = (int a) -> a*2;
     3) Addfunction = (int a, in b) -> a+b;
     4) SafeDivideFunction= (int a, int b) ->{
                               if(b==0) return 0;
                               return a/b;
                              }  
     5) StringLenghtCountFunction =(String a) -> a.length();
     
## Lambda as Interface Type 
   We have to use one interface for one method. We can not use multiple method in one interface.
   
   ### Type Interface
      
      Public static void main(String[] args){
        printLambda(s-> s.length());
      }
      
      public static void printLambda(StringLengthLambda l){
        system.Out.println(l.getLength("Hello Lambda"));
      }
      
      interface StringLengthLambda{
        int getLength(String);
      }

## Functional Interface
   In Java8 we can implement method in the interface. If any method has only one abstract method that's call functional        interface. Functional Interface is a type of interface which we can use for Lambda Type. In Java8 we have special type of    marking which is functional interface. That is @FunctionalInterface annotation. @FunctionalInterface is completely          optional. Java compiler does not require it for your Lambda Types. But it is good practice to add it. It convey the          message that how this interface should be use.

## Using Function Interface
   Java.util.Function, which contains some out of box interface like Predicate<T> interface. Which has a method test(T).
   Steps for Lambda -
  
   1st Step: Creating the lambda expression is create a interface for it. 
   
   2nd Step: Define a method on the interface. Which has a some signature for Lambda expression. 
   
   Note: If we find any interface in the package java.util.function which has the same method signature then we do not need    to write new interface we can use that.
   
   Predicate<T>, Consumer<T> these are the Function Interface out of the box.

## Exception Handling in Lambda
   Easiest way to handle the error in Lambda is wrap a lambda with another Lambda function which has try catch.
   
## Closures in Lambda Expression
   
    public class ClosureExample{
      public static void main(string[] args){
        int a=0;
        int b=0;
        doProcess(a, i -> System.Out.println(i+b));  //Frozen value of b will go where the Lambda will go. This is closures.
      }
      public static void doProcess(int i, Process p){
        p.process(i);
      }
    }
    
    interface Process{
      void process(int i);
    }
    // Frozen value of b will go where the Lambda will go. This is called closures.
    
## "This" Reference in Lambda
   "This" reference we cannot use inside the static method. If there is any anonymous inner class inside the static method       then inside the annonymous inner class we can use this reference. This is the classic Java how to use "This" reference       inside the static method. Now if we use the same senario for Java8 Lambda. We have static method, inside that there is a     anonymous inner class. It will give an error if we use "This" reference. Because Lambda treat a different way the           annonymous inner class. For Lambda "This" reference does not reffer the inner class object. It is same like the outside     of Lambda. Lambda does not overwrite the "This" reference.

## Method Reference
   If Lambda expression taking no input agrument and it's executing a method without parameter. So, Lambda expression is        doing method execution. In other case if there some input argument and it passing those parameter in the execution          method. If the parameter match then there is some obvious for it. It has different syntax like-method Reference.
   
    ()-> method  --> ClassName::methodName
    (p)-> methid(p) --> ClassName::methodName

## The Foreach Iteration
   
    Java8 has introduce the internal iteration which is forEach() method
       people.forEach(p -> system.out.println(p));
       people.forEach(system.out::println);

## Introduction To Streams

  A sequence of elements supporting sequential and parallel aggregate operations. In Java8 there is a new method Stream()     with all object. It basically streams a collection and on a stream it's basically perform multiple operation. And Each       operation has a chance to modify the stream. In Java8 stream is basically 3 different elements.
  
  1) Source: Which provides the elements (i.e.- collections)
  
  2) Operations: All the operation that needs to perform. These operations only take lambda expression.
  
  3) Terminal Operation: End condition which is ask stream to act. Unless the end condition stream has been even get              started.
