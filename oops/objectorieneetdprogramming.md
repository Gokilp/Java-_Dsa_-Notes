# Classes

- class is like a blue print
- classes Named group of properities and function
- classes is used combined properties and Methods

## Why need Class

Consider a scenario where we need to manage information about students, such as their roll numbers and names. Initially, we might resort to separate arrays for each piece of data:

```java
javaCopy code
int[] rollNumbers = new int[5]; // Array for storing roll numbers
String[] names = new String[5]; // Array for storing student names

```

While this approach works, it can quickly become unwieldy as the program grows. Every additional piece of data necessitates another array, leading to increased memory consumption and complex data management. Classes offer a more elegant solution by consolidating related data and behavior into a single entity.

# Classes

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/44ffdcdb-2e14-4489-9846-a40d2d1b1e29/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/0fbdd402-181f-4c8b-a0a8-2ce137ea7e46/Untitled.png)

- Classes is created a own purpose contains own **Methods and properties.**
- Class is a template of an Object
- Object is an instance of classes

> Classes ⇒ Logical Value // Not Occpuing Space in Memory
> object ⇒ physical object // Occuping space in memory

## Objects

- Object Occuping space in Memory Handle
- Object Access using . dot operator using Reference Variable
- Instance Variable is Object inside the properties
- It is useful to think of an object’s identity as the place where its value is stored in memory.
- The behavior of an object is the effect of data-type operations.
- The dot operator links the name of the object with the name of an instance variable. Although commonly referred to as the dot operator, the formal specification for Java categorizes the . as a separator.

## Class and Object declare

### Declaring a Class

```java
// create a class

Class Student {

int rno;   //rno;
int marks; //Marks
String name;  // Name

```

### Declaring Object

```java
Student student1 = new Student();
```

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/188bddfe-d188-40b1-b14c-e9137cea5eb1/Untitled.png)

- New Word is create a Dynamically allocate memory & Return a reference to it

## Runtime and compile Time

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/c4d9d0cc-cee9-45a0-a5b6-86882c2377d8/Untitled.png)

### Complie Time

- Compile time refers to the period during which a program is translated from human-readable source code into machine-readable instructions by a compiler.
- Compile time Excute code Only initialize stack Memory

### Run Time

- During runtime, variables are allocated memory, objects are created, and functions/methods are executed based on the flow of the program.
- Java programming Dynamically create object in Run time.

### Manuplate the object and classes

```java
public class Oops{

      static class Student{

        int rno;
        float  marks;
        String name;
      }
      public static void main(String[] args) {
          Student student1 = new Student();

          System.out.println(student1.rno);
          System.out.println(student1.marks);
          System.out.println(student1.name);
      }
}
```

# Constructor

- Constructor is special type of function But Run you create a object and allows the same

      data type   variables

- Constructor is same name of Class
- Immediately called object is created
- Constructor initializing the Values
- Constructor No return Type
- Constructor Value No modified.
- The constructor is a useful special type of function responsible for handling object properties' values and ensuring that they cannot be modified from outside the class.
- Must use this keyword

### Advantage of constructor

1. **Initialization**: Constructors initialize object attributes, ensuring a defined starting state.
2. **Encapsulation**: They enforce encapsulation by controlling attribute initialization.
3. **Convenience**: Simplify object creation by providing a standardized process.
4. **Default Values**: Offer default values for attributes, enhancing flexibility.
5. **Inheritance and Polymorphism**: Play a key role in inheritance and polymorphism, enabling subclass object creation and specialization.

### Types of Constructor

- Default Constructor
- Parameterized Constructor
- Copy Constructor

## this Keyword

- The **`this`** keyword in Java refers to the current object.
- It is typically used to distinguish between instance variables and local variables, to invoke methods or constructors of the current object, or to pass the current object as an argument.
- However, it cannot be used in static methods.
- Understanding its usage is crucial for maintaining clarity and avoiding ambiguity in Java code.

