# Practice Documentation:
#### [Reference RoadMap](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2)

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
    - **Deque :** A double ended qsueue which allows insertion and removal from both ends.
    - **Map :** A interface that represents a collection of key-value pair. (hashMap, TreeMap)
  ### List:
  #### [ArrayList](ArrayListExample.java):
  - An ArrayList stores elements dynamically unlike an array which is a fixed ds. It's resizable/flexible as elements are added and removed.
  - The internal resizing is nothing but creating a new array(usually 1.5 times the old array) and copying the elements to it.
  - When an arrayList is created its internal capacity(the size of the array) by default is 10. The capacity here refers to the no of elements which can be stored before resizing.
  - Interger.valueOf(elemet) - wrapper class to convert it into object.
  - we can also add elements at a paticular index buy using add(index,value) or just add(element)
  - A method set can replace an element at given index- set(index,value)
  - We can do arrays.asList(); which returns list but not the parent interface (which is list)
  - We can again create a list using list.of(elements) but its an unmodified list.
  #### Time Complexity:
   - Adding element O(n) resizing worst case.
   - getting an element O(1)
   - Removing element is also O(n) again resizing
   - Iteration O(n)
  #### Comparotor:
   - Its an interface which helps us to do custom ordering - null is natural order which is asc.
   - It has a compare method in it which compares two objects and determines the order.
# Math functions:
- use Math.func() like Math.sqrt(16), Math.log(), Math.pow, Math.sqrt();
- Remember, While dealing with any kinds of integer type problems - check for limits of signed and unsigned of integer and make sure to check if the returned it over flowing or underflowing.
- if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
- Armstrong number is the a number whose sum of cubes of all digits is equal to the same number.
- We can copy a string n times using collections String result = String.join("", Collections.nCopies(n, str))
- Math.pow() returns double so don't forget to typecast while dealing with integers. 
- We can't reverse a string directly in java hence we have to use a StringBuilder -
StringBuilder name = new StringBuilder("string");
String reverse = name.reverse().toString();

# Hashing:
- HashMap in java collections.

# Arrays:
## Rotating an array:
- To rotate and array first reverse the whole array then reverse the first d elements and the rest d.

### Steps for Right Rotation

#### Step 1: Reverse the Entire Array
Start by reversing the entire array to temporarily position the elements that need to move to the front in their approximately correct positions, but in reverse order.

#### Step 2: Reverse the First `d = 3` Elements
Then, reverse the first three elements. This step corrects the order of the elements that were moved to the beginning in the first step.

#### Step 3: Reverse the Remaining `n - d` Elements
Finally, reverse the remaining elements. This corrects the order of the elements that need to stay but follow the elements moved to the front.

### Result
After performing the above steps, the array originally `[1, 2, 3, 4, 5, 6, 7]` transforms into `[5, 6, 7, 1, 2, 3, 4]` after 3 right rotations.

### Explanation
This method uses a series of reversals to manipulate the array's elements into their rotated positions efficiently:
- **Reversing the entire array** sets the stage by misaligning elements into a roughly correct position in a reversed order.
- **Reversing the first `d` elements** and **the remaining `n - d` elements** then neatly places all elements into their correct positions for the desired rotation effect. This technique ensures the process is space-efficient and completes in linear time.

# Moores Voting Algorithm:
- Moores algorithm is used to find the majority element in an array. Majority element is an element which appears more than n/2 times. We can use it for other thresholds aswell the algorithm lets you track k-1 elements for n/k threshold.
## Flow:
- A candidate and element to keep track.
- traverse the array if count = 0 take elements as a[i] and increment the element.
- and if element value == a[i] then increment or else decrement.
- Then verify the occurence by travsing and checking if its >n/2.
# Kadane's Algorithm:
- Algorithm used to find the subarray which gives largest sum. brute force is n^3 and better is n^2 this algo is optimal with time complexity as n.
## Flow:
- Travese the array only once and take sum = sum +a[i]
- max(sum,max)
- The intution is to leave the values which result in negative sums i.e if sum = 0 cut the subarray and start new from next making sum = 0;
- In the end we ignore the cases that takes sum to negative as going forward it will only decrease the sum.
Problems revisit: 
- [find all four sum numbers](https://www.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1)
- [Sliding window and hash](https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1)
- [arrays sum divisibility](https://www.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1)
- [check this at the end](https://www.geeksforgeeks.org/sde-sheet-a-complete-guide-for-sde-preparation/?itm_source=geeksforgeeks&itm_medium=main_header&itm_campaign=practice_header)

# SpringBoot:
- Spring is a java framework which lets you built java application.
- bootstrap spring applications.
- Spring(enterprise Appicaltion framework) - dependency injection, aspect oriented, mvc, security, reactive Programming ( just focus on building and let spring handle the other things).
- Programming and configuration model.
- Spring gives infrastructure support already can be leveraged.
- Prob? huge frameWork, multiple steps for setup and config and also multiple build and set up things.
- maven is the build and dependency management tool.
- Springboot creates a standalone application - scans the class, starts the tomcat server, creates servlets on it own but it does't exactly do anything until we specify the class with annotations (controller, .
  ## Controller: ( given this request what certain code should be excuted?) 
  - A java class with annotations lets spring know what url that its mapping to.
  - has info about what url access is triggred and what method to run.
  - A controller basically maps a uri/ a http request to a simple java class(a functionality).
- When building a restapi we have to analyse the resources - to build a contract.
- Can config our application properties in applications.properties.
### JPA : Java Persistence API:
- A specification that lets you do orm ( object relational mapping)
- When we get to work with relation databases we have use something like jdbc or run named query and map the results into our objects.
- But ORM lets us map our entity classes into database, we just provide some method data and framework handles it for us. JPA is a method to do so.
- Spring data JPA - 
