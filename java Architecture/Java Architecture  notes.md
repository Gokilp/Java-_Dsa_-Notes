# Java code execute in Computer

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/628afa62-48ce-4009-8b02-14709831a768/Untitled.png)

dot java file are converted into dot.class file(byte code)  then converted machines Code

# More about platform independence

- It means that the byte code can run on all operating System
- We need to convert source code to machines code so computer can understand
- complier helps in doing this by turning it into executable code
- this  executable code is a set of instructions for the computer
- After compling C/C++ code excute we get .exe  file which is platform depedent
- In java we byte code, JVM converts into machince code
- Java is platform independent but JVM is paltform dependent

# Java architecture Digram

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/249e22c1-a03a-4f53-b049-eb2bccdd9371/Untitled.png)

# JDK  → Java development  Kit

provides environment to develop and run the Java program 

It is a package that packages 

- Development tool s → to provide an environment to develop your program
- JRE →  To execute your program,
- a complier - javac
- archiver -jar
- docs geneartor →javadoc
- interpreter /Loader

# JRE → Java Run time Environment

 

- it is  an installation package that provides  Environment to only run the program
- it consists of
1. Development technologies
2. user interface toolkit 
3. integration Libraries 
4. base libraries 
5. JVM

After we get .class file the next things happen at runtime 

1. class loader loads all classes needed to execute the program 
2. JVM sends code to byte coder verifier to check the format of code 

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/6f26f8fa-769a-44d9-82cf-93d11b4bfe93/Untitled.png)

Java program compling 

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/2603bb63-fafb-446c-b8a4-918eec11024e/e6c94e1b-cdc2-4e82-8f40-4030f308fecb/Untitled.png)

Jvm is box of container its support jre