```java
public class Oops{

      static class Student{

        int rno;
        float   marks;
        String name;

        Student () {
        // Default values
        this.rno = 10;        // this word reference pointing the current Object
        this.marks = 20.0f;
        this.name = "gokil";
        }


    }

      public static void main(String[] args) {
        Student student1 = new Student();
        Student Rahul = new Student();
          System.out.println(student1.rno);
          System.out.println(student1.marks);
          System.out.println(student1.name);
      }
}
```

### constructor Value modified

- Constructor only modified passing arugments
- Constructor using Modified Every Object Values using the parameters /Arugments values

```java
public class Oops {

    static class Student {

        int rno;
        float marks;
        String name;

        // Constructor with parameters to modify values
        public Student(int rno, float marks, String name) {
            this.rno = rno;
            this.marks = marks;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Creating a Student object with specific values using the constructor
        Student student1 = new Student(10, 20.0f, "gokil");

        // Outputting the values of student1
        System.out.println(student1.rno);
        System.out.println(student1.marks);
        System.out.println(student1.name);
    }
}
```

### Constructor Overloading

- Constructor overloading is indeed an important concept in polymorphism.
- In object-oriented principles, constructors do indeed consider parameters/arguments (values).
- A constructor with no arguments is called a default constructor.

```java
public class Oops {

    public static class Student{

        int rno;
        float marks;
        String name;

    Student() {   //  constructor consider calling the size of Arguments

        this.rno=10;
        this.marks=20.0f;
        this.name="gokil";
    }
    Student(int rollno,float marks,String Name) // constructor consider  calling the size of Arguments
    {
        this.rno=rollno;
        this.marks=marks;
        this.name=Name;
    }
}
    public static void main(String[] args) {
         Student gokil = new Student(20,10.0f,"Rahul");

        Student Rahul = new Student();
        System.out.println(Rahul.marks);

    }


}
```

## calling construct to another constructor

- call one constructor from another constructor in the same class using the **`this()`** keyword.
- This is useful when you have multiple constructors in a class and want to avoid code duplication by reusing common initialization logic.

1. **`this()` Keyword**:
   - Use **`this()`** to call another constructor from within a constructor.
   - It must be the first statement in the constructor.
2. **Avoiding Redundancy**:
   - Helps in avoiding repetition of initialization logic.
   - Centralizes common initialization steps.
3. **Parameter Passing**:
   - Arguments can be passed to the constructor being called using **`this()`**.
   - Ensure argument types match the parameter list of the target constructor.
4. **Code Readability**:
   - Enhances code readability by providing a clear flow of initialization logic.

```java
public class Oops{

 public static class Student{

    int rno;
    String name;

    Student(int rollno,String Name)
    {
      rno =rollno;
      name=Name;
    }
    Student()
    {
        this(12,"gokil");
    }
 }
   public static void main(String [] args)
   {
      Student cs = new Student();

      System.out.println(cs.name);

   }

}
```

### Copy Constructor

- java copy constructor returns a copy of the specified object by taking the existing object as an argument.
- To create a copy constructor, we need to take the existing object as an argument and initialize the values of instance variables with the values obtained in the object.

```java
class Person {
    String name;

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";

        // Using the copy constructor to create a new object
        Person person2 = new Person(person1);

        System.out.println("Person 1: " + person1.name);
        System.out.println("Person 2: " + person2.name);
    }
}
```

## Memory Allociation New Key Word

- New word also an Objects and stored in Heap Memory
- Heap mermory Object point to another Reference Variable

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/a7a6aee8-2450-41bb-b530-3e3b8e396764/Untitled.png)

## Wrapper Classes

- wrapper classes are used to convert primitive data types into objects, as Java is an object-oriented programming language where everything is treated as an object.
- Wrapper classes is immutable
- wrapper classes in scenarios where objects are required, such as collections (ArrayList, HashMap) which can't directly store primitive types.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/49671ea6-0b35-4b14-8305-d28013a2f88c/Untitled.png)

