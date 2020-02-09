## Anonymous Array in Java


An array in java without any name is anonymous array. It is an array just for creating and using just for creating and using instantly.
     -- We can create an array using without name, such type of nameless arrays are called anonymous array.
     -- The main purpose of anonymous array is just for instant use( just for one time usage).
     -- Anonymous array is passed as an argument of method.

 Syntax:

        anonymous int array
        new int[] { 1,2,3,4};

        anonymous char array
        new char[] {'a', 'b', 'c'};

        anonymous String array
        new String[] {'Apple', 'Banana' ,'Carrot'};

        anonymous multidimensional array
        new int[] [] { {10, 20}, {30, 40} };



## Default method in Interface

Before in Java, interface could have only abstract methods. The implementation of these methods has to be provided in a separate
class. So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing
same interface. To overcome this issue, Java 8 has introduced the concept of Default methods which allow the interfaces to have
methods with implementation without affecting the classes that implement the interface. The Default methods were introduced to
provide backward compatibility so that existing interface can use the lambda expression without implementing the methods in the
implementation class. Default methods are also known as defender methods or virtual extension methods.

## Inheritance in Interface

An interface in Java is a blueprint of class. It has static constants and abstract methods. The interface in java is a mechanism to achieve
abstraction. There can be only abstract methods in the java interface, not method body. It is used to achieve abstraction and multiple
inheritance in java. In other word, you can say that interface can have abstract methods and variables. It cannot have a method body.
Java interface also represent the IS-A relationship.

## Nested interface

An interface i.e. declared within another interface or class is known as nested interface. The nested interfaces are used to group
related interfaces so that they can be easy to maintain. The nested interface must be referred by the outer interface or class. It
can't be accessed directly.
  -- Nested interface must be public if it is declared inside the interface but it can have any access modifier if declared within the
     class.
  -- Nested interfaces are declared static implicitly.

Syntax:

 interface inteface_name{
 ........
 }
 interface nested_interface_name{
 ..........
 }

 ## Q. How to create your own Exception class?

Ans: Java provides us facility to create our own exception which are basically derived classes of Exception. Now, let's see how to create
         a custom exception on action.
         . Create a new class whose name should end with Exception. This is a convention to differentiate an exception class from regular ones.
         . Make the class extends one of the exceptions which are subtypes of the java.lang.EXcetion class. Generally, a custom exception class
           always extends directly from the Exception class.
         . Create a constructor with a String parameter which is the detail message of the exception. In construtor, simply call the super construtor.
           and pass the message.
