># 1. Basic

# Java
* Java is a programming language. 
* Java is a high level, robust, object-oriented and secure programming language.
* The `principles` for creating Java programming were "Simple, Robust, Portable, Platform-independent, Secured, High Performance, Multithreaded, Architecture Neutral, Object-Oriented, Interpreted, and Dynamic"
* Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year `1995`. `James Gosling` is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java.


# Java Basics
* We can  have only one public class in a single java file
* Name of the file should be same as the same of public class
* In absence of public class, any class name can be given to the file name
```js
// Sample.java

public class Sample {
    public static void main(String[] args) {
        System.out.println("Welcome to Java World");
    }
}
```
```js
// ABC.java

class Sample {
    public static void main(String[] args) {
        System.out.println("Welcome to Java World");
    }
}
```

* WORA - Write Once Run Anywhere
* Java code (.java) -> Compiler-Javac -> Byte Code(.class)
  
### Run Commands
```java
javac Hello.java
java Hello
or
java Hello.java
```


## Interpreter
* It is Responsible to Read Byte Code and Interpret (Convert) into Machine Code (Native Code) and Execute that Machine Code Line by Line. 
* `The Problem with Interpreter` is it Interprets Every Time Even the Same Method Multiple Times, which Reduces Performance of the System.
  
## JIT Compiler
* Just-In-Time compiler 
* Converts Byte code into machine code
* The Main Purpose of JIT Compiler is to Improve Performance. 
* Internally JIT Compiler Maintains a `Separate Count for Every Method` whenever JVM Come Across any Method Call. 
* First that Method will be interpreted normally by the Interpreter and JIT Compiler Increments the corresponding Count Variable. 
* `HOTSPOT` : JIT Compiler Identifies that Method Repeatedly used Method
* `Profiler` : Part of JIT Compiler is Responsible to IdentifY HOT SPOTS
* The Threshold Count Value varied from JVM to JVM.
* JIT is like Interpreter though is a compiler, It does not converts all the file in one go like compiler, but converts each line and while it is processed converts another line and stores like interpreter.
* Not in one go - unlike compiler but yet sends before fully converting
* Line by line - like interpreter but also keeps sending line as it converts and stores next
* `JVM Interprets Total Program Line by Line at least Once`. 
* `JIT Compilation` is Applicable Only for `Repeatedly invoked Methods`. But Not for Every Method. 


# <a id="JDK-JRE-JVM"></a> JDK, JRE, JVM
* JDK - Java Development Kit - `JRE + Tool` for Java lang - javac, jar | Physically exists
* JRE - Java Runtime Environment - `JVM + Inbuilt-extra libraries-classes` | Physically exists
* JVM - Java Virtual Machine - Virtual layer | `Code executes here` | Virtually exists
* All are platform dependent.
* Java is platform Independent.

# <a id="data-types"></a> Data Types
1. Integer
    - int : 4 bytes
    - long : 8 bytes
    - short : 2 bytes
    - byte : 1 bytes : 2^7 to 2^7-1 : -128 to 127
2. Float
    - float : 4 bytes : 5.6f
    - double : 8 bytes : 5.6
3. Character : 2 bytes | UNICODE
4. Boolean : Machine dependent | true/false | NO 0/1

# Extra
```java
// System.out.println(10/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
System.out.println(10/0.0); // Infinity
System.out.println(-10/0.0); // -Infinity

// System.out.println(0/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
System.out.println(0/0.0); // NaN : Undefined
System.out.println(0.0/0.0); // NaN : Undefined
System.out.println(-0.0/0.0); // NaN : Undefined

System.out.println(Float.NaN == Float.NaN ); // false 
System.out.println(Float.NaN != Float.NaN ); // true
```

# Literals
* int num = 0x7E : `Hexadecimal`
* int num1 = 0b101 : `Binary`
* int num2 = 10_00_00_000 :`_ For 0 seperation`
* int double num3= `12e10/1.2e11`
* long l=5854`l`;
* float f=5.8`f`;

```java
public class hello {
	public static void main(String[] args) {
		int num1=9;
		byte by=127;
		short sh=558;
		long l=5854l;
		
		float f=5.8f;
		double d=5.8;
		
		char c='k';
		
		boolean b=true;
	}
}
```