- Wrapper classes contains internal side

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/85bea851-6fd2-4647-8204-f2280261fd68/Untitled.png)

### Arritubutes of Wrapper Classes

```java

Integer i = Integer.valueOf(value); // Boxing, Wrapping

int j = i.int Value(i) // unboxing

Integer i3 = 30; // auto boxing
int k = i2;

int i = Integer.parseInt(varible);
```

## Final Key word

- When a non primitive is final, you cannot reassign cannot the value.
- primitive data type final key word you can’t Modified.
- The **`final`** keyword in Java is used to declare constants, immutable variables, and prevent method overriding or subclassing.
- It makes variables unmodifiable after initialization, methods unoverridable, and classes unextendable. It ensures code robustness, improves performance, and clarifies intent by signaling immutability or constant values.

### Garbage Collections

- If there is an object without reference variable then object will be
  destroyed by “Garbage Collection

# Java Packages & API

A package in Java is used to group related classes. Think of it as **a folder in a file directory**. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

- Built-in Packages (packages from the Java API)
- User-defined Packages (create your own packages)

## Built in packages

The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.

The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.

# User-defined Packages

To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:

# Example

`└── root
  └── mypack
    └── MyPackageClass.java`

To create a package, use the `package` keyword:

# Static Keyword

Static method using an referencing without object

**Static Variables**: Variables that belong to the class itself, rather than any specific instance of the class. They are shared among all instances of the class.

- **Definition**: Shared variables for all objects of a class.
- **Example**:

```java
public class Example {
    static int count = 0; // Static variable
}
```

```java
public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;  // static not referncing an objects

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // class name give the static Methods calling
    }
}
```

**Static Methods**: Methods that belong to the class rather than any instance of the class. They can be called without creating an instance of the class.

- **Definition**: Methods that belong to the class, not objects.
- **Example**:

```java
public class Example {
    static void display() { // Static method
        System.out.println("Hello, World!");
    }
}
```

```java
package com.kunal.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22, "Kunal", 10000, false);
//        Human rahul = new Human(34, "Rahul", 15000, true);
//        Human arpit = new Human(34, "arpit", 15000, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();

    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}
```

**Static Block**: A block of code enclosed in curly braces **`{}`** inside a class, preceded by the **`static`** keyword. It is executed when the class is loaded into memory.

- **Definition**: Special code block executed when class is loaded.
- **Example**:

```java
public class Example {
    static {
        // Static block
        System.out.println("Static block initialized.");
    }
}
```

```java
package com.kunal.staticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}
```

**Static Nested Classes**: Classes that are declared inside another class and marked as static. They can be accessed without instantiating the outer class.

- **Definition**: Nested class declared inside another class.
- **Example**:

```java
public class Outer {
    static class Nested {
        void display() {
            System.out.println("Nested class method");
        }
    }
}
```

```java
package com.kunal.staticExample;

import java.util.Arrays;

public class InnerClasses {

    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

//static class A {
//
//}
```

### Singleton Classes

In object-oriented programming, a java singleton class is a class that can have only one object (an instance of the class) at a time. After the first time, if we try to instantiate the Java Singleton classes, the new variable also points to the first instance created.

1. Make a constructor private.
2. Write a static method that has the return type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method.

```java
package com.kunal.singleton;

import com.kunal.access.A;

public class Singleton {
    private Singleton () {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}
```

```java
package com.kunal.singleton;

import com.kunal.access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variables are pointing to just one object

        A a = new A(10, "Kunal");
        a.getNum();
//        int n = a.num;
    }
}
```

# Principle of oops

- Inheritance
- polymorphism
- Encapsulation
- Abstraction

## Inheritance

- Inheritance is an important pillar of OOP(Object-Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class
- Java, Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition.
- In heritance is base classes inherit to derived class you can also create a new properties on derived classes and also used existing base class properties .

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/813a2fea-0a38-4dc1-bb07-d24b7909f536/Untitled.png)

