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

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/16be72b3-195d-4a89-9895-cfc2b4de0caf/Untitled.png)

# Points to be  noted

- Primitive Data type like int, short, char, byte etc  →  just pass value.
- object & reference → passing value of reference Variable

 

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/c3f66927-126d-4742-a141-906b418577bd/Untitled.png)

# Scopes:

Scopes are available 3 types

- Function Scope
- Block Scope
- loop Scope

## Function Scope

Function Scope variable declared inside a method/ function scope (means inside method) can’t be accessed variable outside the method 

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/75cd9a9e-19dc-497f-a104-8a4e2581bcfc/Untitled.png)

## Shadowing

Shadowing in Java is the practice of using variable is overlapping scopes with the same name where the variable in low-level scopes overrides the variable of high level scope. Here the variable at high - level scope is shadowing by low level scope variable 

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/304a3d83-1272-47b8-b062-05b5579b08e3/Untitled.png)

## Variable Arguments

Variable Arguments is used to take a variable number of arguments. A method that takes   a variable number of arguments is a varagrs method 

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/b97a391a-9104-42ec-b64d-c9d3d6558dd2/Untitled.png)

Function Overloading 

Function Overloading happens when two function have same name

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/3dc8ef17-b4d9-4753-ad51-edc9a7cb0b7e/Untitled.png)