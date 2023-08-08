package Daywise_Notes.Day8;

class B{
    int x = 12;
    static int y = 10;
}
public class Day8_Example2 {
    public static void main(String[] args) {
        B obj1 = new B();
        B obj2 = new B();
        // Line 1
        B.y = 20;
        obj1.x = 50;
        System.out.println(B.y); // 20
        System.out.println(obj1.x); // 50
        System.out.println(obj2.x); //12
    }
}
// Till line 1
// B - x=12 , y=10
// obj1 - x=12 , y=10
// obj2 - x=12 , y=10

//After line 1
//    B - x=12 , y=20
//    obj1 - x=50 , y=20
//    obj2 - x=12 , y=20