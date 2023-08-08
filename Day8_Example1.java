package Daywise_Notes.Day8;

class A{
    int x = 12;
    static int y = 10;
}
public class Day8_Example1 {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();
        System.out.println(A.y);
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
//10
//12
//12