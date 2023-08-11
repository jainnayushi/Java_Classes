# Explain in 100 words
```java
package Daywise_Notes.Day8;

class House{
    static String house_color = "white";
    String room_color;

    // default Constructor
    public House(){
        System.out.println("Default Constructor Called");
    }

    // My own Constructor
    public House(String color){
        System.out.println("My Constructor Called");
    }

    // My own Constructor 2
    public House(String color, int x){
        System.out.println("My Constructor2 Called");
    }
}

public class Day8_InstanceStatic2 {
    public static void main(String[] args) {
        House sara2 = new House("black", 6);
        House sara = new House("black");
        House ayushi = new House();
    }
}

```
