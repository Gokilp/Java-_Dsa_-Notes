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

- Classes is created a own purpose contains own **Methods and  properties.**
- Class is a template of an Object
- Object is an instance of classes

> Classes ⇒ Logical Value  // Not Occpuing Space in Memory 
object ⇒ physical object   // Occuping  space in memory
> 

## Objects

- Object Occuping space in Memory Handle
- Object Access using . dot operator using Reference Variable
- Instance Variable is Object inside the properties
- It is useful to think of an object’s identity as the place where its value is stored in memory.
- The behavior of an object is the effect of data-type operations.
- The dot operator links the name of the object with the name of an instance variable.   Although commonly referred to as the dot operator, the formal specification for Java categorizes the . as a separator.

## Class and Object  declare

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

- New Word  is create a Dynamically allocate memory & Return  a reference to it

## Runtime and compile Time

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/c4d9d0cc-cee9-45a0-a5b6-86882c2377d8/Untitled.png)

### Complie Time

- Compile time refers to the period during which a program is translated from human-readable source code into machine-readable instructions by a compiler.
- Compile time Excute code Only initialize stack Memory

### Run Time

- During runtime, variables are allocated memory, objects are created, and functions/methods are executed based on the flow of the program.
- Java programming  Dynamically create object in Run time.

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

- Constructor is special type of function But Run you create a object and allows ttom sme variables
- Constructor is same name of Class
- Immediately called object is created
- Constructor initilizing the Values
- Constructor No return Type
- Constructor Value No modified.
- The constructor is a useful special type of function responsible for handling object properties' values and ensuring that they cannot be modified from outside the class.

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
- Constructor using Modified Every Object Values  using the parameters /Arugments values

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