## Syntax

```java
class derived-class extends base-class
{
   //methods and fields
}
```

```java
public class Oops{

  static class Department{

   String college;
   String  Department;
   int student_ls;
   int Staff_ls;

   Department()
   {
      college =" IIT Madras";
      Department = "Computer Science";
      Staff_ls=20;
      student_ls=100;
   }
}
  public static class Student extends Department{

   String Mentor_name;
   int  student_rollno;
   int semster;

   Student()
   {
      Mentor_name="ram";
      student_rollno = 01;
      semster = 01;
   }

  }

   public static void main(String[] args) {
       Student student = new Student();

       System.out.println(student.Mentor_name);
       System.out.println(student.Department);
   }

}
```

# Access to object

![1000020284.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/f2571e4e-2e55-46c9-8579-a4ae25a3d0d5/1000020284.jpg)

- In object-oriented programming (OOP), when you create an object of a parent class, you can't directly access the members or methods of derived classes. The reason is that the object created is of the parent class type, so it only contains the attributes and methods defined in the parent class.
- However, if the methods or attributes in the derived classes are accessible through inheritance (i.e., they are not private or protected), you can access them by creating an object of the derived class and then accessing those members or methods through that object.

```java

     Box box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.w);  // you can inherit deviered class to base class
                                     // constructor automatically deside class file

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
        BoxWeight box6 = new Box(2, 3, 4);
        System.out.println(box6);  // you can  inherit base  class to deviered class
                                     // constructor automatically deside class file

```

## Super class

- Super is reference to the parent class constructor .
- Super classes is always reference to the parent constructors
- **`this`** keyword: Refers to the current instance of the class, used to access instance variables or methods of the current object.
- **`super`** keyword: Refers to the parent class, used to call the parent class's constructor or methods from the subclass.

### superclass methods and variables:

The **`super`** keyword can be used to access methods and variables of the superclass from within the subclass. This is particularly useful when the subclass overrides a method of the superclass but still needs to call the superclass's version of that method.

```java

class Vehicle {
	int maxSpeed = 120;
}

// sub class Car extending vehicle
class Car extends Vehicle {
	int maxSpeed = 180;

	void display()
	{

		System.out.println("Maximum Speed: "
						+ super.maxSpeed); // calling constructor on parent class
                               // print value maxspeed is 120
	}
}

// Driver Program
class Test {
	public static void main(String[] args)
	{
		Car small = new Car();
		small.display();
	}
}

```

### Calling the superclass constructor:

When you create an object of a subclass, the constructor of the superclass is called implicitly before the constructor of the subclass. However, you can explicitly call a specific constructor of the superclass using the **`super()`** keyword. This is useful when the superclass has multiple constructors, and you want to call a specific one

```java
class Superclass {
    void display() {
        System.out.println("Superclass method");
    }
}

class Subclass extends Superclass {
    @Override
    void display() {
        super.display(); // Calls the superclass method
        System.out.println("Subclass method");
    }
}

public class Main {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
    }
}

Output code

Superclass constructor
Subclass constructor

```

## Types of Inheritance

- Single inheritance
- Multiple inheritance
- Multilevel inheritance
- Hierarchical inheritance
- Hybrid inheritance

### Single Inheritance

Single Inheritance is one classes extends from another classes

In the oops concept create object dervied classes to base classes

Example

![1000020284.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/f2571e4e-2e55-46c9-8579-a4ae25a3d0d5/1000020284.jpg)

```java
class derived-class extends base-class
{
   //methods and fields
}
```

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/ca4b363d-7311-4b53-90f5-81aad2f5fb60/Untitled.png)

### multi level inheritance

- In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes.
- In the below image, class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C.

Visual Represtation

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/222de7e9-a2e9-4827-9ea6-df8b8d1f5a3b/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/337cf01a-1f2c-4cef-b7e7-711758aa51bb/Untitled.png)

