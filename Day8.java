package Daywise_Notes.Day8;

public class Day8 {
    // Properties
    int x1=10;
    static int x2=20;

    // Methods
    public void func1(){
        System.out.println("I am func1");
    }
    public static void func2(){
        System.out.println("I am func2");
    }

    public static void main(String[] args) {
        // Accessing Static Variable and Method
        System.out.println(Day8.x2);
        Day8.func2();
        func2();

        Day8 obj = new Day8();
        // Accessing Instance Variable and Method
        System.out.println(obj.x1);
        obj.func1();
    }
}
