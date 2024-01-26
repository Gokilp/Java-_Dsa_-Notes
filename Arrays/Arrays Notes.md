# What is Array?

*An **array** is a collection of items stored at contiguous memory locations. The idea is to store multiple items of the same type together. This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array).*

# Arrays

```jsx
// syntax of Arrays
data type[] = varible name = new data type[size];

int[] varible ={ values };
```

# Why do we need Arrays

- Arrays is as data structure use to store a collection of data

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/0ac2ab9f-f75a-4e39-a9b7-4928fae42292/Untitled.png)

# Internal Working Arrays

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/3b46143a-0b56-45ba-b89c-d880af1afa41/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/442ba7e3-ec0b-4bea-82c5-26e43bc3d768/Untitled.png)

# Internal Representation Arrays

- Internally in Java memory allocation totally depends on JVM whether it be continuous or not
- Reason 1 : objects are not stored in heap Memory
- Reason 2 : In JIS (Java lanuage specification) it mentioned that heap objects are not continous.
- Reason 3:  Dynamic Memory allocation, Hence arrays objects in Java may not be continous (depending on Jvm)

# Index of arrays

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/4a75e238-24c7-4573-bb84-879edcbe0a4b/Untitled.png)

 

# for Each loop

```jsx
for ( data type  variable : arrayOrCollection) {
// Code to be executed for each element
}
```

- for  Each loop mostly used in accessing a single element value of code

```java
public class ForEachLoopExample {
    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Using for-each loop to iterate over the elements in the array
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
```

# Arrays to Strings

- The **java.util.Arrays.toString(int[])** method returns a string representation of the contents of the specified int array. The string representation consists of a list of the array's elements, enclosed in square brackets **("[ ]")**.

- Arrays to string this store an arrays objects

```java
import java.util.Arrays; // package 

Arrays.toString(array variable) 
```

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/9c315d3f-d384-4512-a5b2-1e339dfdb015/Untitled.png)

# Arrays passing to Function

- Arrays is an mutable
- String is an not mutable

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/7fc1c05b-5c5f-49ad-a84a-3f1eecfee2d8/Untitled.png)

# Multi Dimensional Arrays

- A multidimensional array is an array of arrays.
- Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

```java
int [] [] = new int [] []
       //or
int [] [] ={
             {],
             {},
             {}
           };   
//1 bracket -> rows
//2 bracket -> columns 
   
```
