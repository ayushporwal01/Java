# Variables and Data Types in Java

# Introduction
In Java, variables are like labeled containers in your program's memory where you can store data values. These values can change while the program runs. Variables allow your program to keep track of information and use it as needed.

Every variable must have a data type, which tells Java what kind of data the variable can hold. Data types specify whether the data is text, numbers, true/false values, or single characters. 
<br>


## What Are Variables?
- Variables are used to store information that your program can manipulate.

- Each variable has a name that identifies it, and it stores a value.

- You can assign a value to a variable and later change it if needed.

- Variables help programs remember data like user input, calculations, or status flags.
<br>


## What Are Data Types?

- Data types define the kind of data a variable can store.

- Java has two categories of data types:
       
    ### 1. Primitive 
    - Built-In
    - Immutable, meaning their value cannot be changed once created.
    - Stored in the stack memory. 

    - **int**: Used to store whole numbers (without decimals).

    - **float**: Used to store decimal numbers with less precision. Float values require an f suffix to distinguish them.

    - **double**: Used to store decimal numbers with higher precision than float.

    - **boolean**: Stores logical values — either true or false.

    - **char**: Stores a single character, such as a letter or symbol.

    - **short**: Used to store small whole numbers (range: -32,768 to 32,767).  

    - **long**: Used to store very large whole numbers (range: ±9 quintillion).

    - **byte**: Used to store very small whole numbers (range: -128 to 127). 


    ### 2. Non-Primitive 
    - Reference Type - Instead of holding the actual value, it holds a reference (memory address) pointing to where the object is stored in memory.
    - Mutable, meaning their contents can be modified.
    - Stored in the heap memory.

    - **String**: Used to store sequences of characters, like words or sentences.

    - **Arrays**: Stores multiple values of the same type.

    - **Classes & Objects**: User-defined types to model real-world entities.

    - **Interfaces**: Used to achieve abstraction and multiple inheritance.

