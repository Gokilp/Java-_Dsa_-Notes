# Java code execute in Computer
![java code excution](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/1089350f-93cf-46f3-8dcc-24751076d516)


dot java file are converted into dot.class file(byte code)  then converted machines Code

# More about platform independence

- It means that the byte code can run on all operating System
- We need to convert source code to machine code so the computer can understand
- compiler helps in doing this by turning it into executable code
- this  executable code is a set of instructions for the computer
- After compiling C/C++ code execute we get .exe  file which is platform-dependent
- In Java we byte code, JVM converts into machine code
- Java is platform-independent but JVM is platform-dependent

# Java Architecture Diagram


![Java Architecture digram](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/46b78491-f340-4437-9392-e09c108abd21)

# JDK  → Java Development  Kit

provides an environment to develop and run the Java program 

It is a package that packages 

- Development tool s → to provide an environment to develop your program
- JRE →  To execute your program,
- a compiler - javac
- archiver -jar
- docs geneartor →javadoc
- interpreter /Loader

# JRE → Java Run time Environment

 

- it is  an installation package that provides  the Environment to only run the program
- it consists of
1. Development Technologies
2. user interface toolkit 
3. integration Libraries 
4. base libraries 
5. JVM

After we get .class file the next things happen at runtime 

1. class loader loads all classes needed to execute the program 
2. JVM sends code to byte coder verifier to check the format of the code 

![Java Architecture  jvm and jre](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/44e64bd4-3f4f-4e74-8390-c5803eba4853)


Java program compling 

![java compling code](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/369dbff6-6554-470c-9725-e0335fb60af6)


Jvm is box of container its support jre
