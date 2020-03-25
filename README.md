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
