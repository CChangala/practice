# Practice Documentation:

# Data Types and Input Handling:
- int: A datatype to store integer values. Example usage: int x = 10;
- long: Has a wider range than int, suitable for larger integer values. Example usage: long y = 100000;
- long long: Has a wider range than long, to store very large numbers. Example usage: long long z = 1000000000000;
- float: Used to store decimal numbers, less precise but with a smaller range than double. Example: float a = 10.5;
- double: Used to store decimal numbers, more precise and with a larger range than float. Example: double b = 10.5;
- char: Used to store a single character. Example usage: char c = 'A';
- string: Used to store a sequence of characters. Example usage: string d = "Hello";
  - Handling Whole Lines: To take "Hello World" as input in a single string variable, use getline(). It takes the entire line as input, including spaces.
    Syntax: string s; getline(cin, s); cout << "You entered: " << s << endl;

Note: Using cin >> for strings captures only up to the first whitespace. To capture entire lines with spaces, getline() should be used.

# Loop Syntax:
- for Loop: Utilized when the number of iterations is predetermined.
  Syntax: for (int i = 0; condition; increment/decrement/operation) { }
- while Loop: Preferable when the number of iterations is unknown, and only the termination condition is known.
  Syntax: while (condition) { }

# Functions:
- Functions are crucial for modularizing code to perform specific actions, enhancing readability, and adhering to the Single Responsibility Principle.

## Types of Functions:
1. ### Void Functions:
   - Do not return a value.
   - Syntax: void functionName() { }
2. ### Return Functions:
   - Execute an operation and return a value.
   - Return type must be specified.
   - Syntax: returnType functionName() { return value; }
3. ### Parameterized Functions:
   - Accept passed arguments to operate with different inputs.
   - Syntax: returnType functionName(parameterType parameterName) { }
4. ### Non-Parameterized Functions:
   - Do not accept any arguments.
   - Useful for performing a generic action.
   - Syntax: returnType functionName() { }
- In functions it is important to understand pass by value and pass by reference:
1. ### Pass by value:
   The acutal paramter is passed i.e the actual value is passed to a function and it uses a copy of it, it does not point to the memory of the variable. Hence, cannot be changed. The function creates a new instances of the variable while using.
2. ### Pass by reference:
   When you pass a parameter by reference, the function receives a reference (or a pointer) to the original variable. Changes to this parameter affect the original variable directly since both the parameter and the original variable refer to the same memory location. - array always goes with reference. apart from them we have to use & to let it know we are passing by reference.
----------------------------------
# Time Complexity:
- Time Complexity != Time taken
- The rate at which time taken increases with respect to the input size. This is when Big O comes in to the picture. 
- big O, teta, omega : best , avg, worst.
# Ascii values:
- Asci values start from 65 - A.
- We can convert ascii to string using (char)(65 or any ascii value)
- Suprisingly, we can run a for loop with a char datatype aswell.
# Java Collections
- A object that represents a group of objects, elements. And, Collection Frameworks help to manage collections ( interfaces and methods). 
- Before collections there were classes to maintain groups of elements like stacks, heaptable, vectors, etc. But there were few drawbacks and was difficult to handle.
   ### Drawbacks before collections:
     - **Inconsistency** : Each class had a different way of handling the collections leading confusion.
     - They couldn't work together or no generic method(no common interface).
- Collection framework is built mainly around multiple interfaces.
  ### Interfaces:
    - **Collection:** The root interface for all the collections in java.
    - **List :** A collection that can contain duplicates as well ( LinkedList, ArrayList).
    - **Set :** A collection that cannot have duplicate elements. ( HashSet, TreeSet).
    - **Queue :** A collection which is first in first out. (Priority Queue, Queue)
    - **Deque :** A double ended queue which allows insertion and removal from both ends.
    - **Map :** A interface that represents a collection of key-value pair. (hashMap, TreeMap)
   




