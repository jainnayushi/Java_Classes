package Daywise_Notes.Day8;

class House{
    static String house_color = "white";
    String room_color = "Yellow";

    // default Constructor
    public House(){
        System.out.println("Default Constructor Called");
    }

    // My own Constructor
    public House(String color){
        this.room_color = color;
        System.out.println("My Constructor Called");
    }

    // My own Constructor 2
    public House(String color, int x){
        this.room_color = color;
        System.out.println("My Constructor2 Called");
    }
}

public class Day8_InstanceStatic2 {
    public static void main(String[] args) {
        House sara2 = new House("black", 6); // My Constructor2 Called
        House sara = new House("red"); // My Constructor Called
        House ayushi = new House(); // Default Constructor Called

        System.out.println(sara2.room_color); // null
        System.out.println(sara.room_color);
        System.out.println(ayushi.room_color);




//        House.house_color="Pink";
//
//        sara.room_color ="yellow";
//        ayushi.room_color= "red";

    }
}
