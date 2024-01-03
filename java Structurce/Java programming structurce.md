# Structure of Java File

- “Source code that we write will be saved using extension .java”
- Every thing written in .java file must be in classes or we can say that
every file having .java extension is a class
- A class with same name as file name must be present in .java file.
- First alphabet of class name can be in upper case. It is the naming convention of class name. however, it is not compulsory to do so.
- Class which is having same name as file must be public class
- A main function/method must be present in this public class, main is a
function from where the program starts.

# Converting .java to .class

- Using javac compiler we can convert .java file to .class
Command to convert .java to .class


             Javac and .java file name

- Above command create a . class file (Main.class) which contains
Bytecode
![Alt text](image.png)

# Running the program

By using java and name of file we can run the program.

- Command > **java Main**

# Hello world program
# Hello world program

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/d1c901b3-ce3f-4766-be83-001e4162c91c/Untitled.png)

<aside>
💡 **public (in first line):-** public is an access modifier which allows to access the class from anywhere.

</aside>

<aside>
💡 **class :-** It is a name group of properties and functions

</aside>

<aside>
💡 **Main :-** It is just the name of class as same as the name of

</aside>

<aside>
💡 **public (in second line) :-** It is used to allow the program to use main function from

</aside>

<aside>
💡 **static :-** It is a keyword which helps the main method to run without using objects.

</aside>

<aside>
💡 **void :-** It is a keyword used when we do not want to return anything from a method/function

</aside>

<aside>
💡 **main :-**It is the name of

</aside>

<aside>
💡 **String [] args :-** It is a command line argument of string type

</aside>

<aside>
💡 **System:-** It is a final class defined in lang package.

</aside>

<aside>
💡 **out :-** It is a variable of PrintStream type which is public and static member field of the System class.

</aside>

<aside>
💡 **println :-** It is a method of PrintStream class, It prints the argumants passed to it and adds a new **print** can aalso be used here but it prints only arguments passed to it. It do not adds a new line.

</aside>

## What is package ?

→ It is just a folder in which java files lies.

→ It is used to provide some rules and stuﬀ to our programs.

## Primitive data types

- Primitives data types are those data types which is not

Ex:-

String is not a primitive data type so we can break this data type into char

i.e., String “Kunal” can be divided into ‘K’ ‘u’ ‘n’ ‘a’ ‘l’

But primitives data type are not breakable.

We cannot break a char ,int etc.

- List of primitive data types in java are :-

| Data types | Description | Example |
| --- | --- | --- |
| int | int is used to store numeric digits | int i = 26; |
| char | char is used to store character | char c = ‘A’; |
| float | flot is used to store floating point
numbers | float f = 98.67f; |
| double | double is used to store larger decimal numbers | double d = 45676.58975 ; |
| long | long is used to store numeric digits
which is not able to stored in int | long l =
15876954832558315l; |
| boolean | It only stores store t values i.e., true or
false. | boolean b = false; |

*In float and long we have used f and l, it denotes that the number in the variable is float or long type, if we do not use this java consider float value as double and long value as int*.

- Literals :- It is a synthetic representation of boolean, character, string, and numeric

Ex:- int a = 10;

Here 10 is called literal.

- Identifiers:- name of variable, methods, class, packages, are known as identifiers.

Ex:- int a = 10;

Here a is Identifier.

## Comments in Java

Comments are something which is written in source code but ignored by compiler.

- Two types of Comment
    1. Single line comment :- used to comment down a single line (// is used for )
    2. Multi line comment :- used to comment down multiple lines (/* */ is used for it)

## Inputs in Java

We have Scanner class available in java.util package to take input To use this class we have to

1. Import util package in our file.
2. Create object of the scanner class
3. Use that object to take input from the Key board

### Syntax :-

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/8b59a0eb-2b11-404c-b869-31d2ab3d919e/Untitled.png)

1. **Scanner :-** It is a class required to take input, it is present in util package.
2. **input :**It is an object that we are creating to take
3. **new :**It is a keyword used to create an object in
4. **in :- System** is a class and **in** is a variable that denotes we are taking input from standard input stream (i.e. Keyboard).

# Input

**int Input :-** nextInt() is a function used to take input of int.

Syntax:-

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/baf8cf9e-4388-4179-bef8-6788e969a7ea/Untitled.png)

**float Input :-** nextFloat() is a function used to take input of int.

Syntax:-

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/99000073-565f-4eb4-897a-ef1e69a47942/Untitled.png)

**String Input :-** Two ways to take string input

1. Using next() Method :- It will take one word input till a space occurs 

Syntax:

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/05993e43-e8f2-4f39-a5b4-26ecbffa2d74/Untitled.png)

Input :- Hey kunal

Output :- Hey

1. Using nextLine() Method :- It will take all string input including 

Syntax:-