```java
// Java program to illustrate the
// concept of Multilevel inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class One {
	public void print_geek()
	{
		System.out.println("Geeks");
	}
}

class Two extends One {
	public void print_for() { System.out.println("for"); }
}

class Three extends Two {
	public void print_geek()
	{
		System.out.println("Geeks");
	}
}

// Drived class
public class Main {
	public static void main(String[] args)
	{
		Three g = new Three();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}
}

```

### Multiple Inheritance

In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes.

Java does not support multiple inheritances with classes. In Java, we can achieve multiple inheritances only through Interfaces. In the image below, Class C is derived from interfaces A and B.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/eea07492-fcb9-477d-af8c-fa949edd6b21/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/8b4ceef2-ec4b-41c0-bf95-0073ea543560/Untitled.png)

### Hierarchical Inheritance

In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass. In the below image, class A serves as a base class for the derived classes B, C, and D.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/11d4ba69-c14f-499d-8dfe-c3ee927fdfa2/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/27c4b478-4347-46ed-aff2-05f73b356d6a/Untitled.png)

```java
class Animal{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
void bark(){System.out.println("barking...");}
}
class Cat extends Animal{
void meow(){System.out.println("meowing...");}
}
class TestInheritance3{
public static void main(String args[]){
Cat c=new Cat();
c.meow();
c.eat();
//c.bark();//C.T.Error
}}

// it working
```

### Hybrid inheritance

- Hybird Inheritance combination of single and Multiple inheritance
- Hybird Inheritance is not access java but only use in interfaces

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/8ca136c8-6815-4e33-afbe-b8d7fd836cbe/Untitled.png)

# Ploymorphsim

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/82e9cb7c-827b-4b86-8be6-7a8cb6f7ec35/Untitled.png)

> Poly Means Many

> morphism ⇒ ways to respresent

Syntax of ploymorphism

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/07e3b0e3-93fb-4470-8d47-f88fb10ffb05/Untitled.png)

## Types of Polymorphism

- Compile Time polymorphism
- Static polymorphism

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/b99bc0d7-aa81-4531-a56c-a917e0db142c/Untitled.png)

### Compile time Polymorphism

- Compile Time polymorphism / Static polymorphism Achived via Method Overloading
- Same name methods, Constructor but types Arugmuents,returntypes ordering can be different

Eg: Multiple constructor

```java
class Helper {

    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b;
    }
}

// Class 2
// Main class
class GFG {
    // Main driver method
    public static void main(String[] args)
    {
        // Ploymorphsim Calling method by passing

        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
    }
}
```

## Dynamic polymorphism

Dynamic polymorphism or Runtime Polymorphism

```java

// Base Class
class Parent {
	void show() //same method name with  one to access the variable

{ System.out.println("Parent's show()"); }
}

// Inherited class
class Child extends Parent {

 void show()   //same method name with  one to access the variable
	{
		System.out.println("Child's show()");
	}
}

// Driver class
class Main {
	public static void main(String[] args)
	{
		Parent obj1 = new Parent();
		obj1.show();
parent object = new child();
   object.show();
//refercing varible on parent class but created
// child classes object is created working only
// Java run a method in referece in child classes only not a parent classes
	}
}

```

### Overiding

- "Overriding involves the use of polymorphism, wherein subclasses inherit methods from their base classes. However, a main disadvantage of inheritance arises when a user calls a method with the same name, resulting in the execution of the method from the parent class."

1. **Overriding and Polymorphism**:
   - Overriding: Subclasses can redefine methods inherited from their parent classes.
   - Polymorphism: Allows a single method call to behave differently based on the object's type.
2. **Disadvantage of Inheritance**:
   - Inheritance: Subclasses inherit properties and behaviors from their parent classes.
   - Drawback: Method conflicts arise when a method with the same name exists in both the parent and child classes.
