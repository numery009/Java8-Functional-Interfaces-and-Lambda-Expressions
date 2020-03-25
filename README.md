# Java8-Functional-Interfaces-and-Lambda-Expressions

## Why Lambdas

  1) Enable Functional Programming: We can use function as an entity that can pass around.
  2) Readable and Concise Code: Anonymous inner clas which is robust. Lambda make it readable and concise.
  3) Easier to Use API's and Libreries : It has the collection API and more libraries to enable the functional programming          model.
  4) Enable Support for Parallel Processing: Collection can go through the parallel stream.
    
##  Code in OOP

  1) Everything is an object.
  2) All code blocks are associated with classes and objects.

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
  
     aBlockofCode=()-> System.Out.println("Hello World!");
                        
