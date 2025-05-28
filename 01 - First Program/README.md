# Hello World in Java

This is a simple Java program that prints "Hello, World!" to the console. It is typically the first program beginners write when learning a new programming language.

## Explanation

```java
public class Main
```
- In Java, everything starts with a class.

- **public** means this class is accessible from anywhere.

- **Main** is the name of the class, and it should match the filename (**Main.java**).
<br>


```java
public static void main(String[] args) {
```
- This is the main method, the entry point of any Java program.

- **public**: The method is accessible from anywhere.

- **static**: It belongs to the class and can be called without creating an object.

- **void**: It doesn't return any value.

- **main**: The name of the method that Java looks for to start execution.
<br>


```java
String[] args
```
- This accepts command-line arguments in the form of an array of Strings.
<br>


```java
System.out.println("Hello, World!");
```

- **System**: A built-in Java class that provides access to the system.

- **out**: A static member of System, representing the standard output stream (console).

- **println**: A method to print text to the console and move to a new line.

- "**Hello, World!**": The message that will be printed.
<br>


```java
}
```
- These closing braces mark the end of the method and class respectively.