3. **Execution of Parent Class Method**:
   - When a method is called on a subclass object with the same name as a method in the parent class:
   - The parent class method is executed instead of the overridden method in the subclass.
   - This behavior may cause unexpected results, deviating from the intended subclass functionality.

![Screenshot 2024-02-22 205715.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/2c42fee2-5f8b-4da4-8f6f-0a7b31f03177/Screenshot_2024-02-22_205715.png)

### Early Binding and Late binding

1. **Early Binding**:
   - In early binding, the association between a method call and the method implementation is resolved at compile time.
   - This means that the compiler knows exactly which method will be called and can directly link the method call to its implementation.
   - Early binding is usually more efficient in terms of performance because the method resolution is done once, during compilation.
   - However, it lacks flexibility because it requires that the method to be called is known at compile time.
2. **Late Binding**:
   - In late binding, also known as dynamic binding or runtime binding, the association between a method call and the method implementation is resolved at runtime.
   - This means that the decision about which method to call is deferred until the program is actually running.
   - Late binding allows for greater flexibility because it enables things like polymorphism, where a single method call can behave differently depending on the actual object being referred to.
   - However, late binding typically incurs a performance overhead because the method resolution needs to be done each time the method is called at runtime.

### Final Keyword

- Final Keyword prevent overriding at Runtime .
- The final keyword always prevents the overriding of classes and methods. For example, inheriting the parent class with the final keyword will not work because the final keyword does not allow it.
- Using the static keyword prevents the overriding of values because static does not depend on objects. A static method is referenced using the class name or a reference variable; you cannot access it by calling on objects.
- Static methods do not depend on objects, so they cannot be overridden based on objects. Therefore, static methods cannot be overridden.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/54208fa8-5cc6-4909-9ba1-90a7c785cd15/Untitled.png)

## Encapsulation and Abstraction

- Abstraction solves design-level issues, while Encapsulation addresses implementation issues by hiding the code within a single combined and protected form from the outside world.
- Abstraction focuses on the external level of implementation, whereas Encapsulation concentrates on the internal level of implementation.
- Abstraction involves gaining information, while Encapsulation involves containing information at a certain level.
- Abstraction works with abstract classes and interfaces, whereas Encapsulation handles access modifiers and methods."

## Access Modifier’s

default package not Access out side the packages.

public package is Access in every Where

private package only access inside the class and methods

protected is access classes, packages, Sub class Package in same pkg, Sub class Package in different package

### Rules for Access Modifier’s

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/4b5e27a5-2041-4517-b962-0dd252690765/Untitled.png)

## When to use the Access modifier’s

- "Private" holds sensitive data and should not be accessed directly within the same class, using only getter and setter methods.
- Getter and setter methods must be declared as "Public."
- "No modifier" signifies the default access level, allowing access only within the same package or class, but not outside of it.
- "Protected" access modifier allows access within the class, its package, and subclasses (inheritance), but not outside of the package or class hierarchy.
- "Protected" is primarily used for inheriting classes in subclasses, where subclasses must only access variable data.
- "Public" allows access from anywhere and everywhere.
- In protected Only you access inherit the Subclasses Not know the parent classes
- Simple protected access only Subclasses only.

![1000020284.jpg](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/f2571e4e-2e55-46c9-8579-a4ae25a3d0d5/1000020284.jpg)

- Protected Key word also refers to the base classes

## Common Packages

- lang: Language - Java programming language core package containing fundamental classes and interfaces.
- io: Input/Output - Java package for input and output operations, including file handling.
- util: Utility - Java package containing various utility classes and data structures.
- applet: Application let - A small application program that runs within a larger application or web browser.
- awt: Abstract Window Toolkit - Java package for creating graphical user interfaces (GUIs).
- net: Network - Java package for networking functionality, including client-server communicati

### Object classes

- The **Object class** is the parent class of all the classes in java by default. In other words, it is the topmost class of java.
- The Object class is beneficial if you want to refer any object whose type you don't know. Notice that parent class reference variable can refer the child class object, know as upcasting.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/71165023-7929-4556-9b4b-73166a630765/Untitled.png)

