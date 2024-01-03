# Functions or Methods

- A method is a block of code which only runs when it is called
- To reuse code :  Define the code once, I use it many times

 

```jsx
Public class Main{
 
static void my method ()
{
    //code

}
```

- void → this method my method( ) does not have a return value
- my method → name  of  method

```jsx
public class Main{
  access_modifier return type method()
{
     //code 
  return statement;
}

method() // calling  function
}
```

# Return type

- A return statement causes the program control  to transfer back to the caller of a Method.
- A return type may be primitive type like int,char or void type (Return Nothing)
- There are few important things to understand about returning the values
- The types of data returned by a method must be compatible with the return type by the method .

          Eg:  if return type of some methods is boolean, we cannot return an integer.

- The variable  receiving the value returned by a method must also a compatible with the return type specified for the method.

# Pass by Value
![pass value](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/00293362-eae4-4660-999b-92e3f3b933d3)


# Points to be  noted

- Primitive Data type like int, short, char, byte etc  →  just pass value.
- object & reference → passing value of reference Variable

 ![points](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/0a9d4e83-5f7f-443f-9cec-b4d149719634)


# Scopes:

Scopes are available 3 types

- Function Scope
- Block Scope
- loop Scope

## Function Scope

Function Scope variable declared inside a method/ function scope (means inside method) can’t be accessed variable outside the method 

![functionscope](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/bac88529-761a-42b2-ad09-3a79d0557801)


## Shadowing

Shadowing in Java is the practice of using variable is overlapping scopes with the same name where the variable in low-level scopes overrides the variable of high level scope. Here the variable at high - level scope is shadowing by low level scope variable 

![shadowing](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/e810d8d8-5e6f-459e-92fe-bf57689f70ed)


## Variable Arguments

Variable Arguments is used to take a variable number of arguments. A method that takes   a variable number of arguments is a varagrs method 

![varagr](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/d63ec26b-9b8b-4cbe-baf9-1676f445a383)


Function Overloading 

Function Overloading happens when two function have same name

![function overloading](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/45f820ac-acc7-4566-94a8-a7d53f31116f)
