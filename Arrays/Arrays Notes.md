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
![1](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/65644c5e-9723-4538-8a6f-f8e7de7b8e45)



# Internal Working Arrays


![2](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/55e1208d-7385-47a4-adc5-b879686a70b9)

![3](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/68214ce7-0e67-41db-8f6a-e97d23fc3098)


# Internal Representation Arrays

- Internally in Java memory allocation totally depends on JVM whether it be continuous or not
- Reason 1 : objects are not stored in heap Memory
- Reason 2 : In JIS (Java lanuage specification) it mentioned that heap objects are not continous.
- Reason 3:  Dynamic Memory allocation, Hence arrays objects in Java may not be continous (depending on Jvm)

# Index of arrays



 ![4](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/e81b05bb-a512-483a-b16b-5c05382ff645)


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


![5](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/f110be27-860a-4bee-8160-615e2276692b)

# Arrays passing to Function

- Arrays is an mutable
- String is an not mutable

![6](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/24f76930-2488-4443-af59-9cf923682d88)


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