## Object class Methods

- tostring() method
- hashCode() method
- equals(Object obj) method
- finalize() method
- getClass() method

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/370b8a7c-f27b-46b8-96c6-b6433fb9ac7c/Untitled.png)

### **1. `toString()`**

**Definition:**
The **`toString()`** method is a method in Java that returns a string representation of an object. This method is automatically called when you try to concatenate an object with a string or when you try to print an object using **`System.out.println()`**.

**Example:**

```java
javaCopy code
class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020);
        System.out.println(myCar); // Output: Car{brand='Toyota', year=2020}
    }
}

```

### **2. `hashCode()`**

**Definition:**
The **`hashCode()`** method in Java returns a hash code value for the object. This method is used by hash-based data structures such as HashMap, HashSet, etc.

**Example:**

```java
javaCopy code
public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        int hashCode = str.hashCode();
        System.out.println("Hash code for 'Hello': " + hashCode);
    }
}

```

### **3. `equals(Object obj)`**

**Definition:**
The **`equals(Object obj)`** method is used to compare two objects for equality. The default implementation of this method in the Object class compares memory addresses, but it is often overridden in user-defined classes to compare object contents.

**Example:**

```java
javaCopy code
class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id &&
                Objects.equals(name, student.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 123);
        Student s2 = new Student("Alice", 123);
        System.out.println(s1.equals(s2)); // Output: true
    }
}

```

### **4. `finalize()`**

**Definition:**
The **`finalize()`** method is called by the garbage collector before reclaiming memory occupied by an object. It is a method that can be overridden to provide cleanup code for an object before it is garbage collected.

**Example:** This method is rarely used explicitly.

### **5. `getClass()`**

**Definition:**
The **`getClass()`** method returns the runtime class of an object. It is a final method in the Object class, so it is available to all Java objects.

**Example:**

```java
 public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        Class<?> cls = str.getClass();
        System.out.println("Class of 'Hello': " + cls.getName());
    }
```

### Abstract Classes

Data **abstraction** is the process of hiding certain details and showing only essential information to the user.

Abstraction can be achieved with either **abstract classes** or interfaces

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/c9bd013f-e92f-4739-afb9-b9894b2810e8/Untitled.png)

- Inheritance conflicts inherit the same Function Name sloving the conflict using Abstract classes
- Overriding sloving the conflicts

The `abstract` keyword is a non-access modifier, used for classes and methods:

- **Abstract class:** is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
- **Abstract method:** can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
- when you declare an abstract method inside an abstract class, you should include the name add keyword abstract class name.
- Abstract class can’t create a object and Abstract class is created in super classes /Parent classes no Body
- Abstract class you can inherit the parent class
- Abstract class you Overiding in using child class object

```java
abstract class Animal {
    abstract void makeSound(); // Abstract method
}

```

```java
abstract class Animal {
    abstract void makeSound();   //Abstract classes no body
}

class Dog extends Animal {
    void makeSound() {                // Abstarct class only use inherit parent class
        System.out.println("Bark");   // Dog is overriding
    }
}

class Cat extends Animal {
    void makeSound() {                  //Abstarct class only use inherit parent class
        System.out.println("Meow");     // cat is overiding
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();          // only created a Object child classes

        dog.makeSound();
        cat.makeSound();
    }
}

```

## Abstract class constructor

Abstract class constructor does created because of Abstract classes does not create a object , so Abstract classes no body no instance variable and methods

## Abstract class Object

Abstract class Object does created because of Abstract classes does not create a object , so Abstract classes no body no instance variable and methods

## Static Method

Static method using in Abstract classes because Abstract classes static method not depending on Object

## Interfaces

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/8d029115-7a2e-425c-86a7-152f06f01a2f/Untitled.png)

Interface sloving Multiple inheritance problems
