* super() - Parent constructor
  
# OOPS - 3 Pillars -E, P, I

# Encapsulation
* To make sure that "sensitive" data hidden from users.
* To achieve this, you must:
1. Declare `class variables/attributes` as `private`
2. Provide Getters and Setters `public get and set methods`to access and update the value of a private variable

* Private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.
```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

// Outputs "John"
```

### Why Encapsulation?
* Better control of class attributes and methods
* Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
* Flexible: the programmer can change one part of the code without affecting other parts
* Increased security of data
---

# Java Inheritance (Subclass and Superclass)
* Inherit attributes and methods from one class to another

1. subclass (child) - the class that inherits from another class
2. superclass (parent) - the class being inherited from
* To inherit from a class, use the extends keyword.
```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car attribute

  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```
* We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.
* `Overriding`

### Why Inheritance
* It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

### The final Keyword and Inheritance
If you don't want other classes to inherit from a class, use the final keyword

---

# Java Polymorphism
* Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
* Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
* Sound() in animals and cat, dog..
```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("The Cat says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myCat = new Cat();  // Create a Cat object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myCat.animalSound();
    myDog.animalSound();
  }
}
```