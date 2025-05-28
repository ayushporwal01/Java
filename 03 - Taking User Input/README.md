# Taking User Input

In most programs, interacting with the user is essential. To make your Java programs dynamic and useful, you need a way to get input from the user during the program’s execution. This input can be anything—like a name, number, or choice—that your program will process and respond to.

Java provides easy-to-use tools for reading input from the keyboard, allowing you to capture data typed by the user. The most common way to do this is by using the `Scanner` class, which is part of the `util` package.
<br>
<br>

## What is **util** package?

- The `util` package is a part of the Java Standard Library.
- It contains utility classes that provide useful functions and data structures.

- Examples of classes in `util` package include:
    - Collections like **ArrayList**, **HashSet**, **HashMap**
    - Utility classes like **Date**, **Calendar**, **Random**
    - Classes for formatting, scanning, etc.
<br>

## What is the **Scanner** class?
- `Scanner` class is the part of `util` package.
- It is used to read input from various sources like:
   - Keyboard (console)
   - Files
   - Strings

- Contains methods like `nextInt()`, `nextLine()`, `nextDouble()`, etc., to read different types of input.
<br>


## Code Explanation

```java
  import java.util.Scanner;
```

- `import` is used to bring Java classes from libraries.
- `java.util.Scanner`
    - **java**: Top level package in java.
    - **util**: A subpackage inside java that contains utility classes.
    - **Scanner**: A class inside the `java.util` package used for reading input. 
<br>


```java
 Scanner sc = new Scanner(System.in); 
```
- Scanner: The class used to read input.
- sc: The variable name (an object of Scanner).
- new Scanner: Creates a new Scanner object.
- System.in: The standard input stream, usually the keyboard.
<br>


```java
 sc.close(); 
```

- sc: object of Scanner class.

- close()
   - A method of Scanner class.
   - Used to close the Scanner object and release resources.
            









