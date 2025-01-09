## Comprehensive C++ Programming Documentation

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

Types of Functions:
1. Void Functions:
   - Do not return a value.
   - Syntax: void functionName() { }
2. Return Functions:
   - Execute an operation and return a value.
   - Return type must be specified.
   - Syntax: returnType functionName() { return value; }
3. Parameterized Functions:
   - Accept passed arguments to operate with different inputs.
   - Syntax: returnType functionName(parameterType parameterName) { }
4. Non-Parameterized Functions:
   - Do not accept any arguments.
   - Useful for performing a generic action.
   - Syntax: returnType functionName() { }

