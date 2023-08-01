* print v/s println

System.out.print(1) 
1|

System.out.println(1)
1
|

```java
        System.out.print(1);
        System.out.print(5);
        System.out.println(2);
        System.out.println();
        System.out.print(3);
//152
//
//3
```
* Initialization
* Condition
* Operation
  
1. While loop
```java
public class ExampleWhile{ 
    public static void main(String args[]){ 
        int a=10,b=20; 
        while(a<b) { 
            System.out.println("hello"); 
        } 
        System.out.println("hi"); 
    }
} 

// OUTPUT: 
// Hello (infinite times).
```

2. Do-While
```java
public class ExampleDoWhile{ 
    public static void main(String args[]){ 
    final int a=10,b=20; 
    do { 
        System.out.println("hello"); 
    } 
    while(a>b); 
        System.out.println("hi"); 
    }
} 

// Output: 
// Hello 
// Hi 
```

 // While loop
        1. Initialization
        while(2. Condition){    : It doesn't go in Infinite loop
            //statements
            3. Modify
        }

        // Do - While
        1. Initialization
        do{
            // Statements
            3. Modification
        }while(2. condition)

3. For 
```java
public class ExampleFor{ 
    public static void main(String args[]){ 
    int a=10,b=20; 
    for(int i=0;a<b;i++){ 
        System.out.println("hello"); 
    } 
    System.out.println("hi"); 
    }
} 
Output: 
Hello (infinite times). 
```

4. Enhanced For loop
![](2023-07-28-15-29-42.png)
```java
// For

int[] a = {10,20,30,40,50};
for(int i=0; i<a.length; i++){
    System.out.println(a[i]);
} 

// Enhanced For
int[] a = {10,20,30,40,50};
for(int x : a){
    System.out.println(x);
}

// 10 20 30 40 50
```

# Transfer Statements
1. Break
```java
class Test{ 
    public static void main(String args[]){ 
        for(int i=0; i<10; i++) { 
            if(i==5) 
                break; 
            System.out.println(i); 
        } 
    }
} 

// 0 1 2 3 4
```

2. Continue
```java
class Test{ 
    public static void main(String args[]){ 
        int x=2;
        for(int i=0; i<10; i++) { 
            if(i%x==0) 
                continue; 
            System.out.println(i); 
        } 
    }
} 

// 1 3 5 7 9
```

># <a id="Warapper-classes"></a>Wrapper Classes
* Are used to manipulate primitive values as objects.
* Are `final`.
* `Objects of wrapper classes are immutable`.
* Java is not said to be 100% Object Oriented due to its non-object primitive types.
* As a solution to this problem, Java allows us to `include the primitives in the family of objects` by using what are called as Wrapper classes.
* There is a wrapper class for every primitive data types in Java.
```java
int -> Integer
byte -> Byte
```
---

># <a id="package-import"></a> Packages and Import
* Its nothing more than the way we `organize files into different directories` according to their functionality, usability, category they should belong to!
* Different package have different functionality
* java.io - IO related, java.net - Network related
* Help us `avoid class name collision`
* Provides ease of maintenance, organization and increase collaboration among developers
* `import packageName.ClassName`
---
