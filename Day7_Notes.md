# Methods

### Methods with If-else
```java
public class Main {

  static void checkAge(int age) {
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");
    } else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(20);
  }
}

// Outputs "Access granted - You are old enough!"
```

### Method Overloading 
* With method overloading, multiple methods can have the same name with different parameters
```java
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```
```java
static int plusMethodInt(int x, int y) {
  return x + y;
}

static double plusMethodDouble(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
// int : 13
// double : 10.56
```
* Instead of defining two methods that should do the same thing, it is better to overload one.
* In the example below, we overload the plusMethod method to work for both int and double:
```java
static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```
* `Multiple methods can have the same name as long as the number and/or type of parameters are different.`

### Java Scope
In Java, variables are only accessible inside the region they are created. This is called scope.

### Method Scope
Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared:
```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    int x = 100;

    // Code here can use x
    System.out.println(x);
  }
}
```

### Block Scope
A block of code refers to all of the code between curly braces {}.

Variables declared inside blocks of code are only accessible by the code between the curly braces, which follows the line in which the variable was declared:

```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

  // Code here CANNOT use x

  }
}

```
---

# OOPS 
* Object-oriented programming has several advantages over procedural programming:
* Object-oriented programming is about creating objects that contain both data and methods.
- OOP is faster and easier to execute
- OOP provides a clear structure for the programs
- OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
- OOP makes it possible to create full reusable applications with less code and shorter development time

### Classes and Objects
* A class is a `template/ blueprint` for objects, and an object is an `instance` of a class.
* When the individual objects are created, they inherit all the variables and methods from the class.

### Java Class Attributes
* Create obj : new
* Accessing : use `.`
```java
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
    // Modify the property
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```

### Multiple Objects - Instance v/s Static
* If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:
```java
public class Day7 {
    int x = 5;

    public static void main(String[] args) {
      Day7 myObj1 = new Day7();  // Object 1
      Day7 myObj2 = new Day7();  // Object 2
      myObj2.x = 25;
      System.out.println(myObj1.x);  // Outputs 5
      System.out.println(myObj2.x);  // Outputs 25
    }
}
```
* Same with Static
```java
public class Day7 {
    static int x = 5;

    public static void main(String[] args) {
      Day7 myObj1 = new Day7();  // Object 1
      Day7 myObj2 = new Day7();  // Object 2
      myObj2.x = 25;
      System.out.println(myObj1.x);  // Outputs 25
      System.out.println(myObj2.x);  // Outputs 25
      System.out.println(Day7.x);  // Outputs 25
    }
}
```
---

# Input from User
1. Scanner scan=new Scanner(System.in);
2. scan.nextInt() or nextFloat()..
3. scan.nextLine() for String
```java
Scanner scan=new Scanner(System.in);
//  reading value from user
System.out.print("Enter the number: ");
int num=scan.nextInt();
System.out.println(num);

System.out.print("Enter your name : ");
String str=scan.nextLine();
System.out.println(str);
```
