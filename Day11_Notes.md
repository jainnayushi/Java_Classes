# Approach
1. Dummy Driver class - main()
2. Create parent and child without bodies
3. For a class - variables
4. Give access modifier to variables 
5. Create constructor
6. getters() and setters()
7. create methods
   
* `Overriding`

# `Multiple Inheritence NOT ALLOWED`

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

### Types of Polymorphism
1. Compile Polymorphism - Method Overloading
2. Runtime Polymorphism - Method Overriding

---

# JavaDoc Comments
---
 /**
     * Function to calculate and display area
     * @param l
     * @param w
     * @return nothing
     */
    public void area(int l,int w){
        System.out.println(l*w);
    }
    